package basic;

import java.util.Scanner;

/**
 * Author
 * Sambhaji Pandhare
 * Software Engineer
 * +91 841 104 1938
 */
public class AreaPerimeterOfCircle 
{
    public static void main( String[] args )
    {
        int radius = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Radius For Area and Circle");
        radius = sc.nextInt();
        System.out.println("Area Of Circle :"+(3.14*radius*radius));
        System.out.println("Periemeter Of Ciecle :"+(2*3.14*radius));
        sc.close();
    }
}
