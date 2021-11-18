package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
    private int size;
    private E[] elements;
    MyStack(){
        Object[] newElement = new Object[1];
        elements = (E[]) newElement;
    }
    public void add(E e){
        if (size ==elements.length){
            elements = Arrays.copyOf(elements,elements.length*2);
        }
        elements[size] = e;
        size++;
    }
    public E pop(){
        Object[] newElement = new Object[elements.length-1];
        for (int i = 0; i < size; i++) {
            newElement[i] =elements[i];
        }
        E e = elements[size-1];
        elements =(E[]) newElement;
        size--;
        return e;
    }
    public E get(){
        if (size==0){
            throw new EmptyStackException();
        }
        return elements[size-1];
    }
    public boolean isEmpty(){
        if (size>0){
            return false;
        }return true;
    }
    public int size(){
        return this.size;
    }
    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]+ " \t");
        }
        System.out.println();
    }

}
