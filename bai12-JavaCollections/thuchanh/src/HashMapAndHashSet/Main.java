package HashMapAndHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static  void main(String[] args) {
        Students student1 = new Students("Nam",20, "HN");
        Students student2 = new Students("Hung",21, "HN");
        Students  student3 = new Students("Ha",22, "HN");
        // write your code here
        Map<Integer, Students> studentMap = new HashMap<Integer, Students>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, Students> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Students> students = new HashSet<Students>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Students student : students){
            System.out.println(student.toString());
        }
    }
}
