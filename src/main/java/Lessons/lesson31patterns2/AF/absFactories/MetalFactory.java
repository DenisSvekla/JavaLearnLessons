package Lessons.lesson31patterns2.AF.absFactories;


import Lessons.lesson31patterns2.AF.models.Bed;
import Lessons.lesson31patterns2.AF.models.Chair;
import Lessons.lesson31patterns2.AF.models.Sofa;
import Lessons.lesson31patterns2.AF.models.impl.metal.MetalBed;
import Lessons.lesson31patterns2.AF.models.impl.metal.MetalChair;
import Lessons.lesson31patterns2.AF.models.impl.metal.MetalSofa;

public class MetalFactory implements MebelFactory{
    @Override
    public Chair getChair() {
        return new MetalChair();
    }

    @Override
    public Sofa getSofa() {
        return new MetalSofa();
    }

    @Override
    public Bed getBed() {
        return new MetalBed();
    }
}
