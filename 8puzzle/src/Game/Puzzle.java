package Game;

public class Puzzle {
    private static int result;

    public static int solve() {
        result = -1;
        while (result < 0) {
            Map.paintMap();

            if (Map.MAPI[0] == 1) {
                if (Map.MAPI[1] == 2) {
                    if (Map.MAPI[2] == 3) {
                        if (Map.MAPI[3] == 4) {
                            if (Map.MAPI[6] == 7) {
                                if (Map.MAPI[4] == 5) {
                                    if ((Map.MAPI[7] == 8) || (Map.MAPI[8] == 8)) {
                                        result = 0;
                                        break;
                                    } else {
                                        System.out.println("[ ! ] Brak ruchów");
                                        result = 1;
                                        break;
                                    }
                                } else {
                                    moveBlank();
                                    int x = checkPosition(5);

                                    switch (x) {
                                        case 5:
                                            swap(7, 4);
                                            swap(4, 5);
                                            swap(5, 8);
                                            break;
                                        case 8:
                                            swap(7, 4);
                                            swap(4, 5);
                                            swap(5, 8);
                                            swap(8, 7);
                                            swap(7, 4);
                                            swap(4, 5);
                                            swap(5, 8);
                                            break;
                                    }
                                }
                            } else {
                                moveBlank();
                                int x = checkPosition(7);

                                switch (x) {
                                    case 4:
                                        swap(7, 8);
                                        swap(8, 5);
                                        swap(5, 2);
                                        swap(2, 1);
                                        swap(1, 0);
                                        swap(0, 3);
                                        swap(3, 4);
                                        swap(4, 7);
                                        swap(7, 6);
                                        swap(6, 3);
                                        swap(3, 0);
                                        swap(0, 1);
                                        swap(1, 2);
                                        swap(2, 5);
                                        swap(5, 8);
                                        swap(8, 7);
                                        break;
                                    case 5:
                                        swap(7, 4);
                                        swap(4, 5);
                                        swap(5, 2);
                                        swap(2, 1);
                                        swap(1, 0);
                                        swap(0, 3);
                                        swap(3, 4);
                                        swap(4, 7);
                                        swap(7, 6);
                                        swap(6, 3);
                                        swap(3, 0);
                                        swap(0, 1);
                                        swap(1, 2);
                                        swap(2, 5);
                                        swap(5, 8);
                                        swap(8, 7);
                                        break;
                                    case 8:
                                        swap(7, 8);
                                        swap(8, 5);
                                        swap(5, 4);
                                        swap(4, 7);
                                        swap(7, 8);
                                        swap(8, 5);
                                        swap(5, 2);
                                        swap(2, 1);
                                        swap(1, 0);
                                        swap(0, 3);
                                        swap(3, 4);
                                        swap(4, 7);
                                        swap(7, 6);
                                        swap(6, 3);
                                        swap(3, 0);
                                        swap(0, 1);
                                        swap(1, 2);
                                        swap(2, 5);
                                        swap(5, 8);
                                        swap(8, 7);
                                        break;
                                }
                            }
                        } else {
                            moveBlank();
                            int x = checkPosition(4);

                            switch (x) {
                                case 4:
                                    swap(7, 4);
                                    swap(4, 3);
                                    swap(3, 6);
                                    swap(6, 7);
                                    swap(7, 4);
                                    swap(4, 3);
                                    swap(3, 6);
                                    swap(6, 7);
                                    break;
                                case 5:
                                    swap(7, 4);
                                    swap(4, 5);
                                    swap(5, 8);
                                    swap(8, 7);
                                    swap(7, 6);
                                    swap(6, 3);
                                    swap(3, 4);
                                    swap(4, 7);
                                    break;
                                case 6:
                                    swap(7, 4);
                                    swap(4, 3);
                                    swap(3, 6);
                                    swap(6, 7);
                                    break;
                                case 8:
                                    swap(7, 8);
                                    swap(8, 5);
                                    swap(5, 4);
                                    swap(4, 7);
                                    swap(7, 6);
                                    swap(6, 3);
                                    swap(3, 4);
                                    swap(4, 7);
                                    break;
                            }
                        }
                    } else {
                        moveBlank();
                        int x = checkPosition(3);

                        switch (x) {
                            case 3:
                                swap(7, 6);
                                swap(6, 3);
                                swap(3, 4);
                                swap(4, 7);
                                swap(7, 6);
                                swap(6, 3);
                                swap(3,4);
                                swap(4,7);
                                swap(7,6);
                                swap(6,3);
                                swap(3, 0);
                                swap(0, 1);
                                swap(1, 4);
                                swap(4, 5);
                                swap(5, 2);
                                swap(2, 1);
                                swap(1, 0);
                                swap(0, 3);
                                swap(3, 6);
                                swap(6, 7);
                                break;
                            case 4:
                                swap(7,6);
                                swap(6,3);
                                swap(3,0);
                                swap(0,1);
                                swap(1,4);
                                swap(4,7);
                                swap(7,8);
                                swap(8,5);
                                swap(5,2);
                                swap(2,1);
                                swap(1,0);
                                swap(0,3);
                                swap(3,6);
                                swap(6,7);

                                break;
                            case 5:
                                swap(7,4);
                                swap(4,5);
                                swap(5,8);
                                swap(8,7);
                                swap(7,6);
                                swap(6,3);
                                swap(3,0);
                                swap(0,1);
                                swap(1,4);
                                swap(4,7);
                                swap(7,8);
                                swap(8,5);
                                swap(5,2);
                                swap(2,1);
                                swap(1,0);
                                swap(0,3);
                                swap(3,6);
                                swap(6,7);
                                break;
                            case 6:
                                swap(7,6);
                                swap(6,3);
                                swap(3,4);
                                swap(4,7);
                                swap(7,6);
                                swap(6,3);
                                swap(3,0);
                                swap(0,1);
                                swap(1,4);
                                swap(4,7);
                                swap(7,8);
                                swap(8,5);
                                swap(5,2);
                                swap(2,1);
                                swap(1,0);
                                swap(0,3);
                                swap(3,6);
                                swap(6,7);
                                break;
                            case 8:
                                swap(7,8);
                                swap(8,5);
                                swap(5,4);
                                swap(4,7);
                                swap(7,6);
                                swap(6,3);
                                swap(3,0);
                                swap(0,1);
                                swap(1,4);
                                swap(4,7);
                                swap(7,8);
                                swap(8,5);
                                swap(5,2);
                                swap(2,1);
                                swap(1,0);
                                swap(0,3);
                                swap(3,6);
                                swap(6,7);
                                break;
                        }
                    }
                } else {
                    moveBlank();
                    int x = checkPosition(2);

                    switch (x) {
                        case 2:
                            swap(7, 4);
                            swap(4, 1);
                            swap(1, 2);
                            swap(2, 5);
                            swap(5, 8);
                            swap(8, 7);
                            break;
                        case 3:
                            swap(7, 6);
                            swap(6, 3);
                            swap(3, 4);
                            swap(4, 7);
                            swap(7, 6);
                            swap(6, 3);
                            swap(3, 4);
                            swap(4, 7);
                            swap(7, 8);
                            swap(8, 5);
                            swap(5, 2);
                            swap(2, 1);
                            swap(1, 4);
                            swap(4, 7);
                            break;
                        case 4:
                            swap(7, 8);
                            swap(8, 5);
                            swap(5, 2);
                            swap(2, 1);
                            swap(1, 4);
                            swap(4, 7);
                            break;
                        case 5:
                            swap(7, 4);
                            swap(4, 1);
                            swap(1, 2);
                            swap(2, 5);
                            swap(5, 4);
                            swap(4, 1);
                            swap(1, 2);
                            swap(2, 5);
                            swap(5, 4);
                            swap(4, 7);
                            break;
                        case 6:
                            swap(7, 4);
                            swap(4, 3);
                            swap(3, 6);
                            swap(6, 7);
                            swap(7, 4);
                            swap(4, 3);
                            swap(3, 6);
                            swap(6, 7);
                            swap(7, 8);
                            swap(8, 5);
                            swap(5, 2);
                            swap(2, 1);
                            swap(1, 4);
                            swap(4, 7);
                            break;
                        case 8:
                            swap(7, 4);
                            swap(4, 5);
                            swap(5, 8);
                            swap(8, 7);
                            swap(7, 4);
                            swap(4, 1);
                            swap(1, 2);
                            swap(2, 5);
                            swap(5, 4);
                            swap(4, 1);
                            swap(1, 2);
                            swap(2, 5);
                            swap(5, 4);
                            swap(4, 7);
                            break;
                    }
                }
            } else {
                moveBlank();
                int x = checkPosition(1);

                switch (x) {
                    case 1:
                        rotateLeft();
                        break;

                    case 2:
                        rotateLeft();
                        rotateLeft();
                        break;
                    case 3:
                        rotateRight();
                        break;
                    case 4:
                        swap(7, 6);
                        swap(6, 3);
                        swap(3, 0);
                        swap(0, 1);
                        swap(1, 4);
                        swap(4, 3);
                        swap(3, 0);
                        swap(0, 1);
                        swap(1, 4);
                        swap(4, 3);
                        swap(3, 6);
                        swap(6, 7);
                        break;
                    case 5:
                        rotateLeft();
                        rotateLeft();
                        rotateLeft();
                        break;
                    case 6:
                        rotateRight();
                        rotateRight();
                        break;
                    case 7:
                        // NIGDY NIE MA MIEJSCA, ZAWSZE PUSTE
                        break;
                    case 8:
                        rotateLeft();
                        rotateLeft();
                        rotateLeft();
                        rotateLeft();
                        break;
                }

            }
        }
        return result;
    }

