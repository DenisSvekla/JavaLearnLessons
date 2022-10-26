package Lessons.lesson10StringBuilder;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append("123"); //добавить в конец
        stringBuilder.insert(2,stringBuilder);// добавляет с определенно индекса
        stringBuilder.delete(4,7); //удалить с .... по
        stringBuilder.deleteCharAt(0); //удалить символ по индексу
        stringBuilder.reverse(); //переворачивает строку обратно

        System.out.println(stringBuilder);
    }
}
