package Lessons.lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
//Написать метод который сможет вернуть все цифры из строки:“Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”
//
//Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1 задания.
//
//Написать метод который сможет вернуть инсту в строке из 1 задания.
//
//Написать метод который возвращает true если строка имеет вид “null”.
//
//В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
//
//В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!” найти имя и фамилию человека и вывести на экран!
    public static void main(String[] args) {
        String line = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        System.out.println(checkDigits(line));
        System.out.println(line);
        System.out.println(replaceSymbol(line));
        System.out.println(findInst(line));
        System.out.println(trueOrFalse(line));
        System.out.println(replaseSmth("Hello \n world \n !!!"));
        System.out.println(findNameAnd("Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!"));

        }


    public static ArrayList<Integer> checkDigits (String text) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(text);
        ArrayList<Integer> resultList = new ArrayList<>();
        while (matcher.find()) {
            resultList.add(Integer.parseInt(matcher.group()));
        }
        return resultList;
    }

    //Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1 задания.
    static String replaceSymbol (String text) {
        Pattern pattern = Pattern.compile("[A-z]");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll("&");
        return text;
    }

    //Написать метод который сможет вернуть инсту в строке из 1 задания.
    static String findInst(String text) {
        Pattern pattern = Pattern.compile("@[A-z]+");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        return matcher.group();
    }

    //Написать метод который возвращает true если строка имеет вид “null”.
    static Boolean trueOrFalse(String text) {
        Pattern pattern = Pattern.compile("null");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    //В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
    static String replaseSmth (String text) {
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(" ");
    }

    static String findNameAnd (String text) {
        Pattern pattern = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        return matcher.group();
    }


}
