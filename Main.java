public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya", 1, "gray"))
                .addAnimal(new Horse("Ignat", 10))
                .addAnimal(new Duck("Donald", 5))
                .addAnimal(new Horse("Sedoy", 12))
                .addAnimal(new Penguin("Bob", 17));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }

        System.out.println("-----------------");
        System.out.println("Sound of the zoo");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.say());
        }

        System.out.println("-------------------");

        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Speed is: " + runner.speedOfRun());
        }

        System.out.println("-----------------");

        int max = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max running speed in the zoo: %d", max));

        System.out.println("-------------------");
        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.println(String.format("Speed of fly: %d", flyer.speedOfFly()));
        }

        System.out.println("-------------------");

        for (Swimmable swimmer : zoo1.getSwimmers()) {
            System.out.println("Speed of swimm: " + swimmer.speedOfSwimm());
        }

        System.out.println("-----------------");

        int maxS = zoo1.getChampionOfSwimmners();
        System.out.println(String.format("Max swimming speed in the zoo: %d", maxS));

    }
}