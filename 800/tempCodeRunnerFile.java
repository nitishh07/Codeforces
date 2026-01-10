
import java.util.*;

public class lvl6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = Math.abs(b - a) + Math.abs(c -a);
        int y = Math.abs(a - b) + Math.abs(c - b);
        int z = Math.abs(a - c) + Math.abs(b -c);

        if(x < y && x < z){
            System.out.println(x);
        }
        else if(y < x && y < z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}