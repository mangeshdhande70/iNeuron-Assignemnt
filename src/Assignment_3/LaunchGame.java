package Assignment_3;


import java.util.*;

class Guesser
{
    int guessNum;

    int guessNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
    int guessNum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum();
    }
    void collectNumFromPlayers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        System.out.println("Enter for 1st Player");
        numFromPlayer1=p1.guessNum();

        System.out.println("Enter for 2st Player");
        numFromPlayer2=p2.guessNum();

        System.out.println("Enter for 3rd Player");
        numFromPlayer3=p3.guessNum();
    }
    void compare(int chance)
    {
        int count = 1;
        while (chance > 0)
        {
            System.out.println(count+" Chance");
            if (numFromGuesser == numFromPlayer1) {
                if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                    System.out.println("All players won the game");
                } else if (numFromGuesser == numFromPlayer2) {
                    System.out.println("Player 1 & Player2 won");
                } else if (numFromGuesser == numFromPlayer3) {
                    System.out.println("Player 1 & Player3 won");
                } else {
                    System.out.println("Player 1 won the game");
                }
            } else if (numFromGuesser == numFromPlayer2) {
                if (numFromGuesser == numFromPlayer3) {
                    System.out.println("Player 2 & Player3 won");
                } else {
                    System.out.println("Player 2 won the game");
                }
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 3 won the game");
            } else {
                collectNumFromPlayers();
                chance--;
            }
        }
        if (chance <= 0)
            System.out.println("Chances Finished! Players Loss the Game");

    }

}

public class LaunchGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many chances you want : ");
        int chances = scan.nextInt();

        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare(chances);

    }

}
