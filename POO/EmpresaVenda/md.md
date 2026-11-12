/\*

Uma empresa trabalha com vendas no atacado. Do ponto de vista da empresa, os clientes são
classificados em três categorias:

Regular, Sazonal e Eventual.

O cliente Regular compra todos os meses uma quantidade mínima de mercadorias. 

O cliente Sazonal compra em determinada época do ano, todos os anos. 

Já o cliente Eventual não tem uma época ou quantidade fixa de compras podendo eventualmente comprar uma única vez da empresa.

Para todos os clientes a empresa precisa manter um cadastro que contenha o nome e telefone do cliente e a data da última compra. 

Para os clientes Regulares, a empresa precisa manter em cadastro o valor mínimo em reais que o cliente compra mensalmente. 
Para os clientes Sazonais é preciso manter em cadastro o mês do ano que o cliente costuma comprar e também o valor mínimo em reais que é comprado nessa ocasião. 
Para os clientes Eventuais é armazenado apenas o valor da última compra.

Clientes Regulares têm direito a um desconto no valor da compra. A porcentagem do desconto também precisa estar armazenada no cadastro. 
Os clientes Sazonais não têm desconto, mas podem parcelar o pagamento em várias parcelas. 
A quantidade de parcelas é estabelecida pela gerência e também armazenada no cadastro. 

Clientes eventuais não têm direito a desconto e nem parcelamento. 

Construa uma hierarquia de classes que atenda as necessidades de registro da empresa sem duplicação de código. Para que as classes possam ser integradas ao sistema que já existe na empresa, é preciso que implementem a seguinte interface: 

public interface ClienteInt {
void RegistrarCompra(double Valor, String Data);
void AtribuirDesconto(double Porcent) throws DescontoInvExc;
void AtribuirParcelas(int NumParcelas) throws ParcelamentoInvExc;
void ImprimirDados();
}

void RegistrarCompra(double Valor, String Data);
    Método chamado quando ocorre uma venda.

void AtribuirDesconto(double Porcent) throws DescontoInvExc;
    Este método é usado para atribuir uma porcentagem de desconto para os clientes regulares. Se for chamado com clientes Sazonais ou Eventuais, a exceção DescontoInvExc é lançada. Também lança exceção se a porcentagem de desconto for maior que 20%.

void AtribuirParcelas(int NumParcelas) throws ParcelamentoInvExc;
    Este método é usado para atribuir o número de parcelas para os clientes Sazonais. Se for chamado com clientes Regulares ou Eventuais, a exceção ParcelamentoInvExc é lançada. Também lança exceção se a quantidade de parcelas for maior que 6.

void ImprimirDados(); Imprime todos os dados do cliente.
    Além dos métodos da interface, implemente também os seguintes métodos:

double AplicarDesconto(double Valor): Apenas para clientes Regulares. Recebe um valor no
    parâmetro e aplica o desconto estabelecido para o cliente. Retorna o valor já com o desconto.

double CalcularParcela(double Valor): Apenas para clientes Sazonais. Recebe um valor no
    parâmetro e retorna o valor de cada parcela.

