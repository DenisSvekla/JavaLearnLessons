package Lessons.lesson31patterns2.FM.Courses;

import Lessons.lesson31patterns2.FM.Developers.Developer;

public abstract class Course {
    public void logic() {
        System.out.println("Преветствуем на курсе " + getDeveloper().getCourse());
        System.out.println("Вы выучите " + getDeveloper().getLanguage());
        System.out.println("Плюсы: " + getDeveloper().getPositiveSides());
        System.out.println("А МИНУСЫ: " + getDeveloper().getNegativeSides());
    }

    abstract Developer getDeveloper();
}
