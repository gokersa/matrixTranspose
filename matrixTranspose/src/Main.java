import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] matrix = {{2,3,4},{5,6,4}};
        int [][] transpose = new int[3][2];

        System.out.println("Matris : ");
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i< 2; i++) {
            for (int j=0; j<3; j++){
                transpose [j][i] = matrix [i][j];
            }
        }
        System.out.println("Transpoz : ");
        for (int [] tr : transpose) {
            System.out.println(Arrays.toString(tr));
        }

    }
}