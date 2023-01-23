package Lessons.lesson31patterns2.FM.Courses;

import Lessons.lesson31patterns2.FM.Developers.CppDeveloper;
import Lessons.lesson31patterns2.FM.Developers.Developer;

public class CppCourse extends Course{

    @Override
    public void logic() {
        super.logic();
        System.out.println("NEW LOGIC");
    }

    @Override
    Developer getDeveloper() {
        return new CppDeveloper();
    }
}
