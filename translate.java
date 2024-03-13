package hafta1;
public class translate {
    public static void main(String[] args){
        Point p1=new Point();
        p1.x=5;
        p1.y=12;

        System.out.println("p1: " + p1.x+" , " + p1.y);

        double distance = p1.distanceFromOrigin(p1.x, p1.y);
        System.out.println("Distance from origin for point P1: " +distance);

        p1.translate(1,4);
        System.out.println("p1: " + p1.x+" , " + p1.y);

        System.out.println("New Distance from origin for point P1: " +p1.distanceFromOrigin(p1.x, p1.y));

        Point p2=new Point();
        p2.x=3;
        p2.y=6;

        System.out.println("Distance from origin for point P1: " +p1.distanceFromOrigin(p2.x, p2.y));
    }
}
