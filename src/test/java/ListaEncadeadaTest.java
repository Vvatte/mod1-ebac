import Lista.ListaEncadeada;
import Lista.Node;

import java.util.LinkedList;

public class ListaEncadeadaTest {

    public static void main(String[] args){
        Node node = new Node(4);
        Node node1 = new Node(6);
        Node node2 = new Node(8);

        System.out.println(node);
        System.out.println(node1);
        System.out.println(node2);

        ListaEncadeada lista = new ListaEncadeada();

        lista.push(node);
        lista.insert(1, node2);
        lista.insert(2, node1);

        lista.pop();

        System.out.println("---------------");
        lista.printList();

        lista.insert(2, node1);
        lista.remove(1);

        System.out.println("---------------");
        lista.printList();

        lista.insert(2, node2);
        System.out.println(lista.elementAt(0));

        System.out.println("---------------");
        lista.printList();
    }
}
