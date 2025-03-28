/**
 * Project 3.6.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of buttons.
 * After wathcing the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */

import java.util.*;

public class MemoryGame
{
	private static int score = 0;   //for tracker function
  private static int rounds = 3;  //^
    //^Þese need to be private wiþin þe class, not þe main fuction - Mace
  public static void main(String[] args) {
    
    // Create the "memory strings" - an array of single character strings to 
    // show in the buttons, one element at a time. This is the sequence
    // the player will have to remember.
    // Mace
    final String[] LIST = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
    	//Gotta figure out how to shuffle þis - Mace
    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.)
    //Mace
    MemoryGameGUI game = new MemoryGameGUI();
    game.createBoard(3, false);
    // Play the game until user wants to quit.
    while(true){
      // Create a new array that will corntain the randomly ordered memory strings.
      ArrayList<String> list_removable = new ArrayList<String>(Arrays.asList(LIST));
      String[] list_mem = new String[rounds];
      String a_put_together = "";
      // Create a list of randomly ordered integers with no repeats, the length
      // of memory strings. Use it to create a random sequence of the memory strings.
      for(int i = 0; i < ((rounds+1 >= LIST.length)?LIST.length:rounds); i++)
      {
        int x = (int) (Math.random() * list_removable.size());
        list_mem[i] = list_removable.get(x);
        list_removable.remove(x);
        
      }
      // Play one sequence, delaying half a second for the strings to show
      // in the buttons. Save the player's guess. 
      // (Later, you can speed up or slow down the game.)
      String seq = game.playSequence(list_mem, 0.5-rounds*0.02);
      if(seq == null){seq = "";}

      // Determine if player's guess matches all elements of the random sequence.
      
        // Cleanup the guess - remove commas and spaces. Refer to a new String method //Lucas
        // replace to make this easy.
        String fixedStr = "";
        for (char i:seq.toCharArray()){
          if(!(i == ' '||i == ',')){fixedStr = fixedStr + i;}
        }
        // iterate to determine if guess matches sequence
        for (String a:list_mem){//epicnesdssd
          a_put_together = a_put_together + a;
        }
        // If match, increase score, and signal a match, otherwise, try again
        if (a_put_together.equals(fixedStr)){
          score += 1;
          if(Math.random() <= 0.1){game.tryAgain();game.matched();}else{game.matched();} //trolling
          rounds += 1;
        }
        else
        {
          game.tryAgain();
          game.showScore(score, rounds - 2);
          rounds = 3;
          score = 0;
        }
        
      // Ask if user wants to play another round of the game 
      //allee
      if(!game.playAgain()){
        break;
      }
    }
    game.quit();
  }
 }