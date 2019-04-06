package Game;

import java.util.Random;

public class Map {
    public static int[] MAPI = new int[9];

    public static void generateMap() {
        int l,r;
        Random rand = new Random();

        for (int i = 0; i < 9; i++) MAPI[i] = i;

        for (int i = 8; i >= 0; i--) {
            l = rand.nextInt(8) % 8;
            r = rand.nextInt(8) % 8;

            int temp = MAPI[l];
            MAPI[l] = MAPI[r];
            MAPI[r] = temp;
        }
    }

    public static void paintMap(){
        String[] CHARMAPI = new String[9];
        for(int i=0; i<9; i++){
            if(MAPI[i] == 0) CHARMAPI[i] = " ";
            else CHARMAPI[i] = Integer.toString(MAPI[i]);
        }
        System.out.println();
        System.out.println(" [ " + CHARMAPI[0] + " ]  [ " + CHARMAPI[1] + " ]  [ " + CHARMAPI[2] + " ]");
        System.out.println(" [ " + CHARMAPI[3] + " ]  [ " + CHARMAPI[4] + " ]  [ " + CHARMAPI[5] + " ]");
        System.out.println(" [ " + CHARMAPI[6] + " ]  [ " + CHARMAPI[7] + " ]  [ " + CHARMAPI[8] + " ]");
        System.out.println();
    }

    public static void resetMap(){
        for(int i=0; i<9; i++) MAPI[i] = 0;
    }
}