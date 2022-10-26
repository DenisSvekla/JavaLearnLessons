package Lessons.lesson10StringBuilder.task;

public class TaskStringDuilderStringBuffer {

    public static void main(String[] args) {
        String ddd= " Hi, my name is";
        StringBuilder sd = new StringBuilder(ddd);
        sd.append("xxxx");
        System.out.println(sd);
        sd.insert(5, 'y');
        System.out.println(sd);
        sd.delete(3,6);
        System.out.println(sd);
        sd.reverse();
        System.out.println(sd);

        String str = sd.toString();
        System.out.println(str);
    }

}
