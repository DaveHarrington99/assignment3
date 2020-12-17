package Assignment3;

public class Main {
    public static void main(String[] args) {
        Colour colour1 = new Colour(40,50,60);
        Colour colour2 = new Colour(90, -45, 290);
        Colour colour3 = new Colour(35, -60, 12, "CYMB");

        System.out.println(colour1.getBlue());
        System.out.println(colour2.getModel());
        System.out.println(colour3.getModel());

        colour1.comparison(colour2);
        colour1.comparison(colour3);

        System.out.println(colour1.add(colour2));


        System.out.println(colour1);
        System.out.println(colour2);
        System.out.println(colour3);

    }
}
