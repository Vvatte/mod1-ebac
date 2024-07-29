package Pilha;

 public class Pilha {
     private Node top;


     public boolean isEmpty() {
         return top == null;
     }


     public void push(int var) { // O(1) adiciona um elemento no topo da pilha
         Node newNode = new Node(var);
         newNode.setNext(top);
         top = newNode;
     }

     public int pop() { // O(1) remove o elemento do topo da pilha
         if (isEmpty()) {
             throw new RuntimeException("Pilha vazia");
         }
         int data = top.getVar();
         top = top.getNext();
         return data;
     }

     public int top() {
         if (isEmpty()) {
             throw new RuntimeException("Pilha vazia");
         }
         return top.getVar();
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

     public void printPilha() {
         Node node = top;
         while (node != null) {
             System.out.print(node.getVar() + " ");
             node = node.getNext();
         }
         System.out.println();
     }
 }

