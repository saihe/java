
public class Main {
	static CashBook cb = new CashBook();

	public static void main(String[] args) {
		cb.addGoal(2015 , 1 , "3万円貯金");
		cb.addGoal(2015 , 2 , "家を買う");
		cb.addGoal(2015 , 3 , "100円貯金");
		System.out.println(cb.getAllGoal());
		System.out.println(cb.sortGoal());
	}

}
