package minitest.controller.service;

import minitest.controller.model.Students;


import java.util.Comparator;

public class SortDownScore implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        double sort =-1* (o1.getScore()-o2.getScore());
        return (int) sort;
    }
}
