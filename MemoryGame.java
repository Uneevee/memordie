/**
 * Project 3.6.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of buttons.
 * After wathcing the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */
import java.utils.*;
import java.util.Scanner;
import java.util.Random;
public class MemoryGame
{
  public static void main(String[] args) {
    // Create the "memory strings" - an array of single character strings to 
    // show in the buttons, one element at a time. This is the sequence
    // the player will have to remember.
    // Mace
    list_mem = ("q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m");
    //Collections.shuffle(list);
    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.)

    // Play the game until user wants to quit.
  
      // Create a new array that will contain the randomly ordered memory strings.

      // Create a list of randomly ordered integers with no repeats, the length
      // of memory strings. Use it to create a random sequence of the memory strings.
      // - OR -
      list_removable = list_mem;
      for(Math.random(3,6))
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
<<<<<<< HEAD
      //allee
      public static void public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);//reader is always watching...
        System.out.println("Do you want to play again?");
        String playAgain = reader.nextLine();
        if (playAgain == "y")
          
      })
=======
      playAgain();
      
>>>>>>> 3ca438076d9069296a20eb0ffd7ceaa4bb0b58da
      // and track the number of games played.
      //allee
      public void tracker();
      {
        int score = 0   //will these scores reset each time a new round happens?
        int rounds = 0
        if (matched() \\ tryagain())
        int score +=1;
        int rounds += 1;
      }
    // When done playing, show score and end the game.
    showScore();
  }
}