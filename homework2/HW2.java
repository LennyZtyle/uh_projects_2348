import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        String user_input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please use a reference chart to select a shape. ");
        System.out.print("Enter the letter of the shape (A, B, C, D, E, F, or G: ");

        user_input = keyboard.next();

        printPattern(user_input);

    }
    private static void printPattern (String user_input){

        if (user_input.equals("A")) {
            //shape A
            for (int row = 1; row <= 10; row++) {
                System.out.println();
                for (int column = 1; column <= 10; column++) {
                    if (row == 1 || column == 1 || column == 10 || row == column || row == 11 - column || row == 10) {
                        System.out.print('X');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
        } else if (user_input.equals("B")) {
            //shape B
            for (int row = 1; row <= 10; row++) {
                System.out.println();
                for (int column = 1; column <= 10; column++) {
                    if (row == 1 || column == 1 || column == 10 || row == 6 || column == 5 || row == 10) {
                        System.out.print('X');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
        } else if (user_input.equals("C")) {
            //shape C
            for (int row = 1; row <= 10; row++) {
                System.out.println();
                for (int column = 1; column <= 10; column++) {
                    if (row == 1 || column == 1 || row + column <= 11) {
                        System.out.print('X');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
        } else if (user_input.equals("D")) {
            //shape D
            for(int row = 1; row <= 10; row++) {
                System.out.println();
                for(int column = 1; column <= 10; column++) {
                    if(row == 1 || column == 1 || column == 10 || row + column >= 11 || row == 10) {
                        System.out.print('X');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
        } else if (user_input.equals("E")) {
            //shape E
            for(int row = 1; row <= 10; row++) {
                System.out.println();
                for(int column = 1; column <= 10; column++) {
                    if(row%2 == 1 && column%2 == 1) {
                        System.out.print('X');
                    }
                    else if (row%2 == 0 && column%2 == 0) {
                        System.out.print('X');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
        } else if (user_input.equals("F")) {
            //shape F
            for(int row = 1; row <= 5; row++) {
                System.out.println();
                for(int column = 1; column <= 10; column++) {
                    if(row == column || row + column <= 11 && row - column < 0 ) {
                        System.out.print('X');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
            for(int row = 1; row <= 5; row++) {
                System.out.println();
                for(int column = 1; column <= 10; column++) {
                    if(row + column == 6 || column - 5 == row || row + column > 6 && column - 5 < row) {
                        System.out.print('X');
                    }
                    else {
                        System.out.print(' ');
                    }
                }
            }
        } else if (user_input.equals("G")) {
            //shape G
            for (int row = 1; row <= 10; row++) {
                System.out.println();
                for (int column = 1; column <= 10; column++) {
                    if (row % 2 == 1) {
                        System.out.print('X');
                    } else if (column == 10) {
                        if (row == 2 || row == 6 || row == 10) {
                            System.out.print('X');
                        } else {
                            System.out.print(' ');
                        }
                    } else if (column == 1) {
                        if (row == 4 || row == 8) {
                            System.out.print('X');
                        } else {
                            System.out.print(' ');
                        }
                    } else {
                        System.out.print(' ');
                    }
                }
            }
        } else {
            System.out.print("Wrong input. Exiting...");
        }
    }
}
