import java.util.List;

public interface Manages {
    public  void show();
    public void add();
//    public E  searchName();
    public void delete();
    public void edit();
   void sort(List<Students> sortByScore);
}
