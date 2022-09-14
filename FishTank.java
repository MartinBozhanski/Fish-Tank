import java.util.Scanner;

public class FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double capacity = length * width * height;
        double capacityLitre = capacity / 1000;
        double takenCapacity = procent / 100;
        double neededLitres = capacityLitre * (1 - takenCapacity);

        System.out.println(neededLitres);
    }
}
