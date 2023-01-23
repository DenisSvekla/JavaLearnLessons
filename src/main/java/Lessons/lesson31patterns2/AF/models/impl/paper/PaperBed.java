package Lessons.lesson31patterns2.AF.models.impl.paper;

import Lessons.lesson31patterns2.AF.models.Bed;

public class PaperBed implements Bed {
    @Override
    public String getMaterial() {
        return "paper";
    }
}
