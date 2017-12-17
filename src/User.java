import java.util.Scanner;

public class User {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("W którym kierunku chcesz się poruszać?");

        String choice = scanner.nextLine();

        Directions direction = Directions.valueOf(choice);


        System.out.println("OK, więc idziemy na " + direction.getDirection());
        System.out.println("Podaj nr enuma:");

        int choice2 = scanner.nextInt();

        System.out.println(Directions.convert(choice2));


        // alternative converter
/*        int o = scanner.nextInt();
        Directions[] alldirections = Directions.values();
        for (Directions x: alldirections){
            if (x.ordinal() == o) {
                System.out.println(x);
            }
        }*/
    }
}
