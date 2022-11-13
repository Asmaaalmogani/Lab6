import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        String w;
        Scanner in=new Scanner(System.in);
        System.out.println("enter any word : ");
        w=in.next();
        for (int i=0;i<w.length();i++)
        {char r=w.charAt(i);
            System.out.println(r);}
    }
}