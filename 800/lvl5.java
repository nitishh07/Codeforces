
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         for(int i = 1; i <= n; i++){
//             if(i % 2 == 1){
//                 // full row of #
//                 for(int j = 0; j < m; j++) System.out.print("#");
//             }
//             else {
//                 if(i % 4 == 0){
//                     // # at start
//                     System.out.print("#");
//                     for(int j = 1; j < m; j++) System.out.print(".");
//                 } else {
//                     // # at end
//                     for(int j = 1; j < m; j++) System.out.print(".");
//                     System.out.print("#");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//Games

// public class lvl5{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] a = new int[n];
//         int[] b = new int[n];
//         int count = 0;
//         for(int i=0; i<n; i++){
//             a[i] = sc.nextInt();
//             b[i] = sc.nextInt();
//         }

//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<b.length; j++){
//                 if(a[i] == b[j]){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }


//Cndies and Two Sisters
// import java.util.*;

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         StringBuilder ans = new StringBuilder();

//         while(t-- > 0){
//             long n = sc.nextLong();
//             if(n <= 2) ans.append(0);
//             else ans.append((n - 1) / 2);
//             ans.append("\n");
//         }

//         System.out.print(ans.toString());
//     }
// }
