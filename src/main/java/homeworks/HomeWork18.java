package homeworks;

public class HomeWork18 {
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
