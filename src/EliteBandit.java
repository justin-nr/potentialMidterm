public class EliteBandit extends Bandit{
    //calls from hostile class
    @Override
    public void attackPlayer(Player test) {
        //calls ambush method
        ambush(test);

    }
    //method for elite bandit to ambush
    public void ambush(Player test){
        System.out.println("The Elite Bandit ambushes you!");
        //uses the stab method
        stab(test);
    }
}
