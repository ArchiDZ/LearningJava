

/*You are an administrator at a football club who must categorize already played games on the team's website.
       The given program takes 3 inputs:
        1. match status - which checks if the match is suspended ("true") or not suspended ("false")
        2. your team's score
        3. opposing team's score.
        Complete the program so that if the match is suspended (the 1st input is "true"), it will output "Suspended".
        If the match is not suspended ( the1st output is false), the following statuses should be set depending on the match result: "Won", "Lost" and "Draw".*/

package FootballManager;
import java.util.Scanner;

public class FotMgm {
    public void manager() {


        Scanner read = new Scanner(System.in);
        boolean isSuspended = read.nextBoolean();
        int ourScore = read.nextInt();
        int theirScore = read.nextInt();
        if (isSuspended == true) {
            System.out.println("Suspended");
        } else System.out.println("False");
        if (ourScore>theirScore){System.out.println("Won");}




    }
}
