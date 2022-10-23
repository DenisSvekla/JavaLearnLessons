package Lessons.lesson7_abstract_interface.abstraktClass;

public abstract class Build {
    int countOfRooms;

    int showRooms () {
        return countOfRooms;
    }

    abstract void build();
}
