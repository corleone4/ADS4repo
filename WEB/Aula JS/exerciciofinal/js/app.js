
const CHAVE_STORAGE = 'atividades';
const CHAVE_TEMA = 'tema';

const ROTULOS_SITUACAO = {
  pendente: 'Pendente',
  andamento: 'Em andamento',
  concluida: 'Concluída'
};

const ROTULOS_PRIORIDADE = {
  baixa: 'Baixa',
  media: 'Média',
  alta: 'Alta'
};

const ROTULOS_CATEGORIA = {
  estudo: 'Estudo',
  trabalho: 'Trabalho',
  pessoal: 'Pessoal'
};

const PESO_PRIORIDADE = { baixa: 1, media: 2, alta: 3 };

let atividades = [];  
let idEditando = null; 
let temporizadorMensagem = null;

const form = document.getElementById('form-atividade');
const campoTitulo = document.getElementById('titulo');
const campoDescricao = document.getElementById('descricao');
const campoCategoria = document.getElementById('categoria');
const campoPrioridade = document.getElementById('prioridade');
const campoData = document.getElementById('data-limite');
const campoSituacao = document.getElementById('situacao');
const erroTitulo = document.getElementById('erro-titulo');
const erroData = document.getElementById('erro-data');
const btnSalvar = document.getElementById('btn-salvar');
const btnCancelar = document.getElementById('btn-cancelar');
const tituloForm = document.getElementById('titulo-form');

const campoBusca = document.getElementById('busca');
const filtroSituacao = document.getElementById('filtro-situacao');
const filtroPrioridade = document.getElementById('filtro-prioridade');
const campoOrdenacao = document.getElementById('ordenacao');

const listaAtividades = document.getElementById('lista-atividades');
const listaVazia = document.getElementById('lista-vazia');
const caixaMensagem = document.getElementById('mensagem');
const btnTema = document.getElementById('btn-tema');

const statTotal = document.getElementById('stat-total');
const statPendentes = document.getElementById('stat-pendentes');
const statAndamento = document.getElementById('stat-andamento');
const statConcluidas = document.getElementById('stat-concluidas');

function salvarAtividades() {
  localStorage.setItem(CHAVE_STORAGE, JSON.stringify(atividades));
}

function carregarAtividades() {
  const dados = localStorage.getItem(CHAVE_STORAGE);
  if (!dados) {
    atividades = [];
    return;
  }
  try {
    const lista = JSON.parse(dados);
    atividades = Array.isArray(lista) ? lista : [];
  } catch (erro) {
    atividades = [];
  }
}

function gerarId() {
  return Date.now().toString(36) + Math.random().toString(36).slice(2, 7);
}

function hojeISO() {
  const agora = new Date();
  const ano = agora.getFullYear();
  const mes = String(agora.getMonth() + 1).padStart(2, '0');
  const dia = String(agora.getDate()).padStart(2, '0');
  return `${ano}-${mes}-${dia}`;
}

function formatarData(dataISO) {
  if (!dataISO) return '';
  const [ano, mes, dia] = dataISO.split('-');
  return `${dia}/${mes}/${ano}`;
}

function estaVencida(atividade) {
  return atividade.situacao !== 'concluida' && atividade.dataLimite < hojeISO();
}

function mostrarMensagem(texto, tipo) {
  caixaMensagem.textContent = texto;
  caixaMensagem.className = `mensagem mensagem--${tipo}`;
  caixaMensagem.hidden = false;

  clearTimeout(temporizadorMensagem);
  temporizadorMensagem = setTimeout(() => {
    caixaMensagem.hidden = true;
  }, 4000);
}

function limparErros() {
  erroTitulo.textContent = '';
  erroData.textContent = '';
  campoTitulo.classList.remove('invalido');
  campoData.classList.remove('invalido');
}

function validarFormulario() {
  limparErros();
  let valido = true;

  if (campoTitulo.value.trim() === '') {
    erroTitulo.textContent = 'Informe o título da atividade.';
    campoTitulo.classList.add('invalido');
    valido = false;
  }

  if (campoData.value === '') {
    erroData.textContent = 'Informe a data limite.';
    campoData.classList.add('invalido');
    valido = false;
  }

  return valido;
}

