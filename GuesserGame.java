import java.util.Scanner;
class Guesser
{
	int gnum;
	int guessingNum()
	{
	    System.out.println("Guesser, Kindly guess a number.");
	    Scanner scan= new Scanner(System.in);
	    gnum=scan.nextInt();
	    return gnum;
	}
}
class Player
{
    int pnum;
    int predictingNum()
    {
        System.out.println("Player, Kindly predict a number.");
        Scanner scan=new Scanner(System.in);
        pnum=scan.nextInt();
        return pnum;
    }
}

class Umpire
{
    int numFormGuesser;
    int numFormPlayer1;
    int numFormPlayer2;
    int numFormPlayer3;
    void collectNumFromGuesser()
    {
        Guesser g= new Guesser();
        numFormGuesser=g.guessingNum();
    }
    void collectNumFromPlayers()
    {
        Player p1=new Player();
        Player p2 =new Player();
        Player p3 =new Player();
        numFormPlayer1=p1.predictingNum();
        numFormPlayer2=p2.predictingNum();
        numFormPlayer3=p3.predictingNum();
    }
    void compare()
    {
        if(numFormPlayer1==numFormGuesser)
        { 
            System.out.println("Player1 has won the game.");
        }
        if(numFormPlayer2==numFormGuesser)
        {
            System.out.println("Player2 has won the game.");
        }
        if(numFormPlayer3==numFormGuesser)
        {
            System.out.println("Player3 has won the game.");
        }
        else
        {
            System.out.println("Game lost, Better Luck Next Time!!!");
        }
    }
}
class Main
{
    public static void main (String[] args) 
    {
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}