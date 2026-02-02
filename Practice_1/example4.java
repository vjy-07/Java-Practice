class Main
{
	public static void main(String[] args) {
		int n = 135;
		if(n<100 && n>1000){
		    System.out.println("Wrong number");
		}
		else{
		    if(n%2==0){
		        int rem = n % 3;
		        System.out.println(rem);
		    }
		    else{
		        int rem = n % 2;
		        System.out.println(rem);
		    }
		}
	}
}
