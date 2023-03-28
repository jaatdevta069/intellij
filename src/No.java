//// Java Program to Illustrate Concept of
//// Abstract Class
//
//// Importing required classes
//

import java.util.*;

//
//// Class 1
//// Helper abstract class
//abstract class Shape {
//
//    // Declare fields
//    String objectName = " ";
//
//    // Constructor of this class
//    Shape(String name) { this.objectName = name; }
//
//    // Method
//    // Non-abstract methods
//    // Having as default implementation
//    public void moveTo(int x, int y)
//    {
//        System.out.println(this.objectName + " "
//                + "has been moved to"
//                + " x = " + x + " and y = " + y);
//    }
//
//    // Method 2
//    // Abstract methods which will be
//    // implemented by its subclass(es)
//    abstract public double area();
//    abstract public void draw();
//}
//
//// Class 2
//// Helper class extending Class 1
//class Rectangle extends Shape {
//
//    // Attributes of rectangle
//    int length, width;
//
//    // Constructor
//    Rectangle(int length, int width, String name)
//    {
//
//        // Super keyword refers to current instance itself
//        super(name);
//
//        // this keyword refers to current instance itself
//        this.length = length;
//        this.width = width;
//    }
//
//    // Method 1
//    // To draw rectangle
//    @Override public void draw()
//    {
//        System.out.println("Rectangle has been drawn "+objectName);
//    }
//
//    // Method 2
//    // To compute rectangle area
//    @Override public double area()
//    {
//        // Length * Breadth
//        return (double)(length * width);
//    }
//}
//
//// Class 3
//// Helper class extending Class 1
//class Circle extends Shape {
//
//    // Attributes of a Circle
//    double pi = 3.14;
//    int radius;
//
//    // Constructor
//    Circle(int radius, String name)
//    {
//        // Super keyword refers to parent class
//        super(name);
//        // This keyword refers to current instance itself
//        this.radius = radius;
//    }
//
//    // Method 1
//    // To draw circle
//    @Override public void draw()
//    {
//        // Print statement
//        System.out.println("Circle has been drawn ");
//    }
//
//    // Method 2
//    // To compute circle area
//    @Override public double area()
//    {
//        return (double)((pi * radius * radius));
//    }
//}
class Lodu {
    public void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public double add1(double a,double b){
        double sum = a+b;
        String str = String.format("%.2f",sum);
        return Double.valueOf(str);
    }
}
class bhosad extends Lodu{
    public void add(float a,float b){
    float sum =a+b;
        System.out.println(Double.valueOf(String.format("%.2f",sum)));
}}

// Main class
class check{
    Character ch;
    Integer no;
    public check(Character ch,Integer no){
        this.ch=ch;
        this.no=no;
    }
}
class comparebyno implements Comparator<check>{
    @Override
    public int compare(check o1, check o2) {
        return o1.no.compareTo(o2.no);
    }
}
class No {

    // Main driver method
    public static void main(String[] args)
    {
        var ll = new Lodu();
        ll.add(4,5);
        String str = "aabbbaacccc";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),1);
            else
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }
        ArrayList<check> arr = new ArrayList<>(map.size());
        int i =0;
        for(Map.Entry<Character,Integer> mp : map.entrySet()) {
                arr.add(new check(mp.getKey(),mp.getValue()));
        }
        System.out.println("before sorting:");
        for(check kk : arr){
            System.out.print(kk.ch+" "+kk.no+",");
        }
        Collections.sort(arr,new comparebyno());
        Collections.reverse(arr);
        System.out.println("\n" +
                "after sorting:");
        for(check kk : arr){
            System.out.print(kk.ch+" "+kk.no+",");
        }
            }
}
