/* Assign values to three variables and calculate
    the total value and average*/
class Chap02Ex0102{
  public static void main(String[] args){
    int x;
    x = 36;
    System.out.println(x);
    System.out.println("x");
    System.out.println("xの値は" + x + ".");
    int y;
    int z;
    y = 45;
    z = 50;
    z = y;
    y = 60;
    System.out.println(y + z);//calculate y and z's total value
    System.out.println("y + z");
    System.out.println("y + z = " + (y + z));//calculate y and z's total value
    System.out.println("yの値は" + y + ".");
    System.out.println("zの値は" + z + ".");
    System.out.println("yとｚの和は" + (y + z));//calculate y and z's total value
    System.out.println("yとｚの平均値は" + (y + z)/2);//calculate y and z's average
  }
}
