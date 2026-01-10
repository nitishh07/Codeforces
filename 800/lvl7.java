//Soft Drinking

// import java.util.*;

// public class lvl7{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int l = sc.nextInt();
//         int c = sc.nextInt();
//         int d = sc.nextInt();
//         int p = sc.nextInt();
//         int nl = sc.nextInt();
//         int np = sc.nextInt();

//         int x = (k * l)/(n * nl);
//         int y = (c * d)/ n ;
//         int z = (p) / (n * np);
//         int ans = 0;
//         ans = Math.min(Math.min(x, y), z);
//         System.out.println(ans);
//     }
// }


//I_love_%username%

// import java.util.*;

// public class lvl7{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int best = arr[0];
//         int worst = arr[0];
//         int count = 0;
        
//         for(int i= 0; i<arr.length; i++){
//                 if( arr[i]> best){
//                     count++;
//                     best = arr[i];
//                 }
//                 else if(arr[i] < worst){
//                     count++;
//                     worst = arr[i];
//                 }
//             }
//         System.out.println(count);
//     }
// }



//New Year and Hurry

// import java.util.*;

// public class lvl7{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int time = 0;
//         int t = 240 - k;
//         int count = 0;

//         for(int i=1; i<=n; i++){
//             time  += (5 * i);
//             if(time <= t){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


//Again Twenty Five

// import java.util.*;

// public class lvl7{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         System.out.println(25);
//     }
// }


//Buy A Shovel

// import java.util.Scanner;

// public class lvl7{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         int r = sc.nextInt();

//         for(int i=1; i<= 10 ; i++){
//             int ans = i * k;
//             int dig = ans % 10;

//             if(dig == 0 || dig == r){
//                 System.out.println(i);
//                 break;
//             }
//         }
//     }

// }



//Sereja and Dima
import java.util.*;

public class lvl7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = 0, r = n - 1;
        int s1 = 0, s2 = 0;
        boolean turn = true; // true = Sereja, false = Dima

        while (l <= r) {
            int pick;
            if (arr[l] > arr[r]) {
                pick = arr[l];
                l++;
            } else {
                pick = arr[r];
                r--;
            }

            if (turn) {
                s1 += pick; // Sereja
            } else {
                s2 += pick; // Dima
            }
            turn = !turn;
        }

        System.out.println(s1 + " " + s2);
    }
}
