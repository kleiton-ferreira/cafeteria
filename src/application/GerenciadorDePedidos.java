package application;


import java.util.PriorityQueue; // Importa PriorityQueue para a fila de pedidos

//Classe que gerencia os pedidos da cafeteria
public class GerenciadorDePedidos {
 private PriorityQueue<Pedido> filaDePedidos; // Fila de prioridade para pedidos

 // Construtor da classe GerenciadorDePedidos
 public GerenciadorDePedidos() {
     filaDePedidos = new PriorityQueue<>(); // Inicializa a fila de pedidos
 }

 // Adicionar um novo pedido
 public void adicionarPedido(String cliente, boolean isVIP) {
     if (cliente == null || cliente.trim().isEmpty()) {
         System.out.println("Nome do cliente não pode ser vazio."); // Validação simples
         return;
     }
     
     Pedido novoPedido = new Pedido(cliente, isVIP); // Cria um novo pedido
     filaDePedidos.add(novoPedido); // Adiciona o novo pedido à fila de prioridade
     System.out.println("Pedido adicionado: " + cliente + (isVIP ? " (VIP)" : "")); // Exibe mensagem de confirmação
 }

 // Processar o próximo pedido
 public void processarProximoPedido() {
     if (!filaDePedidos.isEmpty()) { // Verifica se a fila não está vazia
         Pedido proximo = filaDePedidos.poll(); // Remove e retorna o próximo pedido da fila
         System.out.println("Pedido processado: " + proximo.cliente); // Exibe o nome do pedido processado
     } else {
         System.out.println("Nenhum pedido para processar."); // Mensagem se a fila estiver vazia
     }
 }

 // Visualizar pedidos na fila
 public void visualizarPedidos() {
     System.out.println("Pedidos em espera:"); // Mensagem para indicar que os pedidos serão listados
     for (Pedido pedido : filaDePedidos) { // Itera sobre cada pedido na fila
         System.out.println("Cliente: " + pedido.cliente + (pedido.isVIP ? " (VIP)" : "")); // Exibe o cliente e se é VIP
     }
 }

 // Remover um pedido cancelado
 public void removerPedido(String cliente) {
     // Remove o pedido correspondente ao cliente cancelado da fila
     filaDePedidos.removeIf(pedido -> pedido.cliente.equals(cliente)); // Usa expressão lambda para encontrar e remover
     System.out.println("Pedido cancelado: " + cliente); // Exibe mensagem de confirmação do cancelamento
 }

 // Atualizar a prioridade do pedido na fila
 public void atualizarPrioridade(String cliente, boolean novaPrioridade) {
     Pedido pedidoExistente = null; // Inicializa uma variável para armazenar o pedido encontrado
     for (Pedido pedido : filaDePedidos) { // Itera sobre os pedidos na fila
         if (pedido.cliente.equals(cliente)) { // Verifica se o pedido corresponde ao cliente
             pedidoExistente = pedido; // Armazena o pedido encontrado
             break; // Sai do loop se o pedido for encontrado
         }
     }

     // Se o pedido existe na fila
     if (pedidoExistente != null) {
         filaDePedidos.remove(pedidoExistente); // Remove o pedido existente da fila
         adicionarPedido(cliente, novaPrioridade); // Re-adiciona o pedido com a nova prioridade
     } else {
         System.out.println("Pedido não encontrado: " + cliente); // Mensagem se o pedido não for encontrado
     }
 }
}