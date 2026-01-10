
// import java.util.*;

// public class lvl4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[4];
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr);
//         for(int i = 0; i < 3; i++){   // only till 2 (index 3 has no next element)
//             if(arr[i] == arr[i+1]){
//                 count++;
//             }
//         }
//         System.out.println( count);
//     }
// }


//Ultra Fast Mathematician

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String a = sc.nextLine();
//         String b = sc.nextLine();

//         StringBuilder ans = new StringBuilder();

//         for(int i=0; i<a.length(); i++){
//             if(a.charAt(i) != b.charAt(i)){
//                 ans.append('1');
//             }else{
//                 ans.append('0');
//             }
//         }
//         System.out.println(ans);
//     }
// }


//Hulk

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         StringBuilder ans = new StringBuilder();
//         for(int i=0; i<n ; i++){
//             if(i % 2 == 0){
//                 ans.append("I hate");
//             }else{
//                 ans.append("I love");
//             }

//             if(i != n - 1){
//                 ans.append(" that ");
//             }
//         }
//         ans.append(" it");
//         System.out.println(ans);

//     }
// }


//Divisibility problem

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         long a[] = new long[n];
//         long b[] = new long[n];

//         for(int i=0; i<n; i++){
//             int count = 0;
//             a[i] = sc.nextLong();
//             b[i] = sc.nextLong();

//             while(a[i] % b[i] != 0){
//                 a[i] += 1;
//                 count++;
//             }
//         System.out.println(count);
//         }
//     }
// }


//Panagram

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();   
//         String s = sc.next();

//         s = s.toLowerCase();

//         HashSet<Character> set = new HashSet<>();

//         for(int i=0; i<s.length(); i++){
//             set.add(s.charAt(i));
//         }
//         if(set.size() == 26){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
//     }
// }


//I Wanna Be The Guy

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean seen[] = new boolean[n+1];
//         int p = sc.nextInt();
//         for(int i=0; i<p; i++){
//             seen[sc.nextInt()] = true;
//         }

//         int q = sc.nextInt();
//         for(int i=0; i<q;i++){
//             seen[sc.nextInt()] = true;
//         }

//         for(int i=1; i<=n ; i++){
//             if(!seen[i]){
//                 System.out.println("Oh, my keyboard!");
//                 return;
//             }
//         }
//         System.out.println("I become the guy.");
//     }
// }



//Arrival of General

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }    
//         int max = 0;
//         int min = 0;
//         int swaps = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] <= arr[min]){
//                 min = i;
//             }
//             if(arr[i] > arr[max]){
//                 max = i;
//             }

//         }
//         swaps = max + (n-1 -min);
//         System.out.println(swaps);
        
//         if(max > min){
//             swaps--;
//         }
//     }
// }


//Hit the lottery

// import java.util.Scanner;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int arr[] = {1, 5 , 10 , 20 , 100};
//         int count = 0;
//             while(n != 0){
                
//         }

//         System.out.println(count);
//     }
// }



//Insomania Cure

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         int l = sc.nextInt();
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         int d = sc.nextInt();
//         int count = 0;
//         int[] arr = new int[4 * d];
//         int idx = 0;
//         for(int i=1; i<=d; i++){
//             if(i % k == 0){
//                 arr[idx++] = i;
//             }
//             if(i % l == 0){
//                 arr[idx++] = i;
//             }
//             if(i % m == 0){
//                 arr[idx++] = i;
//             }
//             if(i % n == 0){
//                 arr[idx++] = i;
//             }
//         }
//         Arrays.sort(arr , 0 , idx); //sort till valid part

//         for(int i=0; i<idx; i++){
//             if(i == 0 || arr[i] != arr[i-1]){
//                 count++;
//             }
//         }
//         System.out.print(count);
//     }
// }



//Anton and Polyhedrons

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;  
//         String s;
//         for(int i=0; i<n; i++){
//             s = sc.next();
            
//             if(s.equals("Tetrahedron")){
//                 sum += 4;
//             }

//             if(s.equals("Cube")){
//                 sum += 6;
//             }

//             if(s.equals("Octahedron")){
//                 sum += 8;
//             }

//             if(s.equals("Dodecahedron")){
//                 sum += 12;
//             }

//             if(s.equals("Icosahedron")){
//                 sum += 20;
//             }
//         }

//         System.out.println(sum);
//     }
// }



//Anton and Letters

// import java.util.*;

// public class lvl4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         char ch[] = new char[1000];
//         boolean isVisited = false;
//         int count = 0;
//         Arrays.sort(ch);
//         for(int i=0; i<ch.length; i++){
//             for(int j = i+1; j<ch.length; j++){
//                 if(ch[i] == ch[j]){
//                     isVisited = true;
//                     break;
//                 }
//             }
//         if(!isVisited){
//             count++;
//         }
//         }
//         System.out.println(count);
//     }
// }



