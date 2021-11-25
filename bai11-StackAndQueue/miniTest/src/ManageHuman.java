import java.util.*;

public class ManageHuman implements Manages {
  static   List<Students> list = new ArrayList<>();
  static   Scanner scanner = new Scanner(System.in);
  public Students create(){
      System.out.println("Nhập tên  :");
      String name = scanner.nextLine();
      System.out.println("Nhập tuổi :");
      int age = Integer.parseInt(scanner.nextLine());
      System.out.println("Nhập điểm trung bình ");
      double score = Double.parseDouble(scanner.nextLine());
      Students students =new Students(name,age,score);
      return students;
  }
    @Override
    public void add() {
      Students students = create();
        list.add(students);
    }

    @Override
    public void show() {
        for (Human human: list) {
            System.out.println(human.toString());
        }
    }

//    @Override
//    public Human searchName() {
//        return list.get(findName());
//    }

    public int findName() {
        System.out.println("Nhập tên người muốn tìm kiếm ");
        String name = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete() {
        int index = findId();
        if (index>=0)
        list.remove(index);

    }
    public int findId(){
        System.out.println("Nhập id  ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                return i;
            }
        }
        return  -1;
    }

    @Override
    public void edit() {

                int index = findId();
                if (list.get(index) instanceof Students){
                System.out.println("Nhập tên :");
                list.get(index).setName(scanner.nextLine());
                System.out.println("Nhập tuổi ");
                list.get(index).setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Nhập điểm");
                ((Students) list.get(index)).setScore(Integer.parseInt(scanner.nextLine()));

        }


    }

    @Override
    public void sort(List<Students> sortByScore) {
        Collections.sort(sortByScore);
        System.out.println("Sort by Score: "+sortByScore);
    }

//    @Override
//    public void sort(List sortByScore) {
//
//    }

//    @Override
//    public void sort(List<Students> sortByScore) {
//       Collections.sort(sortByScore);
//    }


    public double totalScore(){
      double sum =0;
        for (int i = 0; i < list.size(); i++) {

        }
        return sum;
    }
    public void menu(){
      while (true){
          System.out.println("Quản lý người ");
          System.out.println("1.Hiển thị người ");
          System.out.println("2.Thêm 1 người vào danh sách ");
          System.out.println("3.Tìm vị trí người trong danh sách ");
          System.out.println("4.Xóa 1 người trong danh sách theo mã");
          System.out.println("5.Sửa thông tin của người theo mã ");
          System.out.println("6.Sắp xếp danh sách theo điểm trung bình ");
          System.out.println("7.Tính tổng điểm ");
          System.out.println("Lựa chọn ");
          int choice = Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1 :
                  show();
                  break;
              case 2 :
                  add();
                  break;
              case 3 :
                  findName();
                  break;
              case 4 :
                  delete();
                  break;
              case 5 :
                  edit();
                  break;
              case  6 :
                  sort(list);
                  break;
              case 7 :
                  break;

          }
      }

    }

}
