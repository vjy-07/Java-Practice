import java.util.Scanner;
class Bank{
	double balance = 15000;
	String withdraw(double wdAmount){
		if(wdAmount>balance){
			return "withdraw Failed";
		}
		else if(wdAmount<=0){
			return "Insufficient Amount";
		}
		balance-=wdAmount;
		return "withdraw successful";
	}

	String deposit(double dpAmount){
		if(dpAmount<=0){
			return "deposit failed";
		}
		balance+=dpAmount;
		return "deposit successful";
	}

	double checkBalance(){
		return balance;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Bank obj = new Bank();
		boolean flag = true;
		while(flag){
			System.out.println("press 1 for withdraw");
			System.out.println("press 2 for deposit");
			System.out.println("press 3 for check Balance");
			System.out.println("press 4 for exit");
			int n = sc.nextInt();
			switch(n){
				case 1:
					System.out.println(obj.withdraw(sc.nextDouble()));
					break;
				case 2:
					System.out.println(obj.deposit(sc.nextDouble()));
					break;
				case 3:
					System.out.println(obj.checkBalance());
					break;
				case 4:
					flag = false;
					break;
				default:
					System.out.println("enter valid input");
					break;
			}
		}
	}
}