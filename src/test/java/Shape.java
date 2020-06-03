public abstract class Shape {

    private String obtainedColour;

    abstract int Area();

    public Shape(){
        System.out.println("I'm in default constructor");
    }

    //Parameterized constructor
    public Shape(String colour){
        System.out.println("A call for the constructor in the Shape class ");
        this.obtainedColour = colour;
    }

    public String getColour(){
        return obtainedColour;
    }

}
