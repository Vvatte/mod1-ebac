package Lista;

public class ListaEncadeada{

    private Node top;

    public void push(Node new_node){ // este O(1)
        new_node.setNext(top); // O(1) aponta para o nó que era o topo da pilha antes
        top = new_node;// O(1) e agora este no passa a ser o novo topo elemento
    }

    public Node pop() {
        if (top == null) { // O(1) verifica se a elemento na lista
            System.out.println("Lista está vazia");// se estiver vazia returna que esta vazia
            return null;//
        }
        Node temp = top.getNext(); // O(1) pega o elemento que esta no final da fila
        temp.setNext(null);// O(1) Exclui o ùltimo elemnto da lista
        return temp; // O(1) retorta o elemento excluido
    }

    public void insert(Integer index, Node newNode){ //O(n)
            if (index < 0 || index > size()) { // O(1) verifica se o index informado é valido
                throw new IndexOutOfBoundsException("Invalid index");
            }
            if (index == 0) { // O(1) se for igual a 0 insere no inicio da fila
                newNode.setNext(top);
                top = newNode;
                return;
            }
            Node current = top;
            for (int i = 0; i < index - 1; i++) {// O(n) percorre a lista enquanto o i for menor ao index -1, verifica se a um elemeto antes do index fornecido.
                if (current == null) { // se for igual a nulo retorna um erro
                    throw new IndexOutOfBoundsException("Invalid index");
                }
                current = current.getNext();// pega o proximo elemento da variavel atual
            }

            newNode.setNext(current.getNext());// o novo node aponta para o proximo do atual
            current.setNext(newNode); // o node atual passa a apontar para o newNode
        }

    public void remove(Integer index) { // O(n)
            if (index < 0 || index >= size()) { // O(1) verifica se o index informado é valido
                throw new IndexOutOfBoundsException("Índice inválido");
            }

            if (index == 0) { // O(1) Remove o primeiro nó
                top = top.getNext();
                return;
            }
            Node current = top;
            for (int i = 0; i < index - 1; i++) { // O(n) percorre a lista enquanto o i for menor ao index -1, verifica se a um elemeto antes do index fornecido
                current = current.getNext(); // pega o proximo elemento da variavel atual
            }
            current.setNext(current.getNext().getNext());// coloca o proximo elemento do elemnto atual como sendo o elemento depois do index inserido
        }

    public Node elementAt(Integer index) { // O(n)
        if (index < 0 || index >= size()) { // O(1) verifica se o index informado é valido
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        Node current = top;
        for (int i = 0; i < index; i++) { // O(n) percorre a lista enquanto o i for menor ao index, verifica se a um elemeto antes do index fornecido
            current = current.getNext(); // pega o proximo elemento da variavel atual
        }
        return current; // O(1) retorna o elemento atual

    }

    public int size() {
            int count = 0;
            Node current = top;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }


    public void printList() {
        Node node = top;
        while (node != null) {
            System.out.print(node.getVar() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

}