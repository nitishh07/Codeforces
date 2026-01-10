


//Amusing Joke
// import java.util.*;
// public class lvl6{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.next();
//         String s2 = sc.next();
//         String ans = sc.next();
//         StringBuilder add = new StringBuilder();
//         StringBuilder x = new StringBuilder(s1);
//         StringBuilder y = new StringBuilder(s2);

//         add.append(x);
//         add.append(y);

//         char[] arr = add.toString().toCharArray();
//         char[] ansArr = ans.toCharArray();

//         Arrays.sort(arr);
//         Arrays.sort(ansArr);

//         if(Arrays.equals(arr, ansArr)){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
//     }
// }


//SUM

// import java.util.Scanner;
// public class lvl6{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] a = new int[n];
//         int[] b = new int[n];
//         int[] c = new int[n];
//         String[] ans = new String[n];
//         for(int i=0; i<n ; i++){
//             a[i] = sc.nextInt();
//             b[i] = sc.nextInt();
//             c[i] = sc.nextInt();

//             if(a[i] + b[i] == c[i]){
//                 ans[i] = "YES";
//             }
//             else if(a[i] + c[i] == b[i]){
//                 ans[i] = "YES";
//             }
//             else if(b[i] + c[i] == a[i]){
//                 ans[i] = "YES";
//             }
//             else{
//                 ans[i] = "NO";
//             }
//         }

//         for(int i=0; i<ans.length; i++){
//             System.out.println(ans[i]);
//         }
//     }
// }


//The New Year : Meeting Friends

// import java.util.*;

// public class lvl6{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int x = Math.abs(b - a) + Math.abs(c -a);
//         int y = Math.abs(a - b) + Math.abs(c - b);
//         int z = Math.abs(a - c) + Math.abs(b -c);

//         if(x < y && x < z){
//             System.out.println(x);
//         }
//         else if(y < x && y < z){
//             System.out.println(y);
//         }else{
//             System.out.println(z);
//         }
//     }
// }


//Police Recruits

// import java.util.*;

// public class lvl6{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         int available = 0;
//         int untreated = 0;

//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > 0){
//                 available += arr[i];
//             }
//             if(arr[i] < 0){
//                 if(available > 0){
//                     available--;
//                 }else{
//                     untreated++;
//                 }
//             }
//         }
//         System.out.println(untreated);
//     }
// }


//YES or YES

import java.util.Scanner;

public class lvl6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        String ans = "";
        for(int i=0; i<n; i++){
            s = sc.next();
        if(s.toLowerCase().equals("yes")){
            ans += "YES\n";
        }else{
            ans +="NO\n";

        }
        } 
        System.out.println(ans);   
        System.out.println();
    }
}