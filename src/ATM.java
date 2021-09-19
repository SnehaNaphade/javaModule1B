/* Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's
account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank
charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction
 */

public class ATM {
    public static void main(String[] args)
    {
        double x=120,y=120,c;
        if (x % 5 == 0 && y >= x + 0.5){
            c = y - (x + 0.5);
            System.out.println("Account balance:" +c);


            }
        else
            System.out.println("Account balance:" +y);



    }
}