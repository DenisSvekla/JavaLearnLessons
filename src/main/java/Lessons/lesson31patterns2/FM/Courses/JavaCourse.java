package Lessons.lesson31patterns2.FM.Courses;

import Lessons.lesson31patterns2.FM.Developers.Developer;
import Lessons.lesson31patterns2.FM.Developers.JavaDeveloper;

public class JavaCourse extends Course {

    @Override
    Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
