package mutable_immutable;

public class PracticeStringBuilder {
    public static void main(String[] args) {

        StringBuilder city = new StringBuilder("Chicago");
        System.out.println(city);
        city = new StringBuilder("Miami");

        String name = "Alex"; // goes in the pool
        name += "ander";
        System.out.println(name);

        System.out.println(city.append("xxx"));


    }
}
