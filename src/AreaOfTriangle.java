import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        double edge1,edge2,edge3;
        double perimeter,u,area;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first edge length of the triangle");
        edge1=input.nextDouble();
        System.out.println("Enter the second edge length of the triangle");
        edge2=input.nextDouble();
        System.out.println("Enter the third edge length of the triangle");
        edge3=input.nextDouble();

        perimeter=edge1+edge2+edge3;
        u=perimeter/2;
        area=Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));
        System.out.println("Area of the triangle is "+area);


    }
}
