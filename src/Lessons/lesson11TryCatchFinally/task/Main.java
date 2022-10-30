package Lessons.lesson11TryCatchFinally.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExForPerson {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextInt());
        try {
            if (person.getAge()<18) {
                throw new ExForPerson();
            }
        } catch (ExForPerson e) {
            System.out.println(e.toString(person));
        }
    }
}
