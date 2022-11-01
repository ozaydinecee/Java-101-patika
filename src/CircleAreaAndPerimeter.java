import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args){
        double pi=3.14;

        double radius,angle,area,perimeter;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius=input.nextInt();
        System.out.println("Enter the angle:");
        angle=input.nextInt();

        area=(pi*radius*radius* angle) / 360;
        perimeter=2*pi*radius;

        System.out.println("Area of the circle is "+area);
        System.out.println("Perimeter of the circle is "+perimeter);





    }
}
