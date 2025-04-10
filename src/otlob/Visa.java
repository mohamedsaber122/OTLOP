package otlob;
import java.io.Serializable;
import java.util.Scanner;
public class Visa implements iPay,Serializable {
private String cardHolderName;
    private String exp;

    @Override
    public void payCash() {
    }

    @Override
    public void payVisa() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Card Holder's name : ");
        this.cardHolderName = s.next();
        System.out.println("Enter Expire Date of the card : ");
        this.exp = s.next();
        System.out.println("Paid with visa!");
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public Visa(String cardHolderName, String exp) {
        this.cardHolderName = cardHolderName;
        this.exp = exp;
    }

    @Override
    public void payDebitCard() {
    }

}
