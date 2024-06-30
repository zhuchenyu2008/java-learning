import java.util.Scanner;
public class test1{
    public static void main(String[] args) {
        System.out.println("输入要判断奇偶的数字");
        Scanner i = new Scanner(System.in);
        int r = i.nextInt();
        if (r%2==0) {
            System.out.println(r + "是偶数");
        } else {
            System.out.println(r + "是奇数");
        }
    }
}