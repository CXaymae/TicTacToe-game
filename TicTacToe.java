import java.util.HashSet;
import java.util.Scanner;

public class TicTacToe {
    static HashSet<Integer> urSet = new HashSet<Integer>();
    static HashSet<Integer> compSet = new HashSet<Integer>();

    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        printBoard(gameBoard);
        Scanner var = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number from 1 to 9");
            int userPosition = var.nextInt();
            while (urSet.contains(userPosition) || compSet.contains(userPosition)) {
                System.out.println();
                System.out.println("Retry");
                userPosition = var.nextInt();
            }
            placeHolder(gameBoard, userPosition, "You");

            String res = checkWinner();
            if (res.length() > 0) {
                System.out.println(res);
                break;
            }

            int cpuPosition = genRandom();
            while (urSet.contains(cpuPosition) || compSet.contains(cpuPosition)) {
                cpuPosition = genRandom();
            }
            placeHolder(gameBoard, cpuPosition, "Comp");
            res = checkWinner();
            if (res.length() > 0) {
                System.out.println(res);
                break;
            }
        }
    }

    static String checkWinner() {
        HashSet<Integer> r1 = new HashSet<Integer>();
        r1.add(1);
        r1.add(2);
        r1.add(3);
        HashSet<Integer> r2 = new HashSet<Integer>();
        r2.add(4);
        r2.add(5);
        r2.add(6);
        HashSet<Integer> r3 = new HashSet<Integer>();
        r3.add(7);
        r3.add(8);
        r3.add(9);
        HashSet<Integer> c1 = new HashSet<Integer>();
        c1.add(1);
        c1.add(4);
        c1.add(7);
        HashSet<Integer> c2 = new HashSet<Integer>();
        c2.add(2);
        c2.add(5);
        c2.add(8);
        HashSet<Integer> c3 = new HashSet<Integer>();
        c3.add(3);
        c3.add(6);
        c3.add(9);
        HashSet<Integer> d1 = new HashSet<Integer>();
        d1.add(1);
        d1.add(5);
        d1.add(9);
        HashSet<Integer> d2 = new HashSet<Integer>();
        d2.add(3);
        d2.add(5);
        d2.add(7);
        HashSet<HashSet> set = new HashSet<HashSet>();

        set.add(r1);
        set.add(r2);
        set.add(r3);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(d1);
        set.add(d2);

        for (HashSet c : set) {
            if (urSet.containsAll(c))
                return "You Rock!";
            else if (compSet.containsAll(c))
                return "You lost";
        }
        if (urSet.size() + compSet.size() == 9)
            return "DRAW!!";

        return "";
    }

    static int genRandom() {
        int max = 9;
        int min = 1;

        int range = max - min + 1;
        int res = (int) (Math.random() * range) + min;
        return res;
    }

    static void printBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    static void placeHolder(char[][] gameBoard, int position, String user) {
        char symbol = 'X';
        if (user.equals("You")) {
            symbol = 'X';
            urSet.add(position);

        } else if (user.equals("Comp")) {
            symbol = 'O';
            compSet.add(position);
        }
        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println();
        printBoard(gameBoard);
    }
}
