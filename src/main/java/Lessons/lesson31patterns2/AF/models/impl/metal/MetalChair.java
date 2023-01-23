package Lessons.lesson31patterns2.AF.models.impl.metal;

import Lessons.lesson31patterns2.AF.models.Chair;

public class MetalChair implements Chair {
    @Override
    public String getMaterial() {
        return "metal";
    }
}
