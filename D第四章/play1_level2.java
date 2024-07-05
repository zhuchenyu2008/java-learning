import java.util.Random;
import java.util.Scanner;

public class play1_level2{
    public static void main(String[] args) {
        Random a = new Random();
        int b = a.nextInt(101);  //随机生成一个0-100的数字b

        System.out.println("这是一个猜数字小游戏");
        System.out.println("数字的取值范围在 0-100 之间");

        int t = 0;
        while(t==0){
            System.out.println("现在请输入你猜测的数字:");
            
            Scanner input = new Scanner(System.in);
            int c = input.nextInt(); //将输入的数字赋值给c

            if (c>b) {
                System.out.println("大了");
                
                System.out.println("还要重新猜嘛?(1:要  2:不要)");
                Scanner input2 = new Scanner(System.in);
                int d = input2.nextInt();
            
                if (d == 2){
                    t = 1;
                    System.out.println("正确答案是:" + b);
                }
                else if(d!=1){
                    break;
                }
                
            }
            
            else if (c<b) {
                System.out.println("小了");
                
                System.out.println("还要重新猜嘛?(1:要  2:不要)");
                Scanner input2 = new Scanner(System.in);
                int d = input2.nextInt();
                
                if (d == 2){
                    t = 1;
                    System.out.println("正确答案是:" + b);
                }
                else if(d!=1){
                    break;
                }

            }

            else {
                System.out.println("恭喜你猜对了");
                t = 1;
            }

        }    
        
    }

}