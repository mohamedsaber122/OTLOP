package otlob;
import java.util.Scanner;
public class Cash implements iPay{
    private static int cashOnHand;
    private static int amountIn;
    private static int cashback;
    Scanner a=new Scanner(System.in);
@Override
    public void payCash() {
        System.out.println("Enter the amount you will pay: ");
        cashOnHand=a.nextInt();
        
    }

    @Override
    public void payVisa() {
    }

    @Override
    public void payDebitCard() {
    }
}
