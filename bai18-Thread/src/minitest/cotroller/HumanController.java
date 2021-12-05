package minitest.cotroller;

import minitest.model.Human;
import minitest.sevice.HumanSevice;

import java.util.List;

public class HumanController {
    HumanSevice humanSevice = new HumanSevice();
    public List<Human> show(){
        return humanSevice.findAll();
    }
    public void add(Human human){
        humanSevice.save(human);
    }
    public void delete(int index){
        humanSevice.delete(index);
    }
    public Human edit(int index){
       return humanSevice.edit(index);
    }
    public int findIndexByName(String name){
        return humanSevice.findIndexByName(name);
    }

}
