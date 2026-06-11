package Projects;

import java.util.Scanner;

public class Guessinggame {
    static void main(String[] args) {


        int number = (int)((Math.random()*100)+1);
        Scanner sc = new Scanner(System.in);
        int guess = 0;


        do{
            System.out.println("guess the word between 1-100");
            guess = sc.nextInt();

            if(guess<number){
                System.out.println("too less try again");
            } else if(guess>number){
                System.out.println("too high try again");
            }else System.out.println("Congratulation you won");
        }while(guess != number);
    }
}
