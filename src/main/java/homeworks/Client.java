package homeworks;

public abstract class Client {
    private int money = 0;
    public Client(int startingFunds) {
        this.money = startingFunds;
    }

    public int getMoney() {
        return money;
    }

    public void balance() {
        System.out.println("Your current balance: " + money);
    }
    public void deposit(int amount) {
        this.money = this.money + amount;
    }

    public void withdraw(int amount) {
        if (this.money < amount) {
            System.out.println("Fuck off");
        } else {
            this.money = this.money - amount;
            System.out.println("Operation successfull");
        }
    }





}