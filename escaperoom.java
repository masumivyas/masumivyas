/***********************************************************************
* @Author: Masumi Vyas   @Date: 15/06/2021   
*
* 
* @File Name: escaperoom.java
*
*
* @Program Description: 
*  This program plays an Escape Room style game
*
************************************************************************/
import java.util.Random; // imports class allowing random number generator
import java.util.Scanner; // import the scanner class

class escaperoom {

 // For room 4
 
   private static void methodRoomFourCheat() {
   
   // Variable declaration and initialization
   
      int userWins = 0, computerWins = 0, play = 0, computer = 0, gamesPlayed = 0;// initalizes int variables
      Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.
    
      do { 
      
         computer = (int)(Math.random()*3+1); // generates random number between 1-3
      
         System.out.println("\nCHEAT CODE ENABLED: The computer has played: " + computer);//enables cheat code
      
      // -- Program Execution and Program Output Section --
         System.out.printf("\nPlease enter 1 2 or 3 (aka Rock, Paper, or Scissors): ");
         while (!uI.hasNextInt()) //checks if the input is an integer
         { 
            System.out.println("You did not enter an integer as a play. Please play again."); // checks if user put a valid input
            uI.next(); // moves the scanner input to next token
         } 
      
         play = uI.nextInt(); // takes user input for user play 
         if (play < 1 || play > 3) { // double checks if user put number to correlate with Rock paper scissors game
            System.out.println("That number is not 1, 2, or 3, therefore does not correspond to Rock, Paper, or Scissors. Please play again."); // output if user does not enter valid input
            
         } else { // checks if number is 1 2 or 3 
            System.out.println("The computer plays: "+ computer); // CHEAT CODE displays what computer played
         }
         
        
              // Execution & Output if user Wins
         if ((computer == 1 && play == 2) || (computer == 2 && play == 3) || (computer == 3 && play == 1) ) { // all combinations of user wins when playing rock paper scissors
            userWins ++;
            gamesPlayed ++;
            System.out.printf("\nYou win the point! \n"); // output to user when they win against the computer
            System.out.println("\n# of Games Played: "+gamesPlayed); // allows user to keep track of number of games played
              //  Execution & Output if user Loses
         } else if ((computer == 1 && play == 3) || (computer == 2 && play == 1) || (computer == 3 && play == 2) ) { // all combinations of comp wins when playing rock paper scissors
            computerWins ++;
            gamesPlayed ++; // adds to the total game count
            System.out.printf("\nThe computer wins the point. \n"); // outputs to user when comp wins 
            System.out.println("\n# of Games Played: "+gamesPlayed); // allows user to keep track of number of games played
         
               // Execution & Output if user ties
         } else if (computer == play) { // game count remains same when tie occurs
            System.out.printf("\nYou tied! No one gets a point. \n");
         }
         
      }  while ( (computerWins < 2) && (userWins < 2) );
      
      if (computerWins - userWins == 2) { // if the computer wins by 2 
         System.out.println("\nSorry, you lose. The computer won best 2/3 games (not including any ties).");
         System.out.printf("\nYour Score: "+userWins+"\nComputer's Score: "+computerWins+"\nTotal Games Played: "+gamesPlayed+"\n");
      } else if (userWins - computerWins == 2) { // if the user wins by two
         System.out.println("\nCongrats, you won! You won best 2/3 games (not including any ties)");
         System.out.printf("\nYour Score: "+userWins+"\nComputer's Score: "+computerWins+"\nTotal Games Played: "+gamesPlayed+"\n");
      }
   
    
   } // close main for methodRoomFourCheat

