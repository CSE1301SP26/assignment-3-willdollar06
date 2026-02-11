
import java.util.Scanner;

public class SymmetricalImage {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.println("How many rows?");
int n = in.nextInt();
System.err.println("How many columns?");
int m = in.nextInt();

boolean[][] symImg = new boolean[n][m];

int numPoints = (n * m) / 4;

for(int i = 0; i < numPoints; i++){
int ranRow = (int) (Math.random() * n);
int ranCol = (int) (Math.random() * m);
int mirrorCol = m - 1 -ranCol;
symImg[ranRow][ranCol] = true;
symImg[ranRow][mirrorCol] = true;


}









for(int j = 0; j < n; j++){
    for(int k = 0; k < m; k++){
        if(symImg[j][k] == true){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();

}

in.close();

}
}