package Lessons.lesson31patterns2.FM.Developers;

public class PascalDeveloper implements Developer {
    @Override
    public String getCourse() {
        return "Pascal";
    }

    @Override
    public String getLanguage() {
        return "PAscal";
    }

    @Override
    public String getPositiveSides() {
        return "Pascal++";
    }

    @Override
    public String getNegativeSides() {
        return "Pascal ---";
    }
}
