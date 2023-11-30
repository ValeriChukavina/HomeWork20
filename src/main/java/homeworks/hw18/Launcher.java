package homeworks.hw18;

public class Launcher {
    public static void main(String[] args) {
        FizLitz ivanov = new FizLitz(500);
        ivanov.balance();
        YurLitz petrov = new YurLitz(10000);
        petrov.withdraw(1000);
        petrov.balance();
        IP sidorov = new IP(5000);
        sidorov.balance();
        sidorov.deposit(2000);
        sidorov.balance();
    }
}
