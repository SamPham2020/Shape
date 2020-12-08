package shape;

import java.util.Random;

/**
 *
 * @author Hong Hien Pham
 */
public class Rectangular {
    // Home work: elipse 
    // 1 class => can create many objects( each has its own data members )
    // Thus, data members belong to objects.
    //only declare independent data members 
    // when call the constructors, create an object.
    // other methods(calcArea, calcPerimeter, toString, equals, getter and setter also applied on objects. 
    //if the same for all objects like numOfSide, => class level=> direct initialize to save space 
    private int width;
    private int length;
    // if Area => each width + elnght -> 1 area = 4 bits storage 
    // we can change by getter setter 
    // if adding data related to each other => once change 1 must change the other 
    //=> to save storage space and less compicated 
    private String color; // non sttic => belong to objects 
    private static int numOfSide = 4; // class level
    
    //default constructor -> init. width and length with 2 random numbers 
    //                    -> init the color to black 
    public Rectangular() {
        Random random = new Random();
        int maxNum = 10;
        int minNum = 1;
        this.width = random.nextInt(maxNum - minNum +1) + 1;     
        this.length = random.nextInt(maxNum - minNum +1) + 1;
        this.color = "black";
    }   
        
    /**
     *constructor with all three data members 
     * @param width
     * @param length
     * @param color 
     */
    public Rectangular(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }      
    
    // copy constructor 
    /**
     * copy the data members of a rectangular to another  
     * @param rectangular an object of Rectangular 
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.color = rectangular.color;
    }     
    // equals(Rectangular rectangular)
    /**
     * Compare rectangular to itself 
     * @param rectangular an object of rectangular 
     * @return true if equal, false, if not 
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width && 
                this.length == rectangular.length &&
                this.color.equals(rectangular.color);
    }
    // toString(not the default)
    /**
     * Get all the info of data members, put to str, format and return that str
     * @return str (string contains all info) 
     */
    @Override
    public String toString(){ // because we do not want to see just the address, but the data in that memory location) 
        String str = "";
        
        str += String.format("%-10s: %d\n", "Width", width);
        str += String.format("%-10s: %d\n", "Length", length);
        str += String.format("%-10s: %s\n", "Color", color);
        str += String.format("%-10s: %d\n", "Area", calcArea());
        str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
        
        return str;
    }
    
    //After writing all the constructors method, write other special method
    /**
     * Calculate the area of an rectangular 
     * @return 
     */
    // directy read the values of data members 
    public int calcArea() {
        // if area is a data member
        // we can change it to void and area = width * length; 
        return width * length; 
    } 
    
    /**
     * Calculate the perimeter of a rectangular 
     * @return the perimeter of a rectangular 
     */
    public int calcPerimeter() {
        return (width + length) * 2; 
    }
      
    //getter setter     
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
