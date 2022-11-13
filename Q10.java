import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int brice_dollar=0;
        int a=0;
        int convert;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The brice for dollar in japanese yen to day : ");
        brice_dollar=input.nextInt();
        System.out.println("Enter The u.s.dollar value : ");
        a=input.nextInt();
        convert=a*brice_dollar;
        System.out.println("the cost after the converts:");
        System.out.println(convert+" yen.");


    }

}
