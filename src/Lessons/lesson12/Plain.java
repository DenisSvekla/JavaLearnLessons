package Lessons.lesson12;

import java.io.Serializable;

public class Plain implements Serializable {
    int countSits;
    double weight;
    String name;

    public Plain(int countSits, double weight, String name) {
        this.countSits = countSits;
        this.weight = weight;
        this.name = name;
    }
}
