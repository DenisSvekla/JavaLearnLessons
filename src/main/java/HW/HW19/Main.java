package HW.HW19;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Users petya = new Users("Petya", 28);
        Users newPetya = (Users) petya.clone();

        System.out.println(petya.equals(newPetya));
        System.out.println(petya.hashCode());
        System.out.println(newPetya.hashCode());
        System.out.println(petya);
        System.out.println(newPetya);
    }
}
