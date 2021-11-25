package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
    private int size;
    private E[] elements;
    MyStack(){
        elements = (E[]) new  Object[1];
    }
    public void add(E e){
        if (size ==elements.length){
            elements = Arrays.copyOf(elements,elements.length*2);
        }
        elements[size] = e;
        size++;
    }
    public E pop(){
        E e = elements[size-1];
        elements[size-1] =null;
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
