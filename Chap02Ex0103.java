/* Assign values to three variables and calculate
    the total value and average*/
class Chap02Ex0103{
  public static void main(String[] args){
    int x = 33;//input x's value
    int y = 44;//input y's value
    int z = 55;//input z's value

    System.out.println("x is : " + x);//print x's value
    System.out.println("y is : " + y);//print y's value
    System.out.println("z is : " + z);//print z's value

    ////calculate three values total value
    System.out.println("x and y and z, their sum is: " + (x + y + z));

    //calculate three values average
    System.out.println("their average is: " + (x + y + z) / 3);
  }
}
