package objects.task1;

public class CardNumber {

    public static void main(String[] args) {


        Card cardNumber1 = new Card("1234 5678 9012 3456");
        System.out.println(cardNumber1.cardNumber);

        Card cardNumber2 = new Card("1234567890123456");
        System.out.println(cardNumber2.cardNumber);

        Card cardNumber3 = new Card("1234 5678 9012 34562");
        System.out.println(cardNumber3.cardNumber);
    }
}
