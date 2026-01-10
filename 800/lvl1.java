//Bear 

// import java.util.Scanner;

// public class lvl1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int i = 0;
//         while(a <= b){
//             a = a * 3;
//             b = b * 2;
//             i++;
//         }
//         System.out.println(i);
//     }
// }


//Elephant

// import java.util.Scanner;

// public class lvl1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int count = 0;
//         for(int i= 5 ; i >=1; i--){
//             while(x > 0){
//                 x -= i;
//                 count++;
//             }
//         }
//         if(x == 0){
//             System.out.println(count);
//         }
//     }
// }



//Stones on the table

// import java.util.Scanner;

// public class lvl1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String s = sc.next();
//         int count = 0;

//         for(int i=0; i < s.length() - 1; i++){
//             if(s.charAt(i) == s.charAt(i+1)){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


//Word

// import java.util.Scanner;

// public class lvl1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         int upper = 0;
//         int lower = 0;
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);

//             if(ch >= 'A' && ch <=  'Z'){
//                 upper++;
//             }
//             else if(ch >='a' && ch<= 'z'){
//                 lower++;
//             }
//         }
//         if(upper > lower){
//             System.out.println(s.toUpperCase());
//         }else{
//             System.out.println(s.toLowerCase());
//         }
//     }
// }



//Wrong Subtraction

// import java.util.Scanner;

// public class lvl1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         while(k > 0){
//             int dig = n % 10;

//             if(dig != 0){
//                 n -= 1;
//             }else{
//                 n /= 10;
//             }

//             k--;
//         }
//         System.out.println(n);
//     }
// }



// Nearly Lucky Number

import java.util.Scanner;

public class lvl1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        while(n > 0){
            long dig = n % 10;
            if(dig == 4 || dig == 7){
                count++;
            }
            n/= 10;
        }
        if(count == 7 || count == 4){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
