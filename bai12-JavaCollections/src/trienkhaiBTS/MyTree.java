package trienkhaiBTS;

public class MyTree <V>{
    int size;
    Node root;
    MyTree(){
        this.root = null;
    }
    public void add(int e){

        if (root==null){
            Node root = new Node(e);
            return;
        }
        if ( e < root.data){
            root = root.left;
            add(e);
        }
        if (e> root.data){
            root = root.right;
            add(e);
        }
    }
    public void show(){
        if (root==null){
            return;
        }

    }
}
