package recap;

public class Dinosaur extends Animal {

    static {
        System.out.println("Dinosaurs are extinct, you are creating an extinct animal!");
    }


    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct) {
        super(name, age, height, weight, diet, isAlive, isExtinct);
    }

    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct,
                    String size, boolean hasSpike) {
        super(name, age, height, weight, diet, isAlive, isExtinct);
        this.size = size;
        this.hasSpike = hasSpike;
    }

    public static boolean isReptile = true;

    public String size; // big, normal, giant
    public boolean hasSpike;

    /*
    Override the attack method coming from Animal parent class.
    NOTE: Don't forget to use height and weight!
    1. if the size:
        * normal -> multiply the damage by 1 times
        * big -> multiply the damage by 3 times
        * giant -> multiply the damage by 10 times
    2. if animal has spike ->
            print "Animal had spikes the attack was critical!"
       else ->
            print "Animal didn't have spikes attack was not critical!"
     */
    @Override
    public double attack(){
        double damage = weight * height;
        switch (size.toLowerCase()){
            case "big":
                damage *= 3;
                break;
            case "giant":
                damage *= 10;
                break;
        }
        System.out.println(name + " is attacking. It damaged \"" + damage + "\"." +
                "\n" + (hasSpike ? "Animal had spikes the attack was critical!" : "Animal didn't have spikes attack was not critical!"));

        return damage;
    }

    public double attack(String mood){
        double damage = weight * height;
        switch (size.toLowerCase()){
            case "big":
                damage *= 3;
                break;
            case "giant":
                damage *= 10;
                break;
        }

        switch (mood.toLowerCase()){
            case "chill":
            case "calm":
            case "happy":
                System.out.println(name + " is in a good mood attacks less!");
                damage /= 2;
                break;
            case "angry":
            case "hungry":
                System.out.println(name + " is in a bad mood attacks more!");
                damage *= 2;
                break;
        }

        System.out.println(name + " is attacking. It damaged \"" + damage + "\"." +
                "\n" + (hasSpike ? "Animal had spikes the attack was critical!" : "Animal didn't have spikes attack was not critical!"));
        return damage;
    }



    @Override
    public String toString() {
        return "Dinosaur{" +
                "size='" + size + '\'' +
                ", hasSpike=" + hasSpike +
                ", name='" + name + '\'' +
                (isAlive ? ", age=" + age : "") +
                ", height=" + height +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                ", isAlive=" + isAlive +
                ", isExtinct=" + isExtinct +
                '}';
    }

    public static void main(String[] args) {
//        Dinosaur dinosaur = new Dinosaur("Trex", 6, 8.9, 500.3, "Carnivore", false, true);
//        System.out.println(dinosaur);
        Dinosaur dinosaur = new Dinosaur("Trex", 6, 8.9, 500.3, "Carnivore", false, true
                , "Giant", false);
        System.out.println(dinosaur);
//
//        System.out.println("\nNon arg method below:");
//        dinosaur.attack();
//        System.out.println("\nMood arg method below:");
//        dinosaur.attack("angry");

        dinosaur.setGender("Female");
        System.out.println(dinosaur.getGender("12345"));
    }

}