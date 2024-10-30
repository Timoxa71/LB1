import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.random;


public class Main {
    public static void printRow(double[] row) {
        for (double i : row) {
            double v = i;
            if (Double.isNaN(i)){
                System.out.print(i);
                System.out.print("\t");
            }else{
                System.out.printf("%.3f",v);
                System.out.print("\t");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        short[] z = new short[15];
        short k = 16;
        for (int i=0;i<z.length;i++){
            z[i]=k;
            k--;
        }


        float[] x = new float[10];
        for (int i=0; i<x.length;i++){
            x[i] = ((float)random() * ((13.0f - (-15.0f)) + 1)) - 15.0f;
        }

        double[][] Z = new double[15][10];

        for (int i=0;i<Z.length;i++){
            for (int j=0;j<Z[i].length;j++) {
                float X = x[j];
                int[] f = {2, 3, 5, 6, 7, 8, 12};
                int index = Arrays.binarySearch(f, i);
                if (z[i] == 13) {
                    double w =  (Math.cbrt(Math.atan((X-1)/28)) + 1)/(Math.pow(Math.E,Math.atan((X-1)/28)));
                    Z[i][j] = w;
                }else if (index > 0) {

                    double w = 2 * Math.tan(Math.cbrt(X));
                    Z[i][j] = w;

                }else {
                    double w = Math.pow(((Math.asin(0.2*Math.cos(X))-1)/0.5),Math.pow((0.5+Math.log(Math.pow(Math.tan(X),2))),3));
                    Z[i][j] = w;
                }
            }
        }
//        for (int i=0;i<Z.length;i++){
//            for (int j=0;j<Z[i].length;j++) {
//
//                if (Double.isNaN(Z[i][j])) {
//                    System.out.println("NaN");
//                }else{
//                    double v = Z[i][j];
//                    System.out.printf("%.3f", v);
//                    System.out.println();
//                }
//            }
//        }
        for(double[] row : Z) {
            printRow(row);
        }
    }
}