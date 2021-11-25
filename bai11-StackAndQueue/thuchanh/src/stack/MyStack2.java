package stack;

import java.util.EmptyStackException;

public class MyStack2<E> {
    private int size ;
    Node<E> top;
    public MyStack2(Object data) {
        this.top =  new Node(data);
    }
    public void add(E e){
        Node node = new Node(e);
        node.next = top;
        top = node;
        size++;
    }
    public E pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }else {
            Node temp = new Node();
            temp = top;
            temp.next =top;
            return (E) temp;
        }


    }
    public E get(){
        return (E)top;
    }
    public boolean isEmpty(){
        if (size >=0){
            return false;
        }else return true;
    }
    public void show(){
        Node temp = top;
        for (int i = 0; i < size-1; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
