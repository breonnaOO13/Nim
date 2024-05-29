import java.util.Scanner;

class GameRunner {
  
  public static void play(String nameOne, String nameTwo, int pieceNum) {
    Scanner sc = new Scanner(System.in);
    
    int round = 1;
    Boolean playing = true;
    int num1;
    
    while (playing)
    {
      
      if (pieceNum > 1)
      { 
      
        System.out.println();
        System.out.println("* Round " + round + " *");
        System.out.println();
        System.out.println("There are currently " + pieceNum + " pieces");
        System.out.print(nameOne + ", how many pieces do you wish to take?");
        num1 = sc.nextInt();  
      
        
        if (num1 <= (pieceNum/2)){
          pieceNum -= num1;
        } else { 
          while (num1 > (pieceNum/2))
          {
            System.out.println("Oops! That is more than half of the number of current pieces");
            System.out.println("Go ahead and choose another number under " + ((pieceNum/2) + 1) + "!");
            num1 = sc.nextInt();
          } 
          pieceNum -= num1;
        }
      } else {
        System.out.println("Looks like there is only one left! Congratulations " + nameTwo + "!!");
        System.out.println("Good effort " + nameOne + "!");
        playing = false;
        pieceNum = 0;
      }
  
      if (pieceNum > 1)
      { 
      
        System.out.println("There are now " + pieceNum + " pieces");
        System.out.print(nameTwo + ", how many pieces do you wish to take?");
        num1 = sc.nextInt();
        
        if (num1 <= (pieceNum/2)){
          pieceNum -= num1;
        } else {
          while (num1 > (pieceNum/2))
          {
            System.out.println("Oops! That is more than half of the number of current pieces");
            System.out.println("Go ahead and choose another number!");
            num1 = sc.nextInt();
          } 
          pieceNum -= num1;
        }
      } else if (pieceNum == 0){
        System.out.println();
      } else {
        System.out.println("Looks like there is only one left! Congratulations " + nameOne + "!!");
        System.out.println("Good effort " + nameTwo + "!");
        playing = false;
        pieceNum = 0;
      }
      round++;
    }
    
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to Nim!");
    
    System.out.println("Player1, enter your name:");
    String name1 = sc.nextLine();   
    System.out.println("Welcome " + name1 + "!");
  
    System.out.println();
  

    System.out.println("Player2, enter your name:");
    String name2 = sc.nextLine();  
    System.out.println("Welcome " + name2 + "!");
    
    System.out.println("Now lets begin!");
    

    int pieces = (int)(Math.random() * 40) + 10; //randomizing the starting value

    play(name1, name2, pieces);
    
  }
  
}

