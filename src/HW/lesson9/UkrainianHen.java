package HW.lesson9;

public class UkrainianHen extends Hen {

    public static int commonEggsUkrainianHen;

    public UkrainianHen(int age) {
        super(age);
        commonEggsUkrainianHen += getCountOfEggsPerMonth();
    }

    @Override
    int getCountOfEggsPerMonth() {
        if (super.getAge() == 0) {
            return 0;
        } else if (super.getAge() > 0 && super.getAge() <= 2) {
            return 5 * 30;
        } else {
            return 4 * 30;
        }
    }

    @Override
    String getDescription() {
        return super.getDescription() + "Моя Страна Украина. Я несу от 0 до 150 яиц в месяц";
    }
}
