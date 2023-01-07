
public class Main {
    public static void main(String[] args) {
   CreditCard creditCard1 = new CreditCard(20000 , "3143 6878 6381 2342");
        creditCard1.infoCard();
        CreditCard creditCard2 = new CreditCard(80000 , "1234 4124 4124 8989");
        creditCard2.infoCard();
        CreditCard creditCard3 = new CreditCard(10000 , "2334 4124 6554 6489");
        creditCard3.withdrawCard();
        creditCard1.infoBalance();
        creditCard2.infoBalance();
        creditCard3.infoBalance();
        }
    }
