import java.util.Scanner;

public class TriangleSquare {
    void manMethod(){
        System.out.println("Enter the coordinates of the vertices of the triangle ABC, where:");
        System.out.println("A(x1;y1), B(x2;y2), C(x3;y3)");
        Scanner in = new Scanner(System.in);
        System.out.println("x1 =");
        double x1 = in.nextDouble();
        System.out.println("y1 =");
        double y1 = in.nextDouble();
        System.out.println("x2 =");
        double x2 = in.nextDouble();
        System.out.println("y2 =");
        double y2 = in.nextDouble();
        System.out.println("x3 =");
        double x3 = in.nextDouble();
        System.out.println("y3 =");
        double y3 = in.nextDouble();
        double AB = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double BC = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double AC = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        if(AB + BC > AC && BC + AC > AB && AB + AC > BC){
            double P = (AB + BC + AC) / 2;
            double S = Math.sqrt(P * (P - AB) * (P - BC) * (P - AC));
            System.out.println("The square of the ABC is:");
            System.out.println("S = " + S);
        }
        else {
            System.out.println("The points of triangle are on the one line");
        }

    }
}
