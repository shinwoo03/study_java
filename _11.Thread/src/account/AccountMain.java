package account;

public class AccountMain {
	public static void main(String[] args) {

		Account hong = new Account("홍길동", "11-22-333", 1000000);
		Account park = new Account("박명수", "44-55-666");
		ShareAccount share = new ShareAccount(hong, park);
		
		TransferAccount transfer = new TransferAccount(share);
		BalanceAccount balance = new BalanceAccount(share);
		
		transfer.start();
		balance.start();
		
	}

}
