import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    //φ(x) = ∛(x + 2)
    static double phi(double x) {
        return Math.pow(x + 2, 1.0 / 3);
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double eps = 0.0001;
        double x = 1.5;
        int n = 100;
        int i = 0;

        while (i < n) {
            double xNew = phi(x);

            if (Math.abs(xNew - x) < eps) {
                x = xNew;
                break;
            }

            x = xNew;
            i++;
        }

        System.out.println("корень: x = " + x);
    }
}