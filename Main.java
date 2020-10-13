/**
 * creates a random line of asterisks between 1 and 5 along the page
 * @author Graham Ellacott
 */
public class Main {
  
  //draw a random number of stars between 1 and 5 for as many lines as told to by the user
  public static void chaotic(int numLines){
    //repeat as many times as numLines is set to
    for(int i = 0; i < numLines; i++){
      int randNum = (int)(Math.random()*(5 - 1 + 1)) + 1; //make the random number
      //make a loop to print out the stars
      for(int j = 0; j < randNum; j++){ //repeat a random number of times between 1 and 5
        System.out.print("*"); //print a star
      }
      System.out.println(""); //make it go down 1 line
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //test the module
    chaotic(5);
    System.out.println(""); //add a space between each test
    chaotic(7);
    System.out.println(""); //add a space between each test
    chaotic(3);
    System.out.println(""); //add a space between each test
    
  }
}
