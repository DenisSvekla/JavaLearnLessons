package Lessons.lesson7_abstract_interface.abstraktClass;

public class Main {

    //Создать абстракный класс Computer и абстрактный метод getClassName(). Создать классы Hp и Mac и относледоваться от Computer.
    // Переопределить метод getClassName() в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac».
    //
    //В методе main класса Main создать объекты классов Hp Mac, и вызвать методы для каждого из этих объектов.
    public static void main(String[] args) {
        new Hp().getClassName();
        new Mac().getClassName();
    }
}
