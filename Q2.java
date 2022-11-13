import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(" The sum of all even numbers between 2 and 100 :" + sum);


        int a, b;
        int sum2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("  Enter two numbers : ");
        a = in.nextInt();
        b = in.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 2 != 0 && i!=a) {
                sum2 ++;
            }
        }
        System.out.println("The sum of all odd numbers between "+a+ " and " +b+ "= "+ sum2);


        int c;
        System.out.println("Enter number : ");
        c = in.nextInt();
    }
}