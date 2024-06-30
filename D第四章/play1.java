import java.util.Random;
import java.util.Scanner;

public class play1{
    public static void main(String[] args) {
    Random a = new Random();
    int b = a.nextInt(101);  //随机生成一个0-100的数字

    System.out.println("这是一个猜数字小游戏");
    System.out.println("数字的取值范围在 0-100 之间");
    System.out.println("现在请输入你猜测的数字:");
    
    Scanner input = new Scanner(System.in);
    int c = input.nextInt(); //将输入的数字赋值给c

    if (c>b) {
        System.out.println("大了");
    if (c<b) {
        System.out.println("小了");
            
        }
    } else {
        System.out.println("恭喜你猜对了");
    }

    //判断大小或相等
    
    System.out.println("正确答案是:" + b);

    }
}