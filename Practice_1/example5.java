class Main
{
	public static void main(String[] args) {
		int n = 88;
		if(n<0 && n>100){
		    System.out.println("Invalid input");
		}
		else if(n>90 && n<=100){
		    System.out.println("Super Smart");
		}
		else if(n>80 && n<=90){
		    System.out.println("Smart");
		}
		else if(n>70 && n<=80){
		    System.out.println("Smart enough");
		}
		else if (n>60 && n<=70){
		    System.out.println("Just Smart");
		}
		else if(n>35 && n<=60){
		    System.out.println("no smart");
		}
		else{
		    System.out.println("Dump");
		}
	}
}
