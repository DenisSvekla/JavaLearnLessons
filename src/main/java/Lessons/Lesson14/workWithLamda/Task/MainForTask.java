package Lessons.Lesson14.workWithLamda.Task;

public class MainForTask {
    public static void main(String[] args) {
        ILambda lambdaAmoreThenB = (a,b) -> {
            if (a>b) {
                return a;
            } else if (a<b) {
                return b;
            } else {
                return 0;
            }
        };
        System.out.println(lambdaAmoreThenB.digits(4,5));
        System.out.println(lambdaAmoreThenB.digits(6,3));
        System.out.println(lambdaAmoreThenB.digits(5,5));


    }
}
