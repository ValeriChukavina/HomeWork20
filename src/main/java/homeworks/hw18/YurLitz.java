package homeworks.hw18;

public class YurLitz extends Client {


   public YurLitz(int startingFunds) {
      super(startingFunds);
   }

   @Override
   public void withdraw(int amount) {
      super.withdraw((int) (amount * 0.01 + amount));
   }
}