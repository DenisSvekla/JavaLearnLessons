package Lessons.lesson11TryCatchFinally;

public class Main {
    public static void main(String[] args) throws MyException {
//        try {
//            int x =0;
//            int y = 10/x;
//        }
//        catch (Throwable e) {
//            System.out.println("Дай ошибку");
//        }
//
//        int[] x = new int[4];
//        try {
//            for (int i =0; i<6; i++){
//                System.out.println(x[i]);
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Ошибочка сынок");
//        }

        throw new  MyException();
    }
}
