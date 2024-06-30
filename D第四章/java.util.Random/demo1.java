import java.util.Random;
public class demo1{
    public static void main(String[] args) {
        Random a = new Random();
        int b = a.nextInt(100)-100;
        System.out.println("生成的随机数为" + b);
    }
}