
// import java.util.*;

// public class lvl3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int a[] = new int[n];
//         int b[] = new int[n]; 

//         int ans = 0;
//         int max = 0;
//         for(int i=0; i<n ; i++){
//             a[i] = sc.nextInt();
//             b[i] = sc.nextInt();

//             ans -= a[i];
//             ans += b[i];

//             max = Math.max(ans , max);
//         }

//         System.out.println(max);
//     }
// }


//Beautiful Year

// import java.util.*;
// public class lvl3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         while (true) { 
//             year++;

//             if(Unique(year)){
//                 System.out.println(year);
//                 break;
//             }

//         }
//     }

//     public static boolean Unique(int year ){
//         String s = Integer.toString(year);

//         for(int i=0; i<s.length(); i++){
//             for(int j = i+1; j<s.length(); j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }


//George and Accomodation
// import java.util.*;
// public class lvl3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] p = new int[n];
//         int[] q = new int[n];
//         int count = 0;
//         for(int i=0; i<n; i++){
//             p[i] = sc.nextInt();
//             q[i] = sc.nextInt();

//             if(q[i] - p[i] >= 2){
//                 count++;
//             }
//         }

//         System.out.println(count);

//     }
// }


//CCalculating functon

// import java.util.*;

// public class lvl3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long n = sc.nextLong();

//         if(n%2 == 0){
//             System.out.println(n/2);
//         }else{
//             System.out.println(-(n+1)/2);
//         }
//     }
// }


//In Search of an Easy Problem

// public class lvl3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         int count = 0;
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();

//             for(int j=0; j<arr.length; j++){
//                 if(arr[j] == 1){
//                     count++;
//                 }
//             }
//         }
//         if(count >= 1){
//             System.out.println("HARD");
//         }else{
//             System.out.println("EASY");
//         }
//     }
// }



//Magnets
// import java.util.*;
// public class lvl3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String prev = sc.next();

//         int count = 1;
//         for(int i=1; i<n ; i++){
//             String curr = sc.next();

//             if(!curr.equals(prev)){  
//                 count++;
//             }
//             prev = curr;   //next iteration ke liuye curr ab prev ban jata hai
//         }
//         System.out.println(count);
//     }
// }


//Drinks

// import java.util.*;

// public class lvl3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         float ans = 0;
//         float dig = 0;
//         float[] p = new float[n];
//         for(int i=0; i<n; i++){
//             p[i] = sc.nextFloat();

//             dig += p[i];
//             ans = dig/n;
//         }
//         System.out.println(ans);
//     }
// }


//Presents

import java.util.Scanner;

public class lvl3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];  //bcz of 1 based indexing
        int ans[] = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();

            ans[arr[i]] = i;
        }

        for(int i=1; i<=n; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}