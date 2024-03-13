package hafta1;
public class distance {
    public static void main (String [] args ){
        Point p1= new Point();
        p1.x=3;
        p1.y=4;

    System.out.println("p1:" +p1.x+" "+p1.y);
   
    Point p2 = new Point();
    p2.x=1;
    p2.y=10;

    System.out.println("p2:" +p2.x+" "+p2.y);

    double distance = Math.sqrt(p1.x*p1.x+p1.y*p1.y);
    System.out.println("Distance from origin for point P1: " +distance);

    double distance2 = Math.sqrt(p2.x^2+p2.y^2);
    System.out.println("Distance from origin for point P2: " +distance2);


    p1.x=p1.x+2;
    p1.y+=3;
    System.out.println(" the coordinates are now :" +p1.x+" "+p1.y);
    }
    
}
