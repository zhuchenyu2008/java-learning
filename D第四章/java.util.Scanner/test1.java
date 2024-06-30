import java.util.Scanner;
public class test1{
    public static void main(String[] args) {
        int p1 , p2 , p3; //声明定义三个数字
        
        System.out.println("请输入第一个数字:");
        Scanner i1 = new Scanner(System.in);  //将输入的值赋值给i1
        p1 = i1.nextInt();//将i1接受到的值赋值给p1
        
        System.out.println("请输入第二个数字:");
        Scanner i2 = new Scanner(System.in);
        p2 = i2.nextInt();

        System.out.println("请输入第三个数字:");
        Scanner i3 = new Scanner(System.in);
        p3 = i3.nextInt();
        
        int r1 = p1>p2?p1:p2;
        int r2 = r1>p3?r1:p3;

        System.out.println("你输入的三个数字中,数字最大的为:" + r2);

    }
}