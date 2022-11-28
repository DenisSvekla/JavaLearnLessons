package Lessons.lesson17;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithRegex {
    public static void main(String[] args) {
        String line = " ";
        System.out.println(Arrays.toString(line.split("[0-9]{3}")));//regex выражения, первое что [какой разделитель]{кол-во}


        System.out.println("\n"); //переход на новую строку
        System.out.println("\t"); // табуляция

        //если используем буквенные символы
        System.out.println(Arrays.toString(line.split("[A-z]{3}")));// если будут совпадения c буквами три раза
        System.out.println(Arrays.toString(line.split("[^abc]{3}")));// если будут совпадения c буквами кроме указанных в разделителе

        //квантификаторы
        System.out.println(Arrays.toString(line.split("-?[0-9]{3}")));// в разделителе может быть, может не быть
        System.out.println(Arrays.toString(line.split("-?[0-9]+")));// в разделителе могут быть любое кол-во цифр и минус опционально
        System.out.println(Arrays.toString(line.split("[A-Z][a-z]+")));// Разделителем будет Слово начинающееся с большой буквы от
        // A-Z а остальные символы от a-z. Т.е. слово Car будет разделителем, а C1 нет также crt тоже

        String line1 = "Hello4444 world. So, which a1234 nice day today";

        //Pattern - класс в который записывается шаблон
        Pattern pattern = Pattern.compile("[0-9]{4}"); // в паттерн записываем шаблон на подобие regex

        //Matcher - класс для поиска куда мы должны передать паттерн
        Matcher matcher = pattern.matcher(line1);

        //star end показывает начало и вхождение разделителей
        while (matcher.find()){
           System.out.println(matcher.group());
            System.out.println(matcher.start() + " " + matcher.end());
        }

        // ReplaceAll заменяет разделители

        System.out.println(matcher.replaceAll("AAA"));
    }



    }

