package codeToTay01.part6;
import java.util.Scanner;
public class bai54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        while(a <= b){
            if( a % 3 == 0 && a % 5 == 0){
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
