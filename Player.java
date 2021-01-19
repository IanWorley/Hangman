/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
private String name = "";
private int points;


  /* your code here - constructor(s) */ 
  public Player(){
    setName();
    setPoints(0);
    
  }

  public Player(String name, int points){
    this.name = name;
    this.points = points;

  }

  /* your code here - accessor(s) */ 
  public String getName(){
    return name;
  }

  /**
   * @return the points
   */
  public int getPoints() {
    return points;
  }


  /* your code here - mutator(s) */ 
  void setPoints(int i){
    points = i;
  }

  void addPoint(){
    points += 1;
  }


 void  setName(){
    System.out.println("Put in your name: ");
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine(); 
  }



 void  setName(String s){
    name = s;
  }
  

}