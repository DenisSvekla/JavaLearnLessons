package Lessons.lesson31patterns2.AF.absFactories;

import Lessons.lesson31patterns2.AF.models.Bed;
import Lessons.lesson31patterns2.AF.models.Chair;
import Lessons.lesson31patterns2.AF.models.Sofa;

public interface MebelFactory {
    Chair getChair();

    Sofa getSofa();

    Bed getBed();
}
