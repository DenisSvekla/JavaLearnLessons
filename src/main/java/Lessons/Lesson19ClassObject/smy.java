package Lessons.Lesson19ClassObject;

public class smy {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();
        System.out.println(book1 == book);
        System.out.println(book.equals(book1));
    }
}
