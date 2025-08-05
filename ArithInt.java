//2つの整数の値を読み込み, 加減乗除の結果を表示します。
import java.util.Scanner;
class ArithInt{
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("xとｙを加算減算乗算除算する。");
    System.out.print("enter x's variable: ");
    int x = stdIn.nextInt();//xの 値 を 入力 します。

    System.out.print("enter y's variable: ");
    int y = stdIn.nextInt();//yの 値 を 入力 します。

    System.out.println("x + y = " + (x + y));//print　ｘとｙの加算結果
    System.out.println("x - y = " + (x - y));//print　ｘとｙの減算結果
    System.out.println("x * y = " + (x * y));//print　ｘとｙの乗算結果
    System.out.println("x / y = " + (x / y));//print　ｘとｙの除算結果（整数部分）
    System.out.println("x % y = " + (x % y));//print ｘとｙの除算結果（余り部分）
  }
}
