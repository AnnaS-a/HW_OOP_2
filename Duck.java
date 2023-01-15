public class Duck extends Animal implements Runable, Flyable, Swimmable{

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Кря-кря";
    }

    @Override
    public String toString() {
        return "Duck " + super.toString();
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwimm() {
        return 35;
    }
}