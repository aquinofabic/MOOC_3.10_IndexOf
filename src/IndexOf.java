import java.util.Scanner;
import java.util.ArrayList;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        System.out.println("Entering -1 will end the loop");

        while (true) {
            int numberInput = scanner.nextInt();
            if (numberInput == -1) {
                break;
            }
            listOfNumbers.add(numberInput);

        }
        System.out.println("Search for?");
        int searchForTheNumber = scanner.nextInt();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (searchForTheNumber == listOfNumbers.get(i)) {
                System.out.println(searchForTheNumber + " is at index " + i);
            }
        }
    }
}