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

    int i = c<b?1:2;  //比较b与c的大小
    
    switch (i) {
        case 1:
            System.out.println("小了");
            break;
        case 2:
            System.out.println("大了");
            break;
            
        default:
            System.out.println("恭喜你,猜对了");
            break;
    }
    
    }
}