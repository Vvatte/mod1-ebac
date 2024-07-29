import Pilha.Pilha;

public class PilhaTest {

    public static void main(String[] args){
        Pilha pilha = new Pilha();

        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);

        pilha.printPilha();
        System.out.println("-------------");

        pilha.pop();

        pilha.printPilha();
        System.out.println("-------------");

        System.out.println(pilha.top());
        System.out.println("-------------");

        System.out.println(pilha.isEmpty());
        System.out.println("-------------");

        System.out.println(pilha.size());
        System.out.println("-------------");
    }
}
