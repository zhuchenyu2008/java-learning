public class test2{
    public static void main(String[] args) {
        int p1 , p2 , p3;
            p1 = 70;
            p2 = 80;
            p3 = 60;
        int r1 = p1>p2?p1:p2;
        int r2 = r1>p3?r1:p3;
        System.out.println("在三位年龄分别为:" + p1 + "," + p2 + ","+ p3 + "的老人中," + "最大的年龄是:");
        System.out.println(r2);
    }
}