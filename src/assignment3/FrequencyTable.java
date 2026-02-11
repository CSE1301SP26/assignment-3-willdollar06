import java.util.Scanner;

public class FrequencyTable {
public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("How many dice?");
int dice = in.nextInt();
System.out.println("How many rolls?");
int rolls = in.nextInt();

int largest = ((dice * 6) - dice + 1);
int[] freq = new int[largest];
int sum = 0;

for(int i = 0; i < rolls; i++){
    sum = 0;
    for(int j = 0; j < dice; j++){
        int num = (int) (Math.random() * 6) + 1;
        sum = sum + num;
    }
    freq[sum - dice]++;
}

System.out.println("Times each value was rolled with " + dice + " dice over " + rolls + " rolls.");

for (int j = 0; j < (largest); j++){
    System.out.println((j + dice) + ": " + freq[j]);
}
}
}





