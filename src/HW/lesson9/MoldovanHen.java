package HW.lesson9;

public class MoldovanHen extends Hen {

    public static int commonEggsMoldovanHen;

    public MoldovanHen(int age) {
        super(age);
        commonEggsMoldovanHen += getCountOfEggsPerMonth();
    }

    @Override
    int getCountOfEggsPerMonth() {
        if (super.getAge() == 0) {
            return 0;
        } else if (super.getAge() > 0 && super.getAge() <= 2) {
            return 6 * 30;
        } else {
            return 4 * 30;
        }
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Моя Страна Молдова. Я несу от 0 до 180 яиц в месяц";
    }
}
