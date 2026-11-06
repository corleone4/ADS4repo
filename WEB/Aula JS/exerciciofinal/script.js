let atividades = [];
let idEditando = null;
let total = document.getElementById('total');
let pendentes = document.getElementById('pendentes');
let concluidas = document.getElementById('concluidas');
let nomeAtividade = document.getElementById('nome-atividade');
let statusAtividade = document.getElementById('status-atividade');
let prioridadeAtividade = document.getElementById('prioridade-atividade');
let tBody = document.getElementById('tBody');

function salvar() {
    localStorage.setItem('atividades', JSON.stringify(atividades));
}

function carregar() {
    JSON.parse(localStorage.getItem('atividades'))?.forEach((atividade) => {
        atividades.push(atividade);
    });
}
carregar();
function adicionarAtividade() {
    const nome = nomeAtividade.value;
    if (!nome) return;

    if (statusAtividade.value === 'Selecione') {
        alert('Selecione um status para a atividade.');
        return;
    }

    const atividade = {
        id: Date.now(),
        nome: nome,
        status: statusAtividade.value,
        prioridade: prioridadeAtividade.value
    };

    atividades.push(atividade);
    salvar();
    nomeAtividade.value = '';
    statusAtividade.value = 'Selecione';
    prioridadeAtividade.value = 'Selecione';
    atualizarEstatisticas();
    atualizarTabela();
}

function atualizarEstatisticas() {
    total.textContent = atividades.length;
    pendentes.textContent = atividades.filter(a => a.status === 'pendente').length;
    concluidas.textContent = atividades.filter(a => a.status === 'concluida').length;

    tBody.innerHTML = '';
    atividades.forEach((atividade) => {
        tBody.innerHTML += `
            <tr>
                <td>${atividade.nome}</td>
                <td><span class="status ${atividade.status}">${atividade.status === 'pendente' ? 'Pendente' : atividade.status === 'em-andamento' ? 'Em andamento' : 'Concluída'}</span></td>
                <td><span class="prioridade ${atividade.prioridade}">${atividade.prioridade === 'baixa' ? 'Baixa' : atividade.prioridade === 'media' ? 'Média' : 'Alta'}</span></td>
                <td>
                    <button onClick="editarAtividade(${atividade.id})">Editar</button>
                    <button onClick="excluirAtividade(${atividade.id})">Excluir</button>
                </td>
            </tr>
        `;
    });
}

function editarAtividade(id) {
    const atividade = atividades.find(a => a.id === id);
    if (!atividade) return;

    nomeAtividade.value = atividade.nome;
    statusAtividade.value = atividade.status;
    idEditando = id;


}