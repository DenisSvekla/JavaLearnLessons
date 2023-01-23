package Lessons.lesson31patterns2.AF.models.impl.wood;

import Lessons.lesson31patterns2.AF.models.Chair;

public class WoodenChair implements Chair {
    @Override
    public String getMaterial() {
        return "Wooden";
    }
}
