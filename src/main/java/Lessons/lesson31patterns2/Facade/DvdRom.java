package Lessons.lesson31patterns2.Facade;

public class DvdRom {
    private boolean status;

    void open(){
        status = true;
    }

    void close(){
        status = false;
    }
}
