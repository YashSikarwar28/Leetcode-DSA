import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},{4,5,6},{7,8,9}
        };
        int rows =  a.length;
        int cols = a[0].length;
        int[][] b = new int[cols][rows];
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[j][i]=a[i][j];
            }            
        }
        for (int j = 0; j <cols; j++) {
            
            System.out.print(Arrays.toString(b[j]));
        }
    }
}
