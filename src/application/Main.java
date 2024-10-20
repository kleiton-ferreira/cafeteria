package application;

//Classe principal para executar o sistema
public class Main {
 public static void main(String[] args) {
     GerenciadorDePedidos gerenciador = new GerenciadorDePedidos(); // Cria um gerenciador de pedidos
     
     // Adiciona alguns pedidos
     gerenciador.adicionarPedido("Kleiton", true); // Pedido de Kleiton (VIP)
     gerenciador.adicionarPedido("Hugo", false); // Pedido de Hugo (não VIP)
     gerenciador.adicionarPedido("Sérgio", true); // Pedido de Sérgio (VIP)
     
     // Visualiza os pedidos em espera
     gerenciador.visualizarPedidos(); // Exibe pedidos na fila
     
     // Processa o próximo pedido
     gerenciador.processarProximoPedido(); // Processa o pedido VIP de Sérgio
     
     // Remover um pedido cancelado
     gerenciador.removerPedido("Hugo"); // Cancela o pedido de Hugo
     
     // Atualizar a prioridade de um pedido
     gerenciador.atualizarPrioridade("Sérgio", false); // Atualiza o pedido de Sérgio para não VIP
     
     // Visualiza os pedidos novamente
     gerenciador.visualizarPedidos(); // Exibe pedidos restantes na fila
 }
}