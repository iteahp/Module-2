package minitest.controller.service;

import minitest.controller.model.Students;


import java.util.Comparator;

public class SortUpScore implements Comparator<Students> {


    @Override
    public int compare(Students o1, Students o2) {
        return (int) (o1.getScore()-o2.getScore());
    }
}
