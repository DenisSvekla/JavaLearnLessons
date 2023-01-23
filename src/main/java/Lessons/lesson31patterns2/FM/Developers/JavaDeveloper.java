package Lessons.lesson31patterns2.FM.Developers;


public class JavaDeveloper implements Developer {
    @Override
    public String getCourse() {
        return "Java";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public String getPositiveSides() {
        return "Cross,mnogopot etc";
    }

    @Override
    public String getNegativeSides() {
        return "NO!";
    }
}
