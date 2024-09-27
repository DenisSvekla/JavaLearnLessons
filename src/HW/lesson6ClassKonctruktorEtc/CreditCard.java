package HW.lesson6ClassKonctruktorEtc;

public class CreditCard {

    int numberAccount;
    int currentSum;

    public CreditCard(int numberAccount, int currentSum) {
        this.numberAccount = numberAccount;
        this.currentSum = currentSum;
        System.out.println("Ваш счет создан");
    }

    public void plusSum (int plusSum) {
        currentSum = currentSum + plusSum;
        System.out.println("На Ваш счет зачислено " + plusSum);

    }

    public void minusSum (int minusSum) {
        if (currentSum< minusSum) {
            System.out.println("Недостаточно средств");
        } else {
            currentSum = currentSum - minusSum;
            System.out.println("С Вашего счета списано " + minusSum);
        }
    }
    public void getAllInfo() {
        System.out.println("Ваш номер карточки " + numberAccount);
        System.out.println("Текущее состояние счета " + currentSum);
    }


}
