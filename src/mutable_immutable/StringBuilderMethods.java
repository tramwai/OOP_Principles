package mutable_immutable;

public class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Alex");
        System.out.println(sb);

        System.out.println(sb.append("ander"));
        System.out.println(sb.append(true));
        System.out.println(sb.append(5.3));
        System.out.println(sb.append('$'));
        System.out.println(sb.insert(0, "xxx"));
        sb.reverse();
        System.out.println(sb);

    }
}
