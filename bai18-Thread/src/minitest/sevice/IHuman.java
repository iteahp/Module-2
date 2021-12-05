package minitest.sevice;

import minitest.model.Human;

import java.util.List;

public interface IHuman {
        List<Human> findAll();
        void save(Human human);
        void delete(int index);
        Human edit(int index);
        int findIndexByName(String name);
}
