public class Submarine extends Boat implements Diver {
    protected String name;
    public Submarine(String name) {
        super(name);
    }
    
    @Override
    public void dive() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }

    @Override
    public void swim() {
        System.out.printf("潛水艇 %s 水面航行%n", name);
        super.swim();
    }
}      