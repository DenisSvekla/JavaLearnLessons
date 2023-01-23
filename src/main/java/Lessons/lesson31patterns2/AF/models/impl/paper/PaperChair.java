package Lessons.lesson31patterns2.AF.models.impl.paper;

import Lessons.lesson31patterns2.AF.models.Chair;

public class PaperChair implements Chair {
    @Override
    public String getMaterial() {
        return "paper";
    }
}
