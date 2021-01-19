/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
private Boolean gameOver = false;
  /* your code here - constructor(s) */ 
PhraseSolver(){
Player p1 = new Player();
Player p2 = new Player();
Board boardGame = new Board();

}
 
  /* your code here - accessor(s) */


  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved ){
    
      /* your code here - game logic */
        
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}