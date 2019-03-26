package chapter19;

import java.util.ArrayList;

public class GenericStackComposition<E> {  // generic class

    private final ArrayList<E> list = new ArrayList<>();  // diamond operator

    public GenericStackComposition() {}  // no-arg constructor

    public ArrayList<E> getList() {return this.list;}  // getter

    public int getSize() {return this.getList().size();}

    public E peek() {return this.getList().get(this.getSize() - 1);}

    public void push(E o) {this.getList().add(o);}

    public E pop() {
        E o = this.getList().get(this.getSize() - 1);
        this.getList().remove(this.getSize() - 1);
        return o;
    }  // pop()

    public boolean isEmpty() {return this.getList().isEmpty();}

    @Override  // java.lang.Object.toString()
    public String toString() {return "stack: " + this.getList().toString();}

}  // class GenericStackComposition