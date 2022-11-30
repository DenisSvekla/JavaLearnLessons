package Lessons.Lesson19ClassObject;

import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book();
        Class ourBiik = book.getClass();
        int modificators = ourBiik.getModifiers();
        System.out.println(modificators);
        System.out.println(Modifier.isFinal(modificators));
        System.out.println(Modifier.isPublic(modificators));
        System.out.println(Modifier.isAbstract(modificators));
        Modifier.isAbstract(modificators);
        Modifier.isPublic(modificators);
        Modifier.isFinal(modificators);

        System.out.println(Arrays.toString(ourBiik.getInterfaces()));



    }
}
