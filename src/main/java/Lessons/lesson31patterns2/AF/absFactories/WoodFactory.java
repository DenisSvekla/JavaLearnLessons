package Lessons.lesson31patterns2.AF.absFactories;


import Lessons.lesson31patterns2.AF.models.Bed;
import Lessons.lesson31patterns2.AF.models.Chair;
import Lessons.lesson31patterns2.AF.models.Sofa;
import Lessons.lesson31patterns2.AF.models.impl.wood.WoodenBed;
import Lessons.lesson31patterns2.AF.models.impl.wood.WoodenChair;
import Lessons.lesson31patterns2.AF.models.impl.wood.WoodenSofa;

public class WoodFactory implements MebelFactory{
    @Override
    public Chair getChair() {
        return new WoodenChair();
    }

    @Override
    public Sofa getSofa() {
        return new WoodenSofa();
    }

    @Override
    public Bed getBed() {
        return new WoodenBed();
    }
}
