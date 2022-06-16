package summer;

import java.util.Scanner;

public class summer {
    public static class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int adventurer;
            String wordTwo = "love";
            wordTwo.equalsIgnoreCase("love");
            String wordOne = "i";
            wordOne.equalsIgnoreCase("i");
            String wordThree = "u";
            wordThree.equalsIgnoreCase("u");


            System.out.println("Welcome!\n"
                    + "You are an adventurer walking North along a fast flowing river. \n"
                    + "You are on a mission.\n " + "Mission: Try to find the princess. \n" +
                    " She was taken by the evil witch who was jealous of the magic she possesses.\n " +
                    "As your walking, you approach a bridge.\n" +
                    " UH OH! The troll who gate keeps the bridge wont let you pass!\n " +
                    "\"Hello adventurer, in order to pass you need to solve a riddle.\"\n" +
                    "\"It is indeed an easy one.\" \n" +
                    "\"Riddle: Which Letter of the alphabet is a part of your head.\" \n " +
                    "\"Choose any letter adventurer, and may the odds be in your favor. \" ");

            boolean I = false;
            boolean love = false;
            boolean u = false;

            while (!I || !love || !u) {

                wordOne = in.next();

                if (!I) {

                    System.out.println("Good Job! You collected the first letter \"I\" .");

                } else if (I) {

                    System.out.println("Wrong try adventurer, but you must try again");
                }

                System.out.println("You safely pass over the bridge, and a butterfly keeps hitting you in the face.\n " +
                        "\"PLEASE! I NEED HELP!\"." + "Said the butterfly. " +
                        " \"I have a riddle that I can not get out of my head, PLEASE help me!\"\n " +
                        " You reluctantly decide to help the annoying butterfly.\n" + "\"FINE!\" you said. \"What is it!\"\n "
                        + " The butterfly elegantly flew towards your ear, and whispered very softly.\n " +
                        "Riddle: I hurt the most when lost, yet also when not had at all. I am sometimes the hardest to express,\n " +
                        " but the easiest to ignore. I can be given to many, or just one. What word am I? ");


                wordTwo = in.next();

                if (!love) {

                    System.out.println("Good job! You collected the second word!");
                } else if (love) {
                    System.out.println("Mmmmm not quite. Keep trying! ");
                }


                System.out.println("As you look ahead you see the princess!" +
                        "She sees you too!\n" +
                        "BUT the nasty witch comes between you two!\n " +
                        "\"Hello my precious, you are only able to reach your princess if you are able to solve this LAST riddle.\"\n"
                        + "Riddle: Which letter is right front of you? \n");


                wordThree = in.next();

                if (!u) {
                    System.out.println("Congrats! You saved the princess! and solved the riddle!\n"
                            + "The princess ran to you with excitement in her eyes! \n" +
                            " \"I love you!\" she said");
                    System.out.println("The end");
                } else if (u) {
                    System.out.println("Mmmmm not quite. Try again.");
                }

            }
        }
    }
}
