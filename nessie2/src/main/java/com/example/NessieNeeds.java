package com.example;
import java.util.Scanner;

public class NessieNeeds {
    public static void main(String args[])
    {
        /* Nessie is a very demanding dog. She does not speak English, but
        she is pretty good at getting me to understand what she wants.
         */
        int response1 = 1;
        String input = "";

        System.out.println("Nessie is an 80 pound Bouvier Des Flanders Dog. She is whining.\n" +
                "Answer the following questions to figure out what the heck she wants now. ");

        while (response1 >= 1 && response1 <= 4){
            System.out.println("What time is it? (Enter a number between 1 and 4. ");
            System.out.println("1. Between 7 pm and 5 am.");
            System.out.println("2. Between 5 am and 7 am.");
            System.out.println("3. Between 7 am and 4pm");
            System.out.println("4. Between 4 pm and 7pm");

            Scanner user_input = new Scanner( System.in );
            input = user_input.next();

            response1 = Integer.parseInt(input);
            switch(response1){
                case 1:
                    night();
                    response1 = 0;
                    break;
                case 2:
                    morning();
                    response1 = 0;
                    break;
                case 3:
                    day();
                    response1 = 0;
                    break;
                case 4:
                    evening();
                    response1 = 0;
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");

            }






        }
    }

    public static void night()
    {
        System.out.println("Is Ollie-Bear in her spot on the bed? (y/n)  ");
        Scanner bed_input = new Scanner (System.in);
        String bed = bed_input.next();
        if (bed.startsWith("Y") || bed.startsWith("y")){
            System.out.println("She wants you to kick Bear out of bed. She will keep whining until you\n" +
                    "do, or until you get up and go to the bathroom so he follows you and she can take\n" +
                    "his place.");
        }
        else{
            System.out.println("She wants to go outside. Better get up and let her out.");


        }
    }

    private static void day()
    {
        System.out.println("Did you just come home from work? (y/n)  ");
        Scanner work_input = new Scanner (System.in);
        String work = work_input.next();
        if(work.startsWith("Y") ||work.startsWith("y")){
            System.out.println("She and Ollie want to go outside and PLAY");
        }
        else{
            System.out.println("Ask Nessie what she wants. Follow her. She will either take you " +
            "to the back door or the cookie jar. She either wants outside or a treat.");

        }
    }

    private static void evening()
    {
        System.out.println("Have you fed the dogs dinner? (y/n)  ");
        Scanner fed_input = new Scanner (System.in);
        String fed = fed_input.next();
        if(fed.startsWith("Y") || fed.startsWith("y")){
            System.out.println("Ask Nessie what she wants. Follow her. She will either take you " +
                    "to the back door or the cookie jar. She either wants outside or a treat.");
        }
        else{
            System.out.println("She wants her dinner. Hurry up and feed her.  ");

        }
    }

    private static void morning(){
        System.out.println("Are both dogs trying desperately to wake you up? (y/n)  ");
        Scanner wake_input = new Scanner (System.in);
        String wake = wake_input.next();
        if(wake.startsWith("Y") || wake.startsWith("y")){
            System.out.println("They want to be fed. Better hurry up and feed them before they wake " +
                    "the whole neighborhood");
        }
        else{
            System.out.println("Bear must have already gone down stairs, better hurry down to let" +
            " them out and feed them so you don't have to clean up a mess. ");

        }
    }
}
