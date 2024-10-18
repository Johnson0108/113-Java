
class CashCard {
    private String number;
    private int balance;
    private int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    String getNumber(){
        return this.number;
    }

    int getBalance(){
        return this.balance;
    }

    int getBonus(){
        return this.bonus;
    }

    void setNumber(String number){
        this.number = number;
    }

    void store(int money){
        if(money > 0){
            this.balance += money;
            if(money >= 1000){
                this.bonus += money/1000;
            }
        }
        else{
            System.out.println("儲值金額為負，來亂的!");
        }
    }

    void charge(int money){
        if(money > 0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else{
                System.out.println("錢不夠啦!");
            }
        }
        else{
            System.out.println("扣負數? 恐怕不行!");
        }
    }

    int exchange(int bonus){
        if(bonus > 0){
                this.bonus -= bonus;
        }
        return this.bonus;
    }
}