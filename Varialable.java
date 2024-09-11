/*
 *September 11, 2024
 *James Arnold S. Nieves
 *The use of Variable
*/

public class Varialable {
  public static void main(String[] args) {
    String name = "James";
    int age=18;
    int fNum=10;
    int sNum=3;
    
    int sum = fNum + sNum;
    int pro = fNum * sNum;
    int quo = fNum / sNum;
    int rem = fNum % sNum;
    
    float itemPrice =25.95f;
    char symbol='$';
    boolean value=true;
    final float pi = 3.1456f;
    
    
    System.out.println("Hi, I'm " + name + "." );
    System.out.println("I'm " + age + " years old ");
    System.out.println("The amount of the item is " + itemPrice + symbol );
    System.out.println("The value is " + value );
    System.out.println("The sum is " + sum );
    System.out.println("The product is " + pro );
    System.out.println("The quotient is " + quo );
    System.out.println("The reminder is " + rem );
}

}