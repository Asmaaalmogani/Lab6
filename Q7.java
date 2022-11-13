
import java.util.Scanner;

public class Q7
{
    public static void main(String args[])
    {
        int number ;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
         number=input.nextInt();
        while(number!=0)
        {
            int b=number%2;
            System.out.println(b);
            number=number/2;
        }
    }
}
