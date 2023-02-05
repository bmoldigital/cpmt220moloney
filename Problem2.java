import java.util.Scanner;

public class Problem2 { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);

    System.out.println("Enter values for a, b, c, and d. ");

    float a = input.nextFloat();
    float b = input.nextFloat();
    float c = input.nextFloat();
    float d = input.nextFloat();

    float ans = ((a * d) - (b * c)) / (b * d);
    System.out.println(ans);

    
    
  
  }
}