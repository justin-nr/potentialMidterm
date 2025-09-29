public class Bandit extends Hostile {

    //calls from hostile class
    @Override
    public void attackPlayer(Player test) {
        //calls stab method
        stab(test);

    }

    //method for a bandit attack
    public void stab(Player test) {
        int damage = 10;
        test.takeDamage(damage);
        System.out.println("The bandit stabs you for " + damage + " damage");

    }
}
