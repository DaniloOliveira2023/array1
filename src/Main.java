import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int i=0;
        Scanner s = new Scanner(System.in);
        for (i=0; i<10; i++) {
            System.out.println("Digite a posição do vetor");
            vetorA[i] = s.nextInt();
            if (i%2==0) {
                vetorB[i] = vetorA[i] / 2;
            }
            else {
                vetorB[i] = vetorA[i] * 3;
            }
        }
        for (i=0; i<10; i++) {
            System.out.println("Posição " + i + " Vetor A " + vetorA[i] + " Vetor B " + vetorB[i]);
        }
    }
}