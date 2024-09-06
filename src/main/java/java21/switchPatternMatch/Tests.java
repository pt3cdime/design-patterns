package java21.switchPatternMatch;

public class Tests {
	public static void main(String[] args){
		Account account = new TermAccount();
		System.out.println(getBalanceWithSwitchPattern(account));
		System.out.println(getBalanceWithOutSwitchPattern(account));
		System.out.println(processInputNew(null));
	}
	
	public static double getBalanceWithSwitchPattern (Account account) {
		double result = 0;
		switch (account) {
			case null -> throw new RuntimeException("Oops, account is null");
			case SavingsAccount sa -> result = sa.getSavings();
			case TermAccount ta -> result = ta.getTermAccount();
			case CurrentAccount ca -> result = ca.getCurrentAccount();
			default -> result = account.getBalance();
		};
		return result;
	}
	
	public static double getBalanceWithOutSwitchPattern(Account account) {
		double balance = 0;
		if(account instanceof SavingsAccount sa) {
			balance = sa.getSavings();
		}
		else if(account instanceof TermAccount ta) {
			balance = ta.getTermAccount();
		}
		else if(account instanceof CurrentAccount ca) {
			balance = ca.getCurrentAccount();
		}
		return balance;
	}
	
	public static String processInputNew(String input) {
		String output = null;
		switch(input) {
			case null -> output = "Oops, null";
			case String s when "Yes".equalsIgnoreCase(s) -> output = "It's Yes";
			case String s when "No".equalsIgnoreCase(s) -> output = "It's No";
			case String s -> output = "Try Again";
		}
		return output;
	}
	
}
