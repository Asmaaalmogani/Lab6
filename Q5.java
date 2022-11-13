import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        String word;
        System.out.println("Enter The word : ");

        Scanner input=new Scanner(System.in);
        word=input.next();

        int number=0;
        for (int i=0;i<word.length();i++)
        {
            char later = word.charAt(i);
            if(later=='a'||later=='o'||later=='i'||later=='e'||later=='u'||later=='y'
            ||later=='A'||later=='O'||later=='I'||later=='E'||later=='U'||later=='Y')
                number++;
        }
        System.out.println(number);
    }
}