package Lessons.lesson10StringBuilder;

public class MainMethidsString {
    public static void main(String[] args) {
        //складывание строк
        System.out.println("Hello" + "Hello");
        System.out.println("Hello".concat("World"));
        System.out.println(String.join(" ","Hello","World"));
        //сравнение строк
        System.out.println("hello".equalsIgnoreCase("hello"));
        System.out.println("hello".compareTo("hello"));// возвращает инт
        // преобразовывает в верхние и нижние регистры
        System.out.println("JAVA".toLowerCase());
        System.out.println("java".toUpperCase());
        //удаление пробелов по краям
        System.out.println("  java  ".trim());
        //замена символов
        System.out.println("I love you".toLowerCase().replace("i","m"));
        //повтор строчки
        System.out.println("Sasha".repeat(3));
        //Проверяет пустая строка иль нет если есть пробел, то даст фалс
        System.out.println("Alex".isEmpty());
        //Проверяет пустая строка иль нет, но в отличии от isEmpty, если там одни пробелы, то даст тру\
        System.out.println("   ".isBlank());
        //Проверяет начинается ли строка с таких символов
        System.out.println("Hello".startsWith("hel"));
        //Проверяет заканчивается ли строка с таких символов
        System.out.println("Hello".endsWith("o"));
        //работа с разделителем
        String line = "Hello111world111How111Are111You";
        String[] lines =  line.split("111");
        for(String e : lines) {
            System.out.println(e);
        }
        //Разбиение строки на массив символов
        System.out.println("Masha".toCharArray());

    }
}
