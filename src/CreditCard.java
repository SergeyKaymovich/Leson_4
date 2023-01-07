import java.util.Scanner;

public class CreditCard {
    String number;
    int balance1;

    public  CreditCard(int balance1, String number) {
        this.balance1 = balance1;
        this.number = number;
    }

    int infoCard() {
        Scanner scanner = new Scanner(System.in);
            System.out.println(number+ "\nБаланс." + balance1);
            System.out.println("Для пополнения баланса введите сумму" + "\n" );
            int input = scanner.nextInt();
            int r = balance1 += input;
            System.out.println("Остаток на счёте: - " + r);
            return r;
    }
    int withdrawCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(number + "\nБаланс." + balance1);
        System.out.println("Для уменьшения баланса введите сумму" + "\n");
        int input = scanner.nextInt();
        int r = balance1 -= input;
        System.out.println("Остаток на счёте: - " + r);
        return r;
    }
    public void  infoBalance(){
        System.out.println( "Сумма на карте:  " + number);
        System.out.println(balance1);
    }
}
