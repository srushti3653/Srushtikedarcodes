import java.util.*;
public class Question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = (((a+b+c+d+e)*100)/500);
        
        System.out.println(f);
    }
}
