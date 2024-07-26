package Lista;

public class ListaEncadeada{

    private Node head;

    //    → Adiciona o nó ao fim da lista.
    public void push(Node new_node) {
        if (head == null) {
            head = new_node;
        }
        new_node.setNext(head);
        head = new_node;
    }

    public Node pop() {
        if (head == null) {
            System.out.println("Lista está vazia");
            return null;
        }

        Node temp = head;
        head = head.getNext();
        temp.setNext(null); // Liberando a referência do nó removido
        return temp;
    }

    public void insert(Integer index, Node newNode){
            if (index < 0 || index > size()) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            if (index == 0) { // Insert at the beginning
                newNode.setNext(head);
                head = newNode;
                return;
            }
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) {
                    throw new IndexOutOfBoundsException("Invalid index");
                }
                current = current.getNext();
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }

    public void remove(Integer index) {
            if (index < 0 || index >= size()) {
                throw new IndexOutOfBoundsException("Índice inválido");
            }

            if (index == 0) { // Remover o primeiro nó
                head = head.getNext();
                return;
            }

            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }

    public Node elementAt(Integer index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;

    }

    public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.getVar() + " ");
            n = n.getNext();
        }
    }

}