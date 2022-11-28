package Lessons.lesson15StreamApiOptional.Optional.Task;

import java.util.Optional;
import java.util.Scanner;

public class Task15 {
    //Создать класс User. В классе User должно быть поле name.
    //Используя класс Optional в main распечатать имя пользователя.
    // Если оно “null” то самим записать это имя через сканер в обьект user и вывести на экран.

    public static void main(String[] args) {

        User user = new User(null);
        Optional<String> checkName =  Optional.ofNullable(user.getName());

        checkName.ifPresentOrElse(
                System.out::println,
                ()->{user.setName(new Scanner(System.in).nextLine());
                    System.out.println(user.getName());
                });
    }
}
