package Lessons.lesson31patterns2.FM;

import Lessons.lesson31patterns2.FM.Courses.Course;
import Lessons.lesson31patterns2.FM.Courses.CppCourse;
import Lessons.lesson31patterns2.FM.Courses.JavaCourse;
import Lessons.lesson31patterns2.FM.Courses.PascalCourse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Course course = getCourse("Pascal");
        course.logic();
    }

    public static Course getCourse(String line) {
        Map<String, Course> courses = new HashMap<>();
        courses.put("Java", new JavaCourse());
        courses.put("Cpp", new CppCourse());
        courses.put("Pascal", new PascalCourse());

        return courses.get(line);
    }
}