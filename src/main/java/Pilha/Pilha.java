package Pilha;

import java.util.EmptyStackException;

public class Pilha <T> {

    private Integer[] elementos;

    private Integer topo;

    private Integer var;

    public Pilha(Integer var) {
        this.elementos = new Integer[10];
        this.topo = 0;
        this.var = var;
    }

    public void push() {
        elementos[topo] = var;
        topo++;
    }

    public T pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topo--;
        return (T) elementos[topo];
    }

    public boolean isEmpty(){
        return topo == 0;
    }

    public T top(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) elementos[topo - 1];
    }

    public Integer size(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return topo + 1;
    }

    public Integer[] getElementos() {
        return elementos;
    }

    public void setElementos(Integer[] elementos) {
        this.elementos = elementos;
    }

    public Integer getTopo() {
        return topo;
    }

    public void setTopo(Integer topo) {
        this.topo = topo;
    }

    public Integer getVar() {
        return var;
    }

    public void setVar(Integer var) {
        this.var = var;
    }


}
