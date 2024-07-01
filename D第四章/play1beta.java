import java.util.Random;
import java.util.Scanner;

public class play1beta{
    public static void main(String[] args) {
    Random a = new Random();
    int b = a.nextInt(101);  //随机生成一个0-100的数字
    for (int r = 0; r<1; r=0) {
        System.out.println("现在请输入你猜测的数字:");
    
        Scanner input1 = new Scanner(System.in); //input1是用户第一次输入的数字
        int c = input1.nextInt(); //将输入的数字赋值给c

        if (c>b) {
            System.out.println("大了");
        if (c<b) {
            System.out.println("小了");
            
            }
        } else {
            r=100;
            System.out.println("恭喜你猜对了");
        
        }

    

    }
}
}