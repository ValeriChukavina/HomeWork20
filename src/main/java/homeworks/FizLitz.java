package homeworks;

public class FizLitz extends Client{
    public FizLitz (int startingFunds) {
        super(startingFunds);
    }

    @Override
    public void balance() {
        System.out.println("Current balance: " + super.getMoney());
    }
}
