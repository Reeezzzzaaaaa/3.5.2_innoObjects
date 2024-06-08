package objects.task1;

public class Card {

    String cardNumber;

    public Card(String newCardNumber) {
        cardNumber = newCardNumber;

        if (cardNumber.length() == 19) {
            cardNumber = "**** **** **** " + cardNumber.substring(15);
        }
        else if (cardNumber.length() == 16) {

            cardNumber = "**** **** **** " + cardNumber.substring(12);
        } else {
            cardNumber = "Номер карты невалидный";
        }
    }
}
