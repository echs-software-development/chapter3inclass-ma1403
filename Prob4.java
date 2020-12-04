import java.util.Scanner;

public class Prob4  {
  public static void main(String[] args){
  Scanner scan= new Scanner(System.in);
  System.out.println("What is the temperature?: ");

  double temp= scan.nextDouble();

  if (temp < 99 || > 102)
    System.out.print("WARNING");
  
  else{
  System.out.println("Temperature is OK");
  }

    
  }
}
