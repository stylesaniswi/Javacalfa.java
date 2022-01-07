package labcat;

import java.lang.String;

class Arr {
    static void sort(String arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                StringBuilder sb = new StringBuilder(arr[i][j]);
                sb.reverse();
                arr[i][j] = sb.toString();
            }

        }

    }

    public static void main(String[] args) {
        String arr[][] = new String[3][];

        arr[0] = new String[] { "Ruhan", "Lakshan" };
        arr[1] = new String[] { "Thejaswini", "Tanishwar", "Ramya" };
        arr[2] = new String[] { "Aruna" };
        System.out.println("Contents of 2D Jagged Array before reversing");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        sort(arr);
        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array after reversing the each position");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int a = 0, b = 0, n = 0;
            for (int j = 0; j < arr[i].length; j++) {
                a = arr[i][j].length();
                b = 0;
                if (a > b) {
                    b = arr[i][j].length();
                    n = j;
                }

            }
            System.out.println("the greatest length of: " + (i + 1) + "th contents is: " + a + " of " + arr[i][n]);
        }
    }
}