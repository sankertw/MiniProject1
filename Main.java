/*
Mini Project 1
Group #1: Tommy Sanker, Molly Campbell, Andrew Kaiser, Dom Dalessandro
Date: 9/29/2020
*/

import java.util.Scanner; //import scanner class
import java.util.Random; //import random class

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner initial = new Scanner(System.in);
    int userNum; // store users number

    System.out.println("Welcome to the Guessing Game!"); // initial statement
    System.out.println("Please enter any positive whole number: ");
    userNum = initial.nextInt(); //gets users number
    // System.out.println(userNum); // test to make sure we got user number
    int randomNum = r.nextInt(userNum); // make random integer using userNum as upper bound
    System.out.println("A random number to guess has been generated"); 
    playGame(userNum, randomNum);
  }
  static void playGame(int theInitial, int theNum) {
    System.out.println("Please guess a number between 0 and " + theInitial);
    int userGuess; //declare variable to store users guess
    int attempts; //declare variable to store the amount of attempts

    attempts = 0; //make attempts 0, i guess-
    //userGuess = guess.nextInt(); // get's users guess

    while(true){
    Scanner guess = new Scanner(System.in);  //new scanner for guess
    userGuess = guess.nextInt(); // get's users guess
    attempts++;
 
    if(userGuess == theNum) { 
    System.out.println("You got it!");
    System.out.println("it took you " + attempts + " attempts to guess the number"); 
    break;
      }
    if (userGuess < theNum){
      System.out.println("It's higher than that!");
    }
    if (userGuess > theNum) {System.out.println("It's lower than that!"); 
    }
  
    System.out.println("Please enter your new guess: ");
    } 
  }

}