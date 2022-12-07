import java.text.DecimalFormat;
import java.util.Scanner;


public class PokemonCardSellerRunner {
    public static void main(String[] args) {



        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input= new Scanner(System.in);
        PokemonCardSeller answer = new PokemonCardSeller();

        System.out.println("Welcome to The Local Pokemon Trading Center! Below are our cards and prices.");
        System.out.println(answer.prices());
        System.out.println("Are you ready to begin? Enter Yes to begin or No to end the simulation.");
        String response = input.nextLine();
        boolean random1 = answer.methodRun(response);
        System.out.println();


        while (random1 == true) {
            System.out.println("Before you begin, note these rules: \n 1: You can enter -911 to get a random number of items up to 10. \n 2: Any number less than -1 or higher than Java's max integer will automatically be inputted as 0 or result in a java error. \n 3: If you do not wish to not buy a card then enter 0.");
            System.out.println();
            System.out.println("How many charizard cards would you like to buy?");
            int one = input.nextInt();
            one = answer.randomOutput(one);
            if (answer.verifyPositive(one) == false || one > Integer.MAX_VALUE) {
                one = 0;
            }
            answer.numCharCards(one);
            System.out.println();

            System.out.println("How many squirtle cards would you like to buy?");
            int two = input.nextInt();
            two = answer.randomOutput(two);
            if (answer.verifyPositive(two) == false || two > Integer.MAX_VALUE) {
                two = 0;
            }
            answer.numSquirtleCards(two);
            System.out.println();

            System.out.println("How many pikachu cards would you like to buy?");
            int three = input.nextInt();
            three = answer.randomOutput(three);
            if (answer.verifyPositive(three) == false || three > Integer.MAX_VALUE) {
                three = 0;
            }
            answer.numPikachuCards(three);
            System.out.println();

            System.out.println("How many mewtwo cards would you like to buy?" );
            int four = input.nextInt();
            four = answer.randomOutput(four);
            if (answer.verifyPositive(four) == false || four > Integer.MAX_VALUE) {
                four = 0;
            }
            answer.numMewtwoCards(four);
            System.out.println();

            System.out.println("How many bulbasaur cards would you like to buy?");
            int five = input.nextInt();
            five = answer.randomOutput(five);
            if (answer.verifyPositive(five) == false || five > Integer.MAX_VALUE) {
                five = 0;
            }
            answer.numBulbasaurCards(five);
            System.out.println();

            System.out.println("How many snorlax cards would you like to buy?");
            int six = input.nextInt();
            six = answer.randomOutput(six);
            if (answer.verifyPositive(six) == false || six > Integer.MAX_VALUE) {
                six = 0;
            }
            answer.numSnorlaxCards(six);
            System.out.println();

            System.out.println("How many raichu cards would you like to buy?");
            int seven = input.nextInt();
            seven = answer.randomOutput(seven);
            if (answer.verifyPositive(seven) == false || seven > Integer.MAX_VALUE) {
                seven = 0;
            }
            answer.numRaichuCards(seven);
            System.out.println();

            PokemonCardSeller answer2 = new PokemonCardSeller(one,two,three,four,five,six,seven);

            System.out.println("<-------------------------------------->");
            System.out.println("The Local Pokemon Trading Center");
            System.out.println("29 Fort Greene Pl, Brooklyn, NY 11217");
            System.out.println();
            System.out.println(answer2);
            System.out.println();
            System.out.println("Total Cost: $" + df.format(answer2.getTotal()));
            System.out.println("<-------------------------------------->");

            random1 = false;
        }


    }
}

