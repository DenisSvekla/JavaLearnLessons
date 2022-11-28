package Lessons.lesson15StreamApiOptional.StreamApi;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiMain {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);

        int[] sum = {12,3,4};

        //Страт
        // Stream.of(1,5,3,7,2)
        // numbers.stream()
        // Arrays.stream(num)

        //filter
      //  numbers.stream().filter(n-> n>10).forEach(System.out::println);

        //map позволяет принять что то одно, а передавать что то другое
       // numbers.stream().map(x-> Double.parseDouble(String.valueOf(x))).forEach(System.out::println);

        //distinct убирает дубликаты
       // numbers.stream().distinct().forEach(System.out::println);

        //limit устанавливает ограничение которые пропускает дальше
       // numbers.stream().limit(5).forEach(System.out::println);

        //sorted отсортировать принимает корпоратор
        //numbers.stream().sorted().forEach(System.out::println);


        //skip позволяет пропустить н-ое кол-во значений на старте
       // numbers.stream().skip(3).forEach(System.out::println);

       // numbers.stream().filter(number->number%2==0).sorted().distinct().limit(3).forEach(System.out::println);

        //возвращает первый
       // Optional<Integer> y = numbers.stream().filter(number->number%2==0).sorted().distinct().limit(3).findFirst();
        //Возвращает любое значение
       // Optional<Integer> d = numbers.stream().filter(number->number%2==0).sorted().distinct().limit(3).findAny();
        //count возвращает кол-во
      //  long count = numbers.stream().filter(number->number%2==0).sorted().distinct().limit(1).count();
       // System.out.println(count);

        //collect возвращает коллекцию
    //    ArrayList<Integer> listOfNumbers = (ArrayList) numbers.stream().filter(number->number%2==0).sorted().distinct().collect(Collectors.toList());
    //    System.out.println(listOfNumbers);

        //toArray преобразовывает в массив
        //  Integer[] array =(Integer[]) numbers.stream().filter(number->number%2==0).sorted().distinct().toArray();
        //max Возвращает макс значение
        Integer x =numbers.stream().filter(number->number%2==0).sorted().distinct().max(Integer::compareTo).get();
        System.out.println(x);






    }
}
