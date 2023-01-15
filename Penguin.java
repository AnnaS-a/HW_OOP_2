public class Penguin extends Animal implements Swimmable {
    
    public Penguin (String name, int box){
        super(name, box);
    }

    @Override
    public int speedOfSwimm() {
        return 8;
    }

    @Override
    public String say() {
        return "Ииииии";
    }
    
    @Override
    public String toString() {
        return "Penguin " + super.toString();
    }
}
