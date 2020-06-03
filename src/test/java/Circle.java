public class Circle extends Shape {

    public int radius;

    public Circle(String colour, int radius) {
        super(colour);
        //System.out.println("My Colour is " + colour);
        this.radius = radius;
    }

    int Area() {
        return 20 * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle("White",3);
        String boxThatIGotFromMyFriend = c.getColour();
        System.out.println("The area of Circle is " + c.Area()+"  "+boxThatIGotFromMyFriend);

    }

}
