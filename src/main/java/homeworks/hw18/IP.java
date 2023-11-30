package homeworks.hw18;

public class IP extends Client {

   public IP(int startingFunds) {
      super(startingFunds);
   }

   @Override
   public void deposit(int amount) {
      if (amount < 1000) {
         super.deposit((int) (amount - 0.01 * amount));
      } else {
         super.deposit((int) (amount - 0.005 * amount));      }
   }
}
