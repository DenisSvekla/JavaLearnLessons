package Lessons.lesson31patterns2.AF.absFactories;

import Lessons.lesson31patterns2.AF.models.Bed;
import Lessons.lesson31patterns2.AF.models.Chair;
import Lessons.lesson31patterns2.AF.models.Sofa;
import Lessons.lesson31patterns2.AF.models.impl.paper.PaperBed;
import Lessons.lesson31patterns2.AF.models.impl.paper.PaperChair;
import Lessons.lesson31patterns2.AF.models.impl.paper.PaperSofa;

public class PaperFactory implements MebelFactory{
    @Override
    public Chair getChair() {
        return new PaperChair();
    }

    @Override
    public Sofa getSofa() {
        return new PaperSofa();
    }

    @Override
    public Bed getBed() {
        return new PaperBed();
    }
}
