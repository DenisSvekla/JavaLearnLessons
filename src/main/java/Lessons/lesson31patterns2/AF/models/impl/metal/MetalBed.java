package Lessons.lesson31patterns2.AF.models.impl.metal;

import Lessons.lesson31patterns2.AF.models.Bed;

public class MetalBed implements Bed {
    @Override
    public String getMaterial() {
        return "metal";
    }
}
