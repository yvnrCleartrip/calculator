import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(calculator.addition(x,y));
        System.out.println(calculator.substraction(x,y));
    }
    public int addition(int x,int y){
        return x+y;
    }
    public int substraction(int x,int y){
        return x-y;
    }
}
