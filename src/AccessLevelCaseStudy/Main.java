package AccessLevelCaseStudy;

public class Main {

    public static void main(String[] args) {

        Banktransaction ac=new Banktransaction();

        ac.creditbalance(1000);
                ac.debitbalance(200);

                double balance=ac.getBalance();

       // System.out.println("balance:"+balance);

       ac.debitbalance(700);
        System.out.println("balance:"+balance);

        ac.debitbalance(10000);
        System.out.println(+balance);




    }
}


/*
output;

Balance = 0.0
Crediting amount: 234.78
Debiting amount: 100.12
Balance = 134.66
Invalid credit amount: -234.9
Invalid debit amount: Infinity
Balance = 134.66
Insufficient fund. Debit attempted: 2000.0
Balance = 134.66
 */