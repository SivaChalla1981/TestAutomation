
 public class Rectangle extends Shape {


    int length, breadth;
    public Rectangle(String colour, int length, int breadth) {
         //super(colour);
         this.length = length;
         this.breadth = breadth;
     }

     int Area() {
         return length * breadth;
     }
 }
