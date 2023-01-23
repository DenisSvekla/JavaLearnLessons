package Lessons.lesson31patterns2.FM.Courses;

import Lessons.lesson31patterns2.FM.Developers.Developer;
import Lessons.lesson31patterns2.FM.Developers.PascalDeveloper;

public class PascalCourse extends Course{
    @Override
    Developer getDeveloper() {
        return new PascalDeveloper();
    }
}
