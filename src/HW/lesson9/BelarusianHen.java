package HW.lesson9;

public class BelarusianHen extends Hen {

    public static int commonEggsBelarusianHen;

    public BelarusianHen(int age) {
        super(age);
        commonEggsBelarusianHen += getCountOfEggsPerMonth();
    }

    @Override
    int getCountOfEggsPerMonth() {
        if (super.getAge() == 0) {
            return 0;
        } else if (super.getAge() > 0 && super.getAge() <= 2) {
            return 2 * 30;
        } else {
            return 5 * 30;
        }
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Моя Страна Беларусь. Я несу от 0 до 150 яиц в месяц";
    }
}
