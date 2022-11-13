import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        String w;
        Scanner in=new Scanner(System.in);
        System.out.println("enter any word : ");
        w=in.next();
        char[] ar=w.toCharArray();
        StringBuilder builder=new StringBuilder();
        for (int i=ar.length-1;i>=0;i--)
        {
            builder.append(ar[i]);
        }
        String s=builder.toString();
        System.out.print(s);
    }
}