   private static void methodRoomFourRegular() {
   
   // -- Variable declaration and initialization 
   
      int userWins = 0; // number of times the user has won
      int computerWins = 0; // number of times the computer has won
      int play = 0; // user play
      int computer = 0; // computer play
      int gamesPlayed = 0; // number of games played in a match
   
      Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.
   
   // -- Program Execution & Program Output Section
   
      do { // for Rock paper scissors game no cheat
      
         computer = (int)(Math.random()*3+1); // generates random number between 1 and 3
      
         System.out.printf("\nPlease enter 1 2 or 3 (aka Rock, Paper, or Scissors): ");
         while (!uI.hasNextInt()) //checks if the input is an integer
         { 
            System.out.println("You did not enter an integer as a play. Please play again."); // checks if user put a valid input
            uI.next(); // moves the scanner input into the next token
         } 
      
         play = uI.nextInt(); // takes user input for user play 
         if (play < 1 || play > 3) { // checks if number inputted is not a play that corresponds to rock paper or scissors
            System.out.println("That number is not 1, 2, or 3, therefore does not correspond to Rock, Paper, or Scissors. Please play again.");
            
         } else { // checks if number IS 1 2 or 3 
            System.out.println("The computer plays: "+computer); // displays what the computer plays
         }
         
        // Execution and Output if User wins
         if ((computer == 1 && play == 2) || (computer == 2 && play == 3) || (computer == 3 && play == 1) ) {
            userWins ++;
            gamesPlayed ++;
            System.out.printf("\nYou win the point! \n");
   
         // Execution and Output if User Loses
         } else if ((computer == 1 && play == 3) || (computer == 2 && play == 1) || (computer == 3 && play == 2) ) {
            computerWins ++;
            gamesPlayed ++; // adds to the total game count
            System.out.printf("\nThe computer wins the point. \n");
         
         // Execution and Output Where User is Tied
         } else if (computer == play) { // if tie occurs, game count does not change
            System.out.printf("\nYou tied! Therefore no one gets a point and this does not count as a Game Played. \n");
         }
         
      }  while ( (computerWins - userWins < 2) && (userWins - computerWins < 2) ); // loops game once someone wins by two
      
      // Execution and Output when someone wins
      if (computerWins - userWins == 2) { // if the computer wins by 2 
         System.out.println("\nSorry, but the computer wins this match because they won 2 more games/points than you.");
         System.out.printf("\nYour Score: "+userWins+"\nThe Computer's Score: "+computerWins+"\nTotal Games Played: "+gamesPlayed+"\n");
      } else if (userWins - computerWins == 2) { // if the user wins by two
         System.out.println("\nCongrats! You won this match because you won more games/points than the computer!.");
         System.out.printf("\nYour Score: "+userWins+"\nThe Computer's Score: "+computerWins+"\nTotal Games Played: "+gamesPlayed+"\n");
      }
   
    
   } // close main for methodRoomFourNoCheat


