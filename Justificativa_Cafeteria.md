# Kleiton da Silva Ferreira / ATAL - Noite

# Sistema de Gerenciamento de Pedidos de uma Cafeteria

Para o sistema de gerenciamento de pedidos de uma cafeteria, a estrutura de dados mais adequada é a fila (Queue). Abaixo estão os motivos que justificam essa escolha.

## 1. Processamento em Ordem de Chegada
- A fila é uma estrutura de dados que opera no princípio FIFO (First In, First Out), o que significa que os pedidos que chegam primeiro são processados primeiro. Isso se alinha perfeitamente com a necessidade de atender os pedidos na ordem em que foram recebidos.

## 2. Priorização de Pedidos VIP
- Para lidar com pedidos de clientes VIP, uma solução prática é utilizar uma fila de prioridade (Priority Queue). Essa estrutura permite que você insira pedidos VIP de forma que eles sejam processados antes dos demais, mantendo a ordem de chegada dos pedidos normais.

## 3. Cancelamento de Pedidos
- A fila permite a remoção de elementos (pedidos) de forma eficiente. Quando um cliente cancela um pedido, você pode percorrer a fila para localizar e remover esse pedido. Embora isso exija um pouco mais de trabalho em uma fila simples, uma fila de prioridade pode facilitar esse processo, permitindo que você identifique e remova um pedido rapidamente.

## 4. Visualização dos Pedidos Pendentes
- A fila permite que você visualize todos os pedidos pendentes sem removê-los da estrutura. Isso pode ser feito iterando sobre os elementos da fila e imprimindo-os. Essa funcionalidade é essencial para que o gerente possa visualizar os pedidos em espera.

## Resumo da Estrutura de Dados
A escolha da fila, especificamente uma fila de prioridade, atende a todas as necessidades do sistema de gerenciamento de pedidos de uma cafeteria:
- Processamento em ordem de chegada
- Priorização de pedidos VIP
- Remoção de pedidos cancelados
- Visualização de pedidos pendentes
