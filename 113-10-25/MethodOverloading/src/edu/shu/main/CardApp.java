package  edu.shu.main;
import java.util.Scanner;
import edu.shu.A111222020.*;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards = {
                new CashCard("A001", 500, 0),
                new CashCard("A002", 300, 0),
                new CashCard("A003", 1000, 1),
                //new CashCard("A004", 2000, 2),
                //new CashCard("A005", 3000, 3)
        };

        Scanner input = new Scanner(System.in);

//        for(CashCard card : cards) {
//            System.out.printf("為(%s, %d, %d)儲值:",
//                    card.getNumber(), card.getBalance(), card.getBonus());
//
//            card.store(input.nextInt());
//
//            System.out.printf("明細(%s, %d, %d)%n",
//                    card.getNumber(), card.getBalance(), card.getBonus());
//        }
        for(int i =0 ;i<cards.length;i++){
            if(i%2==0){
                System.out.printf("為(%s, %d, %d)儲值:",
                        cards[i].getNumber(), cards[i].getBalance(), cards[i].getBonus());


                  card.store(input.nextInt());

                    System.out.printf("明細(%s, %d, %d)%n",
                            cards[i].getNumber(), cards[i].getBalance(), cards[i].getBonus());
            }
            else{
                System.out.printf("為(%s, %d, %d)扣款:",
                        cards[i].getNumber(), cards[i].getBalance(), cards[i].getBonus());

                  card.charge(input.nextInt());

                    System.out.printf("明細(%s, %d, %d)%n",
                            cards[i].getNumber(), cards[i].getBalance(), cards[i].getBonus());
            }
        }
    }
}
