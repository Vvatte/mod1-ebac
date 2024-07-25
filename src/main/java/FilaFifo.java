import java.util.EmptyStackException;

public class FilaFifo <T> {

    private Integer[] elementos;

    private Integer first;

    private Integer last;

    private Integer var;

    public FilaFifo(Integer var){
        this.elementos = new Integer[6];
        this.first = 0;
        this.last = 0;
        this.var = var;
    }

    public void enqueue(){
        elementos[last] = var;
        last++;
    }

    public T dequeue(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        first--;
        return (T) elementos[first];
    }

    public T rear(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elementos[last];
    }

    public T front(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elementos[first];
    }

    public Integer size(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return last + 1;
    }

    public boolean isEmpty(){
        return last == 0;
    }
}
