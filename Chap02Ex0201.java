//ユーザーが整数値を入力し、その値をそのまま画面に表示します。
import java.util.Scanner;
class Chap02Ex0201{
  public static void main(String[] args){
    System.out.print("enter a number: ");
    Scanner stdIn = new Scanner(System.in);
    int x = stdIn.nextInt();
    System.out.println("君が入力の数は: " + x);
  }
}
