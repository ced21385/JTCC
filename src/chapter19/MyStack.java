package chapter19;

import java.util.ArrayList;

public class MyStack {

    private ArrayList<Object> list = new ArrayList<Object>();

    public MyStack() {}  // no-arg constructor

    public boolean isEmpty() {return this.list.isEmpty();}

    public int getSize() {return this.list.size();}

    public Object peek() {return this.list.get(this.getSize() - 1);}

    public Object pop() {
        Object o = this.list.get(this.getSize() - 1);
        this.list.remove(this.getSize() - 1);
        return o;
    }  // pop()

    public void push(Object o) {this.list.add(o);}

    @Override  // java.lang.Object.toString()
    public String toString() {return "stack: " + this.list.toString();}

}  // class MyStack