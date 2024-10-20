package application;


//Classe que representa um pedido
class Pedido implements Comparable<Pedido> {
 String cliente; // Nome do cliente
 boolean isVIP; // Indica se o cliente é VIP

 // Construtor da classe Pedido
 public Pedido(String cliente, boolean isVIP) {
     this.cliente = cliente; // Inicializa o nome do cliente
     this.isVIP = isVIP; // Inicializa se o cliente é VIP
 }

 // Método para comparar pedidos para a fila de prioridade
 @Override
 public int compareTo(Pedido outro) {
     if (this.isVIP && !outro.isVIP) {
         return -1; // Este pedido é VIP e deve vir primeiro
     } else if (!this.isVIP && outro.isVIP) {
         return 1; // Este pedido não é VIP e deve vir depois
     } 
     return 0; // Ambos são VIP ou não VIP, mantém a ordem original
 }
}

