package sec01.exam01;

import java.util.Scanner;

class BankAccount{
	private String name;
	private String account;
	private int balance;
	
	public BankAccount(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
	void deposit(int balance) {
		this.balance += balance;
	}
	
	void withdraw(int balance) {
		this.balance -= balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

public class Num7 {

	public static void main(String[] args) {
//		String name = "홍길동";
//		String account = "H1234";
		boolean run = true;
		boolean login = false;
		boolean signup = true;
//		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		BankAccount ba = new BankAccount("홍길동", "H1234", 10000);
		
		while (run) {
			while (!login) {
				System.out.println("--------------------------------");
				System.out.println("1.로그인  |  2.회원가입  | 3.종료");
				System.out.println("--------------------------------");
				System.out.print("번호>");
				int cos = Integer.parseInt(sc.nextLine());
				switch (cos) {
				case 1:
					System.out.print("이름>");
					String str1 = sc.nextLine();
					System.out.print("계정>");
					String str2 = sc.nextLine();
					if (str1.equals(ba.getName()) && str2.equals(ba.getAccount())) {
						System.out.println("로그인 성공");
						login = true;
					} else {
						System.out.println("로그인 실패");
					}
					break;
				case 2:
					System.out.print("이름입력>");
					ba.setName(sc.nextLine());
					System.out.print("계정입력>");
					ba.setAccount(sc.nextLine());
					break;
				case 3:
					run = false;
					break;
				}
			}
//			if (login) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.로그아웃");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			int Num = Integer.parseInt(sc.nextLine());
				
			switch (Num) {
			case 1:
				System.out.print("예금액>");
				ba.deposit(Integer.parseInt(sc.nextLine()));
				break;
			case 2:
				System.out.print("출금액>");
				ba.withdraw(Integer.parseInt(sc.nextLine()));
				break;
			case 3:
				System.out.println("잔고>" + ba.getBalance());
				break;
			case 4:
				run = false;
				login = false;
				break;
//				} 
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
