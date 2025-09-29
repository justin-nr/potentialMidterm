public class Wolf extends Hostile {

    //calls from hostile class
    @Override
    public void attackPlayer(Player test) {
        //calls scratch method
        scratch(test);

    }

    //method for wolf to scratch
    private void scratch(Player test) {
        int damage = 8;
        test.takeDamage(damage);
        System.out.println("The wolf scratches you for " + damage + " damage!");
    }
}
