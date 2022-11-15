package Lessons.lesson15StreamApiOptional.Optional;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        String name = "Hello";
      //1. сделать обертку
        Optional<String> opt = Optional.empty();
        Optional<String> opti = Optional.of("Hello"); // если знаем что точно будет в объекте
        System.out.println(opti);
        Optional<String> checked = Optional.ofNullable(name);
//
//        //2. Работа с кодом
//        //ifPresentOrElse если есть используй, или если нет то...
//        checked.ifPresentOrElse(
//        x-> System.out.println(x), () -> System.out.println("Emtry")
//        );
//
//        //get() отдает само значение без обертки
//        System.out.println(checked.get());
//
//        //isPresent проверка на null
//        if (checked.isPresent()) {
//
//        }
//
//        //ifPresent если метод не null сделай то что  в скобках
//        checked.ifPresent(System.out::println);

        //filter() если условие выполняется
        System.out.println(checked.isPresent());
        System.out.println(checked = checked.filter(x-> x.length()<=5));
        System.out.println("Символы " + checked);
        System.out.println(checked.isPresent());
        //orEsle если объект не пустой то распечатает, еесли пустой, то распечатает "NONE"
        System.out.println(checked.orElse("NONE"));
        //orElseGet разница в том,что orElse просто дает зхначние get позволяет выполнить какие то лог операции
        //orElseThrow говорит какую ошщибку кидать. Если пустой оставить выкинуть NullPointerException
        checked.orElseThrow(()-> new RuntimeException());
        //map внутри обертки меняем тип
        checked.map(Double::valueOf);
    }
}
