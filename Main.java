import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1

    System.out.println("Problem 1");
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    int maxCount = 0;

    
    String maxLetter = "";

    for (int a = 0; a < word.length(); a++)
    {
      String target = word.substring(a, a+1);
      int counter = 0;
      for (int b = 0; b < word.length(); b++)
      {
        String currentLetter = word.substring(b, b +1);
        if (currentLetter.equals(target))
        {
          counter++;
        }
      }
      
      if (counter > maxCount)
      {
        maxCount = counter;
        maxLetter = target;
      }

    }
    System.out.println("The letter " + maxLetter + " appears the most times at " + maxCount + " times.");
    sc.close();
  }
}
