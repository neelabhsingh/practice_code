package javabasic.string;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Neelabh");
        String s2 = new String("Neelabh");
        System.out.println(s1.equals(s2));

        String s3 = new String("Sushama");
        String s4 = new String("Sushama").intern();
        String s5 = "Sushama";

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));

        System.out.print("Intern: ");
        System.out.println(s4 == s5);

        String s6 = new String("Aadvik");
        String s7 = "Aadvik";

        System.out.println(s6.equals(s7));
        System.out.print("Testing:");
        System.out.println(s6==s7);

    }
}
