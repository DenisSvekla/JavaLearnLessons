package Lessons.lesson10StringBuilder.task;

public class WorkWithString {


    public static void main(String[] args) {
        String line = "Hello";
        String line1 = "World";
        System.out.println(line.compareTo(line1));
        System.out.println(String.join(" ", line, line1));

        String first = "Hello";
        String second = "HELLO";
        System.out.println(first.equalsIgnoreCase(second));
        System.out.println(first.equals(second));

        System.out.println("MamaMia".substring(3));
        System.out.println(line.length());

        System.out.println(line.indexOf('l'));

        //7 skip

        Boolean qq = true;
        String ddas = qq + "";
        System.out.println(ddas);
        String dd = "1Привет1Родной";
        System.out.println(dd.replace('1','%'));

        System.out.println("  круть   ".trim());

        System.out.println( "   dd".isBlank());
        String[] ddds = "Драмма. Печать. Благада".split(". ");
        for (String e : ddds) {
            System.out.println(e);
        }
    }
}
