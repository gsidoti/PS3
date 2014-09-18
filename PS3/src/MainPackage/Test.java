package MainPackage;

public class Test extends Account {
	public static void main(String[] args) {

		Account test = new Account(1122, 20000, 4.5);

		test.deposit(3000);
		System.out.println("You have a balance of $" + test.getbalance()
				+ " after deposit");
		try {
			test.withdraw(2500);
			System.out.println("Balance after drawing $2500: "
					+ test.getbalance());

			System.out.println("Oh, you want to withdraw $1 Million");
			test.withdraw(1000000);
		} catch (InsufficientFundsException error) {
			System.out.println("You have tryed to pull $" + error.getAmount()
					+ " over your balance");
			error.printStackTrace();
		}
	}

}
