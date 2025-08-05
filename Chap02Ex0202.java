//入力された数値に対して、加算と減算の演算を行います。
import java.util.Scanner;
class Chap02Ex0202{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("enter a number: ");
    int x = stdIn.nextInt();//ユーザーが入力した値
    System.out.println("君に入力した数は：" + x + "です");
    System.out.println("xと１２の加算した結果は：" + (x + 10) + "です");//加算結果
    System.out.println("xと１２の減算した結果は：" + (x - 10) + "です");//減算結果
  }
}
