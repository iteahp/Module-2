package minitest.controller.service;


import minitest.controller.model.Students;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
    public final String FILE_PATH = "student.txt";
    List<Students> students = new ArrayList<>();

    public StudentService() {
        students = readFile(FILE_PATH);
    }
    public List<Students>findAll(){
        students = readFile(FILE_PATH);
        return students;
    }
    public void save(Students student){
        students.add(student);
        writer(FILE_PATH,students);
    }
    public void delete(int index){
        students.remove(index);
        writer(FILE_PATH,students);
    }
    public int findIndexByStudentCode(String studentCode){
        for (int i = 0; i < students.size(); i++) {
            if (studentCode.equals(students.get(i).getStudentCode())){
                return i;
            }
        }
        return -1;
    }
    public void edit(int index,Students student){
        students.set(index,student);
        writer(FILE_PATH,students);
    }
    public void writer(String filePath, List<Students> list){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i)+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public List<Students> readFile(String FILE_PATH) {
            List<Students> studentsList = new ArrayList<>();
            File file = new File(FILE_PATH);
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = br.readLine())!=null){
                    String[] str  = line.split(",");
                    String studentCode = str[0];
                    String name = str[1];
                    int age  = Integer.parseInt(str[2]);
                    String gender = str[3];
                    String address = str[4];
                    double score = Double.parseDouble(str[5]);
                    Students product = new Students(studentCode,name,age,gender,address,score);
                    studentsList.add(product);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return studentsList;
        }
    public void  sortUpScore (){
        Collections.sort(findAll(),new SortUpScore());
        writer(FILE_PATH,students);
    }
    public void  sortDownScore (){
        Collections.sort(findAll(),new SortDownScore());
        writer(FILE_PATH,students);

    }
}
