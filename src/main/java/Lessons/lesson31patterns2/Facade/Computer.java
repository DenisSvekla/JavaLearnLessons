package Lessons.lesson31patterns2.Facade;

public class Computer {
    void readFromDvd(){
        Power power = new Power();
        DvdRom dvdRom = new DvdRom();
        SSD ssd = new SSD();

        power.on();
        dvdRom.open();
        dvdRom.close();
        ssd.read();
        power.off();
    }
}