    // UTILITIES
    private static void swap(int x, int y) {
        int temp = Map.MAPI[x];
        Map.MAPI[x] = Map.MAPI[y];
        Map.MAPI[y] = temp;
    }

    private static int checkPosition(int v) {
        int lx = 0;
        for (int i = 0; i < 9; i++)
            if (Map.MAPI[i] == v) {
                lx = i;
                return lx;
            }
        return -1;
    }

    // MOVES
    private static void moveBlank() {
        int x = checkPosition(0);
        switch (x) {
            case 0:
                swap(0,3);
                swap(3,6);
                swap(6,7);
                break;
            case 1:
                swap(1,4);
                swap(4,7);
                break;
            case 2:
                swap(2,5);
                swap(5,8);
                swap(8,7);
                break;
            case 3:
                swap(3,6);
                swap(6,7);
                break;
            case 4:
                swap(4, 7);
                break;
            case 5:
                swap(5,8);
                swap(8,7);
                break;
            case 6:
                swap(6,7);
                break;
            case 7:
                break;
            case 8:
                swap(8,7);
                break;
        }
    }

    private static void rotateLeft() {
        swap(7, 6);
        swap(6, 3);
        swap(3, 0);
        swap(0, 1);
        swap(1, 2);
        swap(2, 5);
        swap(5, 8);
        swap(8, 7);
    }

    private static void rotateRight() {
        swap(7, 8);
        swap(8, 5);
        swap(5, 2);
        swap(2, 1);
        swap(1, 0);
        swap(0, 3);
        swap(3, 6);
        swap(6, 7);
    }
}
