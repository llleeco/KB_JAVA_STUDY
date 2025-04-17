package org.scoula.lib;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title + ": ");
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title + "(" + defaultValue + "): ");

        if (scanner.nextLine().isEmpty()) {
            return defaultValue;
        }
        return scanner.nextLine();
    }

    public static int readInt(String title) {
        System.out.print(title + ": ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static boolean confirm(String title, boolean defaultValue) {
        System.out.print(title);

        if (defaultValue) {
            System.out.print("(Y/n):");
        } else {
            System.out.print("(y/N): ");
        }

        String input = scanner.nextLine();

        if (input.isEmpty()) {
            return defaultValue;
        }

        return input.equals("y") || input.equals("Y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
