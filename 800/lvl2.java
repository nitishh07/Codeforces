//Anton & Danik

// import java.util.*;
// public class lvl2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String str = sc.next();

//         int c1 = 0;
//         int c2= 0;

//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i) == 'A'){
//                 c1++;
//             }
//             if(str.charAt(i) == 'D'){
//                 c2++;
//             }
//         }

//         if(c1 > c2){
//             System.out.println("Anton");
//         }
//         else if(c2 > c1){
//             System.out.println("Danik");
//         }else{
//             System.out.println("Friendship");
//         }
//     }
// }


//Translation
// import java.util.*;
// public class lvl2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         String t = sc.next();
//         StringBuilder sb = new StringBuilder(s);
//         sb.reverse();

//         String str = sb.toString();

//         if(str.equals(t)){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
//     }
// }



//Queue At The School
// import java.util.*;
// public class lvl2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int t = sc.nextInt();

//         String s = sc.next();
//         char[] arr = s.toCharArray();
//         for(int j = 0 ; j<t; j++){
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i] == 'B' && arr[i+1] == 'G'){
//                 char temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp;
//             i++; //same seocnd me dobara swap na ho
//             }
//         }

//         }

//         s= new String(arr);

//         System.out.println(s);
//     }
// }


//Vanya and Fence


// import java.util.Scanner;

// public class queue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int h = sc.nextInt();

//         int[] a = new int[n];

//         int sum = 0;
//         for(int i=0; i<a.length ; i++){
//             a[i] = sc.nextInt();

//             if(a[i] > h){
//                 sum += 2;
//             }else{
//                 sum += 1;
//             }
//         }

//         System.out.println(sum);
//     }
// }