   public static void main (String [] args) {
   
   // --- Variable Declaration and Initialization
   
      boolean playAgain = true;
      int lives = 5;
   
   
      do {
      
         String userName = "";
         int roomChoice = 0, computerNumber = 0, userGuess = 0, tries = 3;
         int rock = 0, paper = 0, scissors = 0;
         String userPlay = "", computerPlay = "";
         boolean cheatCode = false;
         boolean repeatRoom = true;
         String [] prize = {"ROCK", "PAPER", "SCISSORS"}; // used for array 
      
         Scanner uI = new Scanner (System.in); // Creates the scanner object called uI that will accept input from the keyboard.
      
      
      //instructions
         System.out.println("Hello and Welcome to 'The Escape Room' Game. ");
         System.out.println("Below are listed the instructions:\n");
         System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         System.out.println("Each player will initially have a life count of 5.\nThere will be 4 rooms for you to choose from\nRooms 1 through 3 will challenge the user to a number guessing game where the user must correctly guess the random number generated by the computer in three tries.\n     The first room will have numbers 1,2,3 to guess from.\n     The second room will have 1 through 4.\n     The third room will have 1 through 5.");
         System.out.println("Successful guessing in each of the room will award the user a prize of a rock, or a piece of paper or a pair of scissor.\nFailed attempts at guessing the correct number will result in a life being lost.\nAfter a win or a loss in each room the user will be give the option to leave the room for the lobby where they can select the next room.\nThe fourth and final room will remain locked until the user has acquired all three items.\n      In the fourth room the user will face off in a best of 3 match of Rock, Paper, Scissors.\n      The result of this match will determine the users win or loss of the entire game.");
         System.out.println("Good luck! The game will now begin");
         System.out.println( "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      
      // --User Input section
      
      //name input
         System.out.print("After you have read the instructions, please enter your name: ");
         userName = uI.nextLine(); //allows user to input name
      
      
      //for cheat code
         if (userName.equalsIgnoreCase("cheat")) {
            cheatCode = true;
         }
       
      
         do { 
         
         // Home Page
            System.out.printf("Welcome to the Home Page %s! You currently have %d lives left. Which room would you like to enter? Please type in 1, 2, or 3.\n",userName,lives);
            while (!uI.hasNextInt()) //checks if the input is an integer
            { 
            
               System.out.println("You did not enter an room option. Please type in 1, 2, or 3 to go to a room."); // outputs this to user if invalid input is entered
               uI.next(); // moves scanner input into the next token
            } 
         
            roomChoice = uI.nextInt(); // allows the user to enter a room number 
         
            if (roomChoice < 1 || roomChoice > 3) {
               System.out.println("You did not enter an room option. Please type in 1, 2, or 3 to go to a room."); // outputs this to user if invalid input is entered
            
            
               uI.next(); // moves scanner input into the next token
            } 
         
            switch (roomChoice) { // initiates a switch for different rooms 
            
            // -- Program Execution  & Program Output Section
            
            // ROOM ONE
            
               case (1):
               
                  if (rock == 1) {
                     System.out.printf("Sorry, you cannot enter the room as you already won prize %s. You will now be taken back to the Home Page. \n",prize[0]); // user cannot enter room again once they won the prize
                     break; 
                  }  
                  repeatRoom = true;
               
                  System.out.println("Welcome to room 1");
               
                  do {
                  
                     tries = 3;
                  
                     computerNumber = (int)(Math.random()*3+1); // generates a random number between 1 and 3
                  
                     if (cheatCode == true) {
                        System.out.println("CHEAT CODE ENABLED: The number the computer generated was: "+computerNumber); // cheat code: lets user know what number is generated by computer
                     }
                  
                     for (int i = 1; i < 4; ++i) { // initiates for loop so that user cannot guess more than 3 times
                     
                        System.out.println("Please guess a number between 1 - 3 inclusive:");
                        while (!uI.hasNextInt()) //checks if the input is an integer
                        { 
                           System.out.println("Invalid input. Please enter 1, 2, or 3.");
                           uI.nextLine(); // moves scanner input into the next token
                        }
                     
                        userGuess = uI.nextInt(); // allows user to guess a number
                     
                        if (userGuess > 3 || userGuess < 1) { 
                           System.out.println("That is not an option."); // outputs this to user if invalid input 
                           uI.nextLine();
                        }
                        
                        else if (userGuess == computerNumber) { // if user guess is the same as computer number, outputs the following 
                           rock++; // gives prize of rock out since user won
                           System.out.printf("You guessed correctly! You have received the prize %s.\n",prize[0]); // user gets prize
                           System.out.println("The number the computer generated was: "+computerNumber); // tells user what the computer number is 
                           break; 
                        }
                        
                        else if (userGuess != computerNumber)  { // if user does not guess the same as computer
                           tries --;
                           System.out.println("You guessed incorrectly. You have "+tries+" tries left.");
                        }
                     
                     } // for loop ended for case 1
                  
                     if (rock == 0) { // checks if user won prize
                        lives --; // if they didnt, they lose a life
                        System.out.println("You did not guess the correct number within 3 tries. You lose a life."); // output to tell user they will lose a life
                     } 
                  
                     System.out.println("You have "+lives+" lives left.");  // tells user the amount of lives left  
                     System.out.println("Do you want to play again? Enter true to replay in this room and false if you would like to return to the homepage:");
                  
                     while (!uI.hasNextBoolean()) //checks if the input is a boolean value
                     { 
                        System.out.println("Invalid input. Enter true to replay in this room and false if you would like to return to the homepage:");
                        uI.next(); // moves scanner input into the next token
                     }
                  
                     repeatRoom = uI.nextBoolean(); 
                  
                     if (rock == 1) { // user cannot play again if they already won
                        while (repeatRoom == true) {
                           System.out.println("Sorry, you already won the prize rock in this room, you must leave and type in false:");
                        
                           while (!uI.hasNextBoolean()) //checks if input is boolean value
                           { 
                              System.out.println("Invalid input. Enter true to replay in this room and false if you would like to return to the homepage:");
                              uI.next(); // moves scanner input into the next token
                           }
                        
                           repeatRoom = uI.nextBoolean();
                        
                        }
                     } // close if statement 
                  
                  
                  } while ( (repeatRoom == true || userGuess > 3 || userGuess < 1 ) && lives > 0); // loops if user wants to replay the game or if there is an invalid input
               
                  if (lives > 0) {
                     System.out.println("You have left room 1. \n"); // ensures the user has not run out of lives
                  }
               
                  break; // case (1) over
            
            //ROOM TWO
            
               case (2):
               
                  if (paper == 1) { // prevents user from entering the room if they already won the the prize paper
                     System.out.printf("You already won the prize %s in this room (Room 2). You will now be taken back to the Home Page.\n",prize[1]); 
                     break; 
                  }
               
               
                  repeatRoom = true; // allows user to replay the room if they enter true 
               
                  System.out.println("You have entered room 2!");
               
                  do {
                  
                     tries = 3;
                  
                     computerNumber = (int)(Math.random()*4+1); // computer generates random number between 1-4
                  
                     if (cheatCode == true) {
                        System.out.println("CHEAT CODE ENABLED: The number the computer generated was: "+ computerNumber);// Cheat Code: Tells user what the computer generated number is 
                     }
                  
                     for (int i = 1; i < 4; ++i) { // starts for loop so user cannot guess more than 3 times
                     
                        System.out.println("Please guess a number between 1 - 4 inclusive:");
                        while (!uI.hasNextInt()) //checks if the input is an integer
                        { 
                           System.out.println("Invalid input. Please enter 1, 2, 3, or 4.");
                           uI.nextLine(); // moves scanner input into the next token
                        }
                     
                        userGuess = uI.nextInt(); 
                     
                        if (userGuess > 4 || userGuess < 1) { // invalid input, tells user to enter valid input
                           System.out.println("That is not an option. Please enter 1, 2, 3 or 4");
                           uI.nextLine();
                        }
                        // user wins
                        else if (userGuess == computerNumber) { 
                           paper ++;
                           System.out.printf("You guessed correctly! You have received the prize %s.\n",prize[1]);
                           System.out.println("The number the computer generated was: "+computerNumber);
                           break; 
                        }
                        // computer wins    
                        else if (userGuess != computerNumber)  {
                           tries --;
                           System.out.println("You guessed incorrectly. You have "+tries+" tries left. \nPlease guess again:"); 
                        }
                     
                     }
                  
                     if (paper == 0) { // program sees if user won prize paper
                        lives --; // if they did not, will lose a life
                        System.out.println("You did not guess the correct number within 3 tries. You lose a life."); // user did not guess in 3 tries, therefore they lose a life
                     }
                  
                  
                     System.out.println("You have "+lives+" lives left."); // indicates how many lives user has
                     System.out.println("Would you like to play in this room again? Type true to replay, and false to return to the Home Page:");
                  
                     while (!uI.hasNextBoolean()) //checks if the input is a boolean value
                     { 
                        System.out.println("Invalid input. Please type true to replay Room 2 or false to return to the Home Page.");
                        uI.next(); // moves scanner input into the next token
                     }
                  
                     repeatRoom = uI.nextBoolean();
                  
                     if (paper == 1) { // checks if user won the prize paper already, if so they must leave the game
                        while (repeatRoom == true) {
                           System.out.println("Sorry, you already won prize paper in this room, therefore, you must leave the room by entering false:");
                        
                           while (!uI.hasNextBoolean()) //checks if the input is a boolean value
                           { 
                              System.out.println("Invalid input. Please enter true to replay Room 2 or false to return to Home Page.");
                              uI.next(); // moves scanner input into the next token
                           }
                        
                           repeatRoom = uI.nextBoolean();
                        }
                     }
                  
                  } while ( (repeatRoom == true || userGuess > 4 || userGuess < 1 ) && lives > 0); // if user wants to replay, will loop to start, or if user enters invalid input     
                  if (lives > 0) {
                     System.out.println("You have left Room 2. \n");
                  }
               
                  break; // ends case 2
            
            
            //ROOM THREE
            
               case (3):
               
                  if (scissors == 1) {
                     System.out.printf("You already won the prize %s in this room (Room 3). You will now be taken back to the Home Page. \n",prize[2]); // does not allow user to re-enter the room if they already won the prize of scissors
                     break; 
                  }
               
               
                  repeatRoom = true; // allows user to replay the room when entering true in the form of a boolean
               
                  System.out.println("You have entered room 3!");
               
                  do {
                  
                     tries = 3;
                  
                     computerNumber = (int)(Math.random()*5+1); // computer generates random number between 1-5
                  
                     if (cheatCode == true) {
                        System.out.println("CHEAT CODE ENABLED: The number the computer generated was: "+computerNumber); // Cheat code: tells user the number the computer generated so they can win easily 
                     }
                  
                     for (int i = 1; i < 4; ++i) { // initiates for loop where user is limited to 3 tries
                     
                        System.out.println("Please guess a number between 1 - 5 inclusive:");
                        while (!uI.hasNextInt()) //checks if the input is an integer
                        { 
                           System.out.println("Invalid input. Please enter 1, 2, 3, 4, or 5.");
                           uI.nextLine(); // moves scanner input into the next token
                        }
                     
                        userGuess = uI.nextInt(); // allows user to guess a number
                     
                        if (userGuess > 5 || userGuess < 1) { // detects if user inputs invalid number that is not within range
                           System.out.println("That is not an option. Please enter 1, 2, 3, 4, or 5.");
                           uI.nextLine(); // allows user to re-enter a number 
                        }
                        // - User Wins 
                        else if (userGuess == computerNumber) { 
                           scissors ++;
                           System.out.printf("You guessed correctly! You have received the prize %s.\n",prize[2]);
                           System.out.println("The number the computer generated was: "+computerNumber);
                           break; 
                        }
                        // - Computer Wins      
                        else if (userGuess != computerNumber)  {
                           tries --;
                           System.out.println("You guessed incorrectly. You have "+tries+" tries left. \nPlease guess again:");
                        }
                     
                     }
                  
                     if (scissors == 0) { // checks if user won the prize of scissors in 3 tries
                        lives --; // if not, removes a life
                        System.out.println("You did not guess the correct number within 3 tries. You lost a life.");
                     }
                  
                  
                     System.out.println("You have " + lives + " lives left."); // tells user how many lives they have 
                     if (lives == 0) // if the lives are 0, then leave
                        break;
                  
                     System.out.println("Would you like to play Room 3 again? Please enter true replay or false to return to the Home Page:");
                  
                     while (!uI.hasNextBoolean()) //checks if the input is a boolean value
                     { 
                        System.out.println("Invalid input. Please enter true to replay Room 3 or false to return to the Home Page:");
                        uI.next(); // moves scanner input into the next token
                     }
                  
                     repeatRoom = uI.nextBoolean(); // allows user to input if they want to replay room 3 or not
                  
                     if (scissors == 1) { // User cannot replay the room if they already won prize scissors
                        while (repeatRoom == true) {
                           System.out.println("Sorry, since you already won the prize scissors in this room, you must leave the room by typing in false:");
                        
                           while (!uI.hasNextBoolean()) //checks if the input is a boolean value
                           { 
                              System.out.println("Invalid input. Please enter true to replay Room 3 or false to return to the Home Page:");
                              uI.next(); // moves scanner input into the next token
                           }
                        
                           repeatRoom = uI.nextBoolean();
                        } //closes while loop
                     }
                  
                  
                  
                  } while ( (repeatRoom == true || userGuess < 1  || userGuess > 5) && lives > 0); // loops back to start of room 3 if user enters true or invalid input and still has lives  
                  if (lives > 0) { 
                     System.out.println("You left room 3. \n");
                  }
               
               
                  break; // ends case (3)
            
            } // close switch
         
         // fourth room is unlocked if user gets all three prizes while cheat code is implemented
            if (rock == 1 && paper == 1 && scissors == 1 && cheatCode == true) {
               System.out.println("CONGRATS! You have now entered room 4, where you will now be up for the last challenge of rock paper scissors!");
               methodRoomFourCheat();
               break;
            }
         // fourth room is unlocked if user gets all three prizes normally without cheat code
         
            if (rock == 1 && paper == 1 && scissors == 1 && cheatCode == false) {
               System.out.println("CONGRATS! You have now entered room 4, where you will now be up for the last challenge of rock paper scissors!");
               methodRoomFourRegular();
               break;
            }
         
         // ends game if all lives are done   
            if (lives == 0) { 
               System.out.println ("Sorry, you have lost all your lives and the game is over.");
               break;
            }
         
         } while (repeatRoom == false || lives > 0); // do while loop returns to top if user does not want to replay the room and is not out of lives
      
      
      // end of Rock Paper Scissor Game
         System.out.println("\nThank you for playing! Would you like to play the Escape Room Game again? Enter true to replay, and false to end the game:");
      
         while (!uI.hasNextBoolean()) //ensures if input is a boolean value
         { 
            System.out.println("Invalid input. Please enter false to leave the game or true to replay.");
            uI.next(); // moves scanner input to next token
         }
         
         playAgain = uI.nextBoolean();
      
      } while (playAgain == true); // repeats game if user inputs 'true'
             
      System.out.println("Good-Bye.");
   
   } // close main ()
   
} // close class escaperoom.java