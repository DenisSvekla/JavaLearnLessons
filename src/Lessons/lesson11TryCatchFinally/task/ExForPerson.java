package Lessons.lesson11TryCatchFinally.task;

public class ExForPerson extends Exception {


    public String toString(Person person) {
        return "Вы ввели возраст " + person.getAge() + " а минимальный 18 лет";
    }
}
