package Game;
import java.util.Scanner;

public class Menu {

    private static Scanner SCAN = new Scanner(System.in);
    private static int ANS = -1;

    public static void paintMenu(){
        while(ANS != 0) {
            System.out.println(" --- 8-puzzle ---");
            System.out.println(" [ 1 ] Losuj rozdanie");
            System.out.println(" [ 2 ] Rozwiąż");
            System.out.println(" [ 0 ] Zakończ");
            System.out.print("> ");
            ANS = SCAN.nextInt();

            Map map = new Map();
            switch(ANS){
                case 1:
                    Map.generateMap();
                    Map.paintMap();
                    break;
                case 2:
                    int result = Puzzle.solve();
                    switch (result){
                        case 0:
                            System.out.println(" [ # ] Rozwiązano rozdanie [ # ]");
                            break;
                        case 1:
                            System.out.println(" [ ! ] Nie mogę rozwiązać tego rozdania [ ! ]");
                            break;
                    }
                    Map.paintMap();
                    Map.resetMap();
                    break;
                case 0:
                    break;
            }
        }
    }
}
