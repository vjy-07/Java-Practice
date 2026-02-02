class Main
{
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		char operator = '-';
		switch (operator){
		    case '+':
		        int res = n1+n2;
		        System.out.print("Sum is "+res);
		        break;
            case '-':
                int res1 = n1-n2;
                System.out.print("Diff is "+res1);
                break;
            case '*':
                int res2 = n1*n2;
                System.out.print("Mul is "+res2);
                break;
            case '/':
                int res3 = n1/n2;
                System.out.print("Div is "+res3);
                break;
            default:
                System.out.print("invalid operator");
            
		}
	}
}
