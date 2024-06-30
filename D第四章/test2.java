import java.util.Scanner;
public class test2{
    public static void main(String[] args) {
        System.out.println("请输入年龄");
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();

        if (i>0&&i<=6) 
            System.out.println(i + "岁是婴幼儿");
        
        else if (i>=7&&i<=12)
            System.out.println(i + "岁是少儿");

        else if (i>=150)
            System.out.println("能活到" + i + "岁" + "真是牛逼");
        
        else {
            System.out.println(i + "是青少年或青年或中年或老年");
        }


    }
}