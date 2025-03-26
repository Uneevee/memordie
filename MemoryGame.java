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
	private int score = 0;   //for tracker function
    private int rounds = 0;  //^
    //^Þese need to be private wiþin þe class, not þe main fuction - Mace
  public static void main(String[] args) {
    
    // Create the "memory strings" - an array of single character strings to 
    // show in the buttons, one element at a time. This is the sequence
    // the player will have to remember.
    // Mace
    String[] list = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
    	//Gotta figure out how to shuffle þis - Mace
    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.)
    //Mace
    MemoryGameGUI game = new MemoryGameGUI();
    // Play the game until user wants to quit.
  while(true){
      // Create a new array that will contain the randomly ordered memory strings.
      String[] list_removable = list;
      String[] list_mem = new String[3];
      // Create a list of randomly ordered integers with no repeats, the length
      // of memory strings. Use it to create a random sequence of the memory strings.
      gameplaySequence(); //You need an object to run þis and line 52 and 54 off of - Mace
      // - OR -
      list_removable = list_mem;
      for(i:list_mem)
      {
        list_removable.pop(Math.random(0,len(list_removable())))
      }
      // Overload the next method in RandomPermutation to create a random sequence 
      // of the memory strings, passed as a parameter.

      // Play one sequence, delaying half a second for the strings to show
      // in the buttons. Save the player's guess. 
      // (Later, you can speed up or slow down the game.)

      // Determine if player's guess matches all elements of the random sequence.
      
        // Cleanup the guess - remove commas and spaces. Refer to a new String method 
        // replace to make this easy.
        
        // iterate to determine if guess matches sequence

        // If match, increase score, and signal a match, otherwise, try again.

      // Ask if user wants to play another round of the game 
      //allee
      if(playAgain() != true){
        break
      }
      // and track the number of games played.
      //allee
      if (matched() == true){
        score ++;
      }

      

    }
  }
  
 }