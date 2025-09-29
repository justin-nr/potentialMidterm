public class Game {
    public static void main(String[] args) {
        //testing for eveything
        Player test = new Player("Jimbo", "middle of nowhere");
        Hostile bandit = new Bandit();
        Hostile wolf = new Wolf();
        Hostile Ebandit = new EliteBandit();

        System.out.println("Hello " + test.getName() + " you are in the " + test.getLocation());
        System.out.println("but you see a broken city in the distance!");
        test.move("Broken City");
        System.out.println("You moved to the " + test.getLocation());

        bandit.attackPlayer(test);
        wolf.attackPlayer(test);
        System.out.println("You now have " + test.getHP() + " hp!");

        Ebandit.attackPlayer(test);
        System.out.println("You now have " + test.getHP() + " hp!");


    }
}