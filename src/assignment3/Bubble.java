import java.util.Scanner;

public class Bubble {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println("How many numbers are there?");
int n = in.nextInt();

int[] bubble = new int[n];

System.out.println("What are the numbers?");
for(int i = 0; i < n; i++){
    bubble[i] = in.nextInt();
}



for(int j = 0; j < (n - 1); j++){
    for(int k = 1; k < (n - j - 1); k++){
        if(bubble[k] > bubble[k + 1]){
            int temp = bubble[k];
            bubble[k] = bubble[k+1];
            bubble[k + 1] = temp;
            
        }

    }

}

for(int l = 0; l < n; l++){
    System.out.print(bubble[l] + " ");
}
System.out.println();


}
}