import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double eps = 0.0001;
        double x = 0.5;
        int n = 100;
        int i = 0;

        while (i < n) {
            double fx = 2 * x - 1 / Math.tan(x);
            double dfx = 2 + 1 / (Math.sin(x) * Math.sin(x));
            double xNew = x - fx / dfx;

            if (Math.abs(xNew - x) < eps) {
                x = xNew;
                break;
            }

            x = xNew;
            i++;
        }

        System.out.println("Корень: x = " + x);
    }
}
