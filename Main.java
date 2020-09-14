import java.util.Scanner;
/**
 * get a temperature from the user, then convert the temperature from celsius to fahrenheit
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize the temperature variables
    int tempCelsius; //variable for celsius
    int tempFahrenheit; //variable for fahrenheit

    //ask the user for a temperature
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius.");
    //store user input in the celsius variable
    tempCelsius = input.nextInt();

    //convert the celsius temerature variable to fahrenheit and store it in the fahrenheit variable
    tempFahrenheit = (tempCelsius*9)/5 + 32;

    //tell the user the original temperature and the converted temperature
    System.out.println(tempCelsius + "C is the same as " + tempFahrenheit + "F");
  }
}
