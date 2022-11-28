package Lessons.lesson7_abstract_interface;

public class Lada implements CommonCar {


    @Override
    public void on() {
        System.out.println("Заводим " );
    }

    @Override
    public void off() {
        System.out.println("Глушим ");
    }

    @Override
    public void turnLeft() {
        System.out.println("Поворачиваем на лево");
    }

    @Override
    public void turnRight() {
        System.out.println("Поворачиваем направо");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаем");
    }

    @Override
    public void gaz() {
        System.out.println("Разгоняемся");
    }
}
