package Lessons.lesson8_oop.task;
//Создать класс Build с одним полем type, геттером и сеттером. Создать 2-х наследников этого класса –
// House и Garage в которых при создании в конструкторе будет присваиваться в поле type значения “House” и “Garage” соответственно.
//В методе main создать объекты House и Garage классов. Продемонстрировать  значения полей этих классов используя геттеры.
public class Build {

    private String type;
    public String  getType() {
        return type;
    }

    public void setType(String  type) {
        this.type = type;
    }



}
