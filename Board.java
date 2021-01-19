/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class  Board
{
  private String phrase = "";
  private String solvedPhrase = "";
  private int currentLetterValue; 
  
  public Board(){
    // SetPhrase by loading Phrase.
      setPhrase(loadPhrase());
        // prints out the phrase.  
      System.out.println("Phrase: " + phrase);
  }


  //return a phrase to user.
  public String getPhrase() {
    return phrase;
  } 
  //Set the phrase in the class.
public void setPhrase(String phrase) {
  this.phrase = phrase;

}
    // return the solvedPhrase 
public String getSolvedPhrase() {
  return solvedPhrase;
}
    //get the currentLetterValue()
public int getCurrentLetterValue() {
  return currentLetterValue;
}

  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";

    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  

  public boolean guessLetter(String guess)
  {

      /**
      *This allows the user to check and see if they found a letter or not. 
      *
      */
    boolean foundLetter = false;
    String newSolvedPhrase = "";
    
    for (int i = 0; i < phrase.length(); i++)
    // loop through all of the letters in the String
    {
      if (phrase.substring(i, i + 1).equals(guess))
      // if letter equals true than set found letter to true and add letter to the solve phrase
      {
        newSolvedPhrase += guess + " ";
        // newSolvedPhrase add the guess value  and space 
        foundLetter = true;
        // set found letter to rue 
      }
      else
      // else add new newSolvedPhrase substring of i * 2 and the i * 2 with an empty space.
      {
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
        // newSolvedPhrase  add the sub string of  I*2, I* 2 +1 then add a space
      }
    }
    solvedPhrase = newSolvedPhrase;
    // solvePharease replace NewSolvedPhrase
    return foundLetter;
  } 
} 