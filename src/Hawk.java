public class Hawk implements Predator{

    @Override
    public void stalk() {
        System.out.println("the hawk stalks his prey from above");
    }

    @Override
    public void attack() {
        System.out.println("the hawk swoops down and latches " +
                             "on to its prey with its razor" +
                             " sharp talons.");
    }
}
