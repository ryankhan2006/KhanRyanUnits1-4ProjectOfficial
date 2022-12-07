import java.lang.String;
import java.text.DecimalFormat;
/**
 * The PokemonCardSeller class represents a simulation of the store. A simulation includes the Pokemon cards Pikachu, Charizard, Squirtle, Mewtwo, Bulbasaur, Raichu, and Snorlax. It also includes the net total of what cards the user wants to purchase.
 */
public class PokemonCardSeller {
    private int charizard;
    private int squirtle;
    private int pikachu;
    private int mewtwo;
    private int bulbasaur;
    private int snorlax;
    private int raichu;

    private double total;
    /**
     * This is used to round the costs of the items.
     */
    DecimalFormat df = new DecimalFormat("0.00");
    /**
     * Constructor for the PokemonCardSeller class. This creates a new instance of a Simulation with or without the parameters below.
     */
    public PokemonCardSeller() {

    }
    public PokemonCardSeller(int charizard, int squirtle, int pikachu, int mewtwo, int bulbasaur, int snorlax, int raichu) {
        this.charizard = charizard;
        this.squirtle = squirtle;
        this.pikachu = pikachu;
        this.mewtwo = mewtwo;
        this.bulbasaur = bulbasaur;
        this.snorlax = snorlax;
        this.raichu = raichu;
    }
    /**
     * methodRun method for the PokemonCardSeller class. This method will return false if the user input is no, or return true if the user input is yes.
     * @param input is a string representing the user's input about if the simulation is going to run or not.
     * @return returns true if the user enters yes to continue, returns false if user does not want the program to run.
     */
    public boolean methodRun(String input) {
        String input2 = input.toLowerCase();
        if (input2.indexOf("yes") != -1) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * randomOutput method will generate a random number so the user will be granted a random amount of pokemon cards for one specific type (0-10 cards)
     * @param random1 an integer that represents if the user wishes to get a random number of pokemon cards. User must enter -911 to generate a random number.
     * @return returns a random number from 0 to 10.
     */
    public int randomOutput(int random1) {
        int random2 = 0;
        if (random1 == -911) {
            random2 = (int) (Math.random() * 10);
        } else {
            random2 = random1;
        }
        return random2;
    }
    /**
     * verifyPositive method will verify if the number is a positive integer.
     * @param amount an integer that represents the user input for the amount of cards the user wants to buy.
     * @return returns true if the user input is positive, returns false if it is not positive (negative).
     */
    public boolean verifyPositive(int amount) {
        if (amount >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * numCharCards method stores the amount of charizard cards the user purchases to the charizard variable.
     * @param amount an integer that represents the amount of charizard cards the user bought
     */
    public void numCharCards(int amount) {
        charizard = amount;
    }

    /**
     * numSquirtleCards method stores the amount of squirtle cards the user purchases to the squirtle variable.
     * @param amount an integer that represents the amount of squirtle cards the user bought
     */
    public void numSquirtleCards(int amount) {
        squirtle = amount;
    }

    /**
     * numPikachuCards method stores the amount of pikachu cards the user purchases to the pikachu variable.
     * @param amount an integer that represents the amount of pikachu cards the user bought
     */
    public void numPikachuCards(int amount) {
        pikachu = amount;
    }

    /**
     * numMewtwoCards method stores the amount of mewtwo cards the user purchases to the mewtwo variable.
     * @param amount an integer that represents the amount of mewtwo cards the user bought
     */
    public void numMewtwoCards(int amount) {
        mewtwo = amount;
    }

    /**
     * numBulbasaurCards method stores the amount of bulbasaur cards the user purchases to the bulbasaur variable.
     * @param amount an integer that represents the amount of bulbasaur cards the user bought
     */
    public void numBulbasaurCards(int amount) {
        bulbasaur = amount;
    }

    /**
     * numSnorlaxCards method stores the amount of snorlax cards the user purchases to the snorlax variable.
     * @param amount an integer that represents the amount of snorlax cards the user bought
     */
    public void numSnorlaxCards(int amount) {
        snorlax = amount;
    }

    /**
     * numRaichuCards method stores the amount of raichu cards the user purchases to the raichu variable.
     * @param amount an integer that represents the amount of raichu cards the user bought
     */
    public void numRaichuCards(int amount) {
        raichu = amount;
    }

    /**
     * costCharCards method finds the total cost of charizard cards with the total variable and calculates the total cost of the charizard cards.
     * @param charizard represents the amount of charizard cards the user bought
     * @param cost represents the cost of each charizard card.
     * @return returns the total cost of the charizard cards
     */
    public double costCharCards(int charizard, double cost) {
        double cost1 = 0;
        cost1 = cost*charizard;
        total = total + cost1;
        return cost1;
    }

    /**
     * costSquirtleCards method finds the total cost of squirtle cards with the total and calculates the total cost of the squirtle cards.
     * @param squirtle represents the amount of squirtle cards the user bought
     * @param cost represents the cost of each squirtle card.
     * @return returns the cost of the squirtle cards
     */
    public double costSquirtleCards(int squirtle, double cost) {
        double cost1 = 0;
        for (int i =1; i <= squirtle; i++) {
            cost1 = cost + cost1;
        }
        total = total + cost1;
        return cost1;
    }

    /**
     * costPikachuCards method finds the total cost of pikachu cards with the total and calculates the total cost of the pikachu cards.
     * @param pikachu represents the amount of pikachu cards the user bought
     * @param cost represents the cost of each pikachu card.
     * @return returns the cost of the pikachu cards
     */
    public double costPikachuCards(int pikachu, double cost) {
        double cost1 = 0;
        for (int i =1; i <= pikachu; i++) {
            cost1 = cost + cost1;
        }
        total = total + cost;
        return cost1;
    }

    /**
     * costMewTwoCards method finds the total cost of mewtwo cards with the total and calculates the total cost of the mewtwo cards.
     * @param mewtwo represents the amount of mewtwo cards the user bought
     * @param cost represents the cost of each mewtwo card.
     * @return returns the cost of the mewtwo cards
     */
    public double costMewtwoCards(int mewtwo, double cost) {
        double cost1 = 0;
        for (int i =1; i <= mewtwo; i++) {
            cost1 = cost + cost1;
        }
        total = total + cost;
        return cost1;
    }

    /**
     * costBublasaurCards method finds the total cost of bulbasaur cards with the total and calculates the total cost of the bulbasaur cards.
     * @param bulbasaur represents the amount of bulbasaur cards the user bought
     * @param cost represents the cost of each bulbasaur card.
     * @return returns the cost of the bulbasaur cards
     */
    public double costBublasaurCards(int bulbasaur, double cost) {
        double cost1 = 0;
        for (int i =1; i <= bulbasaur; i++) {
            cost1 = cost + cost1;
        }
        total = total + cost;
        return cost1;
    }

    /**
     * costSnorlaxCards method finds the total cost of snorlax cards with the total and calculates the total cost of the snorlax cards.
     * @param snorlax represents the amount of snorlax cards the user bought
     * @param cost represents the cost of each snorlax card.
     * @return returns the cost of the snorlax cards
     */
    public double costSnorlaxCards(int snorlax, double cost) {
        double cost1 = 0;
        for (int i =1; i <= snorlax; i++) {
            cost1 = cost + cost1;
        }
        total = total + cost;
        return cost1;
    }

    /**
     * costRaichuCards method finds the total cost of raichu cards with the total and calculates the total cost of the raichu cards.
     * @param raichu represents the amount of raichu cards the user bought
     * @param cost represents the cost of each raichu card.
     * @return returns the cost of the raichu cards
     */
    public double costRaichuCards(int raichu, double cost) {
        double cost1 = 0;
        for (int i =1; i <= raichu; i++) {
            cost1 = cost + cost1;
        }
        total = total + cost;
        return cost1;
    }

    /**
     * total method returns the total cost.
     * @return returns total cost of all the users purchases.
     */
    public double getTotal() {
        return total;
    }

    /**
     * toString for the PokemonCardSeller class. This method will return a receipt of the user's purchases.
     * @return returns a string with the user's purchases along with the total cost.
     */
    public String prices() {
        String design = "|-------------------------|";
        String charizard = "Charizard --> $99.99";
        String squirtle = "Squirtle --> $49.99";
        String pikachu = "Pikachu --> $99.99";
        String mewtwo = "Mewtwo --> $149.99";
        String bulbasaur = "Bulbasaur --> $24.99";
        String snorlax = "Snorlax --> $4.99";
        String raichu = "Raichu --> $9.99";

        return design + "\n  " + charizard + "\n  " + squirtle + "\n  " +  pikachu +  "\n  " + mewtwo + "\n  "+ bulbasaur + "\n  "+ snorlax +"\n  "+ raichu +"\n"+ design;
    }

    public String toString() {
        String one = charizard + " charizard - " + "$" + df.format(Math.round(costCharCards(charizard, 99.99)*100.00)/100.00);
        String two = squirtle + " squritle - " + "$" + df.format(Math.round(costSquirtleCards(squirtle, 49.99)*100.00)/100.00);
        String three = pikachu + " pikachu - " + "$" + df.format(Math.round(costPikachuCards(pikachu, 99.99)*100.00)/100.00);;
        String four = mewtwo + " peaches - " + "$" + df.format(Math.round(costMewtwoCards(mewtwo, 149.99)*100.00)/100.00);
        String five = bulbasaur + " bulbasaur - " + "$" + df.format(Math.round(costBublasaurCards(bulbasaur, 24.99)*100.00)/100.00);
        String six = snorlax + " snorlax - " + "$" + df.format(Math.round(costSnorlaxCards(snorlax, 4.99)*100.00)/100.00);
        String seven = raichu + " raichu - " + "$" + df.format(Math.round(costRaichuCards(snorlax, 9.99)*100.00)/100.00);

        return one + "\n" + two + "\n" + three + "\n"  + four + "\n"  + five + "\n"  + six + "\n"  + seven;

    }

}


