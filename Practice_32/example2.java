import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int oddVal[] = new int[n];
        int oddCnt[] = new int[n];
        int evenVal[] = new int[n];
        int evenCnt[] = new int[n];

        int oddSize = 0;
        int evenSize = 0;

        for (int i = 0; i < n; i++) {

            int lc = 0;
            int oc = 0;

            for (int j = i; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    lc++;
                }
            }

            if (lc == 1) {

                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        oc++;
                    }
                }

                if (oc % 2 != 0) {
                    oddVal[oddSize] = arr[i];
                    oddCnt[oddSize] = oc;
                    oddSize++;
                } else {
                    evenVal[evenSize] = arr[i];
                    evenCnt[evenSize] = oc;
                    evenSize++;
                }
            }
        }

        for (int i = 0; i < oddSize - 1; i++) {
            for (int j = i + 1; j < oddSize; j++) {
                if (oddCnt[i] < oddCnt[j]) {

                    int temp = oddCnt[i];
                    oddCnt[i] = oddCnt[j];
                    oddCnt[j] = temp;

                    temp = oddVal[i];
                    oddVal[i] = oddVal[j];
                    oddVal[j] = temp;
                }
            }
        }

        for (int i = 0; i < evenSize - 1; i++) {
            for (int j = i + 1; j < evenSize; j++) {
                if (evenCnt[i] > evenCnt[j]) {

                    int temp = evenCnt[i];
                    evenCnt[i] = evenCnt[j];
                    evenCnt[j] = temp;

                    temp = evenVal[i];
                    evenVal[i] = evenVal[j];
                    evenVal[j] = temp;
                }
            }
        }

        for (int i = 0; i < oddSize; i++) {
            System.out.println(oddVal[i] + " - " + oddCnt[i]);
        }

        for (int i = 0; i < evenSize; i++) {
            System.out.println(evenVal[i] + " - " + evenCnt[i]);
        }
    }
}