package com.blit.day10;

import java.util.Comparator;

public class IdComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getId() - o2.getId();
    }
}
