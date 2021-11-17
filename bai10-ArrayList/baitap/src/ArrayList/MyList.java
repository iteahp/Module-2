package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final  int DEFAULT_CAPACITY=10;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E element){
        if (size == elements.length) {
            ensureCapa();
        }

        for (int i = size+1; i >index ; i--) {
            elements[i]=elements[i-1];
        }
        elements[index] = element;
    }

    public E remove(int index){
        for (int i = index; i <elements.length ; i++) {
            elements[i] =elements[i+1];
        }
        return (E) elements;
    }
    public int size(){
        return size;
    }
    public E clone(){
        Object[] newElement = new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            newElement[i] = elements[i];
        }
        return (E) newElement;
    }
    public boolean contains (E o){
        int count =0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] ==o){
                count++;
            }
        }
        if (count!=0){
            return true;
        }return false;
    }
    public  int indexOf(E o){
        int index =0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o){
                index = i;
                break;
            }
        }
        return index;
    }
    public void ensureCapacity(int minCapacity){
        elements = Arrays.copyOf(elements,minCapacity+1);
    }
    public  E get(int i){
        return (E) elements[i];
    }
    public void clear (){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public boolean add(E e){
        if (size<elements.length){
            elements[elements.length-1] = e;
            return true;
        }return false;

    }

}
