import java.util.Scanner;
public class demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入你要返回的数字");
        double i;
            i = sc.nextDouble();
        
        System.out.println("你输入的数字是:" + i);

        System.out.println("------------------------------");
        
        System.out.println("请输入你要返回得得文字");
        
        String k;
            k = sc.next();
        
        System.out.println("你输入的文字是:" + k);

        System.out.println("------------------------------");

    }
}
