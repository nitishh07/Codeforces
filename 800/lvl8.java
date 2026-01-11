//Furniture Store

import java.util.*;

public class lvl8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {          

            int n = sc.nextInt();                 
            int arr[] = new int[n];               

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int min = arr[0];                     
            int ans[] = new int[n];
            int idx = 0;

            for (int i = 1; i < n; i++) {         
                if (arr[i] < min) {
                    min = arr[i];
                } else {
                    ans[idx++] = i + 1;           
                }
            }

            System.out.println(idx);
            for (int i = 0; i < idx; i++) {       
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
