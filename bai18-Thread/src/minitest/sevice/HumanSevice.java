package minitest.sevice;

import minitest.model.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HumanSevice implements IHuman {
    public static List<Human> humans  = new ArrayList<>();
    public final String  FILE_PATH  = "human.txt";
    @Override
    public List<Human> findAll() {
        readFromFile();
        return humans;
    }

    @Override
    public void save(Human human) {
        humans.add(human);
        writeToFile();
    }

    @Override
    public void delete(int index) {
        humans.remove(index);
        writeToFile();
    }
   public    Human edit(int index){
        writeToFile();
        return humans.get(index);

    }

    @Override
    public int findIndexByName(String name) {
        for (int i = 0; i < humans.size(); i++) {
                if (name.equals(humans.get(i).getName())){
                    return i;
                }
        }
        return -1;
    }

    public List<Human> readFromFile(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
            humans = (List<Human>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return humans;
    }
    public void writeToFile(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            oos.writeObject(humans);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
