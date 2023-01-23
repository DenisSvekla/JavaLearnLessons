package Lessons.lesson31patterns2.AF;

import Lessons.lesson31patterns2.AF.absFactories.MebelFactory;
import Lessons.lesson31patterns2.AF.absFactories.MetalFactory;
import Lessons.lesson31patterns2.AF.absFactories.PaperFactory;
import Lessons.lesson31patterns2.AF.absFactories.WoodFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String material = "paper";

        MebelFactory mebelFactory = getFactory(material);
        System.out.println("Вот ваше прекрасное кресло " + mebelFactory.getChair().getMaterial());
        System.out.println("Вот ваше прекрасная кровать " + mebelFactory.getBed().getMaterial());
        System.out.println("Вот ваше прекрасная диван " + mebelFactory.getSofa().getMaterial());
    }

    static MebelFactory getFactory(String material) {
        Map<String, MebelFactory> list = new HashMap<>();
        list.put("wood", new WoodFactory());
        list.put("metal", new MetalFactory());
        list.put("paper", new PaperFactory());

        return list.get(material);
    }
}