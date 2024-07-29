public class FilaFifoTest {

    public static void main(String[] args){
        Fila.FilaFifo fila = new Fila.FilaFifo();

        fila.enqueue(2);
        fila.enqueue(4);
        fila.enqueue(6);

        fila.printList();

        fila.dequeue();
        fila.printList();

        System.out.println(fila.front());

        System.out.println(fila.rear());

        System.out.println(fila.size());

        System.out.println(fila.isEmpty());
    }

}