function lerDadosDoFormulario() {
  return {
    titulo: campoTitulo.value.trim(),
    descricao: campoDescricao.value.trim(),
    categoria: campoCategoria.value,
    prioridade: campoPrioridade.value,
    dataLimite: campoData.value,
    situacao: campoSituacao.value
  };
}

function tratarSubmit(evento) {
  evento.preventDefault();

  if (!validarFormulario()) {
    mostrarMensagem('Corrija os campos obrigatórios antes de salvar.', 'erro');
    return;
  }

  const dados = lerDadosDoFormulario();

  if (idEditando === null) {
    const novaAtividade = { id: gerarId(), ...dados };
    atividades.push(novaAtividade);
    mostrarMensagem('Atividade cadastrada com sucesso!', 'sucesso');
  } else {

    atividades = atividades.map((a) =>
      a.id === idEditando ? { ...a, ...dados } : a
    );
    mostrarMensagem('Atividade atualizada com sucesso!', 'sucesso');
  }

  salvarAtividades();
  sairDoModoEdicao();
  atualizarTela();
}

function entrarNoModoEdicao(id) {
  const atividade = atividades.find((a) => a.id === id);
  if (!atividade) return;

  idEditando = id;
  campoTitulo.value = atividade.titulo;
  campoDescricao.value = atividade.descricao;
  campoCategoria.value = atividade.categoria;
  campoPrioridade.value = atividade.prioridade;
  campoData.value = atividade.dataLimite;
  campoSituacao.value = atividade.situacao;

  tituloForm.textContent = 'Editar atividade';
  btnSalvar.textContent = 'Salvar alterações';
  btnCancelar.hidden = false;
  limparErros();

  atualizarTela();
  form.scrollIntoView({ behavior: 'smooth', block: 'start' });
  campoTitulo.focus();
}

function sairDoModoEdicao() {
  idEditando = null;
  form.reset();
  limparErros();
  tituloForm.textContent = 'Nova atividade';
  btnSalvar.textContent = 'Adicionar atividade';
  btnCancelar.hidden = true;
}

function cancelarEdicao() {
  sairDoModoEdicao();
  atualizarTela();
  mostrarMensagem('Edição cancelada.', 'info');
}

function excluirAtividade(id) {
  const atividade = atividades.find((a) => a.id === id);
  if (!atividade) return;

  const confirmado = confirm(`Deseja realmente excluir a atividade "${atividade.titulo}"?`);
  if (!confirmado) return;

  atividades = atividades.filter((a) => a.id !== id);
  salvarAtividades();

  if (idEditando === id) {
    sairDoModoEdicao();
  }

  atualizarTela();
  mostrarMensagem('Atividade excluída com sucesso.', 'sucesso');
}

function obterAtividadesVisiveis() {
  const termo = campoBusca.value.trim().toLowerCase();
  const situacao = filtroSituacao.value;
  const prioridade = filtroPrioridade.value;
  const ordem = campoOrdenacao.value;

  const filtradas = atividades
    .filter((a) => a.titulo.toLowerCase().includes(termo))
    .filter((a) => situacao === 'todas' || a.situacao === situacao)
    .filter((a) => prioridade === 'todas' || a.prioridade === prioridade);

  return [...filtradas].sort((a, b) => {
    if (ordem === 'data') {
      return a.dataLimite.localeCompare(b.dataLimite);
    }
    if (ordem === 'prioridade') {
      return PESO_PRIORIDADE[b.prioridade] - PESO_PRIORIDADE[a.prioridade];
    }
    return a.titulo.localeCompare(b.titulo, 'pt-BR', { sensitivity: 'base' });
  });
}

function atualizarEstatisticas() {
  statTotal.textContent = atividades.length;
  statPendentes.textContent = atividades.filter((a) => a.situacao === 'pendente').length;
  statAndamento.textContent = atividades.filter((a) => a.situacao === 'andamento').length;
  statConcluidas.textContent = atividades.reduce(
    (total, a) => (a.situacao === 'concluida' ? total + 1 : total),
    0
  );
}

function criarElemento(tag, texto, classe) {
  const elemento = document.createElement(tag);
  if (texto !== undefined) elemento.textContent = texto;
  if (classe) elemento.className = classe;
  return elemento;
}

function criarSelo(texto, tipo, valor) {
  return criarElemento('span', texto, `selo selo--${valor}`);
}

