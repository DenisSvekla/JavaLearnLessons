package HW.lesson9;

public class RussianHen extends Hen {

    public static int commonEggsRussianHen;

    public RussianHen(int age) {
        super(age);
        commonEggsRussianHen += getCountOfEggsPerMonth();
    }

    @Override
    int getCountOfEggsPerMonth() {
        if (super.getAge() == 0) {
            return 0;
        } else if (super.getAge() > 0 && super.getAge() <= 2) {
            return 4 * 30;
        } else {
            return 3 * 30;
        }
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Моя Страна Россия. Я несу от 0 до 120 яиц в месяц";
    }
}
