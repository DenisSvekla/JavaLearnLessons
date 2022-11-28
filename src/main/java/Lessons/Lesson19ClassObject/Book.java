package Lessons.Lesson19ClassObject;

import java.util.Objects;

public class Book {

    public int countPage = 100;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countPage == book.countPage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countPage);
    }
}