function criarBotao(texto, acao, id, classeExtra) {
  const botao = criarElemento('button', texto, `btn btn--pequeno ${classeExtra}`);
  botao.type = 'button';
  botao.dataset.acao = acao;
  botao.dataset.id = id;
  return botao;
}

function criarLinha(atividade) {
  const linha = document.createElement('tr');

  if (atividade.situacao === 'concluida') linha.classList.add('concluida');
  if (estaVencida(atividade)) linha.classList.add('vencida');
  if (atividade.id === idEditando) linha.classList.add('editando');


  const celulaTitulo = document.createElement('td');
  celulaTitulo.appendChild(criarElemento('strong', atividade.titulo, 'titulo-atividade'));
  if (atividade.descricao) {
    celulaTitulo.appendChild(criarElemento('span', atividade.descricao, 'descricao'));
  }

  const celulaCategoria = criarElemento('td', ROTULOS_CATEGORIA[atividade.categoria] || atividade.categoria);

  const celulaPrioridade = document.createElement('td');
  celulaPrioridade.appendChild(
    criarSelo(ROTULOS_PRIORIDADE[atividade.prioridade], 'prioridade', atividade.prioridade)
  );

  const celulaData = criarElemento('td', formatarData(atividade.dataLimite));
  if (estaVencida(atividade)) {
    celulaData.appendChild(criarElemento('span', 'Vencida', 'aviso-vencida'));
  }

  const celulaSituacao = document.createElement('td');
  celulaSituacao.appendChild(
    criarSelo(ROTULOS_SITUACAO[atividade.situacao], 'situacao', atividade.situacao)
  );

  const celulaAcoes = document.createElement('td');
  const divAcoes = criarElemento('div', undefined, 'acoes-linha');
  divAcoes.appendChild(criarBotao('Editar', 'editar', atividade.id, 'btn--secundario'));
  divAcoes.appendChild(criarBotao('Excluir', 'excluir', atividade.id, 'btn--perigo'));
  celulaAcoes.appendChild(divAcoes);

  linha.append(
    celulaTitulo,
    celulaCategoria,
    celulaPrioridade,
    celulaData,
    celulaSituacao,
    celulaAcoes
  );

  return linha;
}

function renderizarLista() {
  const visiveis = obterAtividadesVisiveis();

  while (listaAtividades.firstChild) {
    listaAtividades.removeChild(listaAtividades.firstChild);
  }

  visiveis.map(criarLinha).forEach((linha) => listaAtividades.appendChild(linha));

  if (visiveis.length === 0) {
    listaVazia.hidden = false;
    listaVazia.textContent = atividades.length === 0
      ? 'Nenhuma atividade cadastrada ainda.'
      : 'Nenhuma atividade encontrada com os filtros atuais.';
  } else {
    listaVazia.hidden = true;
  }
}

function atualizarTela() {
  atualizarEstatisticas();
  renderizarLista();
}

function aplicarTema(escuro) {
  document.body.classList.toggle('escuro', escuro);
  btnTema.textContent = escuro ? 'Modo claro' : 'Modo escuro';
}

function alternarTema() {
  const escuro = !document.body.classList.contains('escuro');
  aplicarTema(escuro);
  localStorage.setItem(CHAVE_TEMA, escuro ? 'escuro' : 'claro');
}

form.addEventListener('submit', tratarSubmit);             
btnCancelar.addEventListener('click', cancelarEdicao);         
btnTema.addEventListener('click', alternarTema);               

campoBusca.addEventListener('input', renderizarLista);         
filtroSituacao.addEventListener('change', renderizarLista);   
filtroPrioridade.addEventListener('change', renderizarLista); 
campoOrdenacao.addEventListener('change', renderizarLista); 

campoTitulo.addEventListener('input', () => {
  campoTitulo.classList.remove('invalido');
  erroTitulo.textContent = '';
});
campoData.addEventListener('change', () => {
  campoData.classList.remove('invalido');
  erroData.textContent = '';
});

listaAtividades.addEventListener('click', (evento) => {
  const botao = evento.target.closest('button[data-acao]');
  if (!botao) return;

  const id = botao.dataset.id;
  if (botao.dataset.acao === 'editar') entrarNoModoEdicao(id);
  if (botao.dataset.acao === 'excluir') excluirAtividade(id);
});

function iniciar() {
  aplicarTema(localStorage.getItem(CHAVE_TEMA) === 'escuro');
  carregarAtividades();
  atualizarTela();
}

iniciar();
