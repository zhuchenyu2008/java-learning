public class test3{
    public static void main(String[] args) {
        int b = 2 , c = 0 ; 
        
        for (int a = 0;a<=100;a+=b){  //赋值0给a,同时在a≤100时每次执行a+2
            
            c = c + a;//将每次a的值都给予c
            

        }
    
    System.out.println(c); //输出


    }
}