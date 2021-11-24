package simpletictactoe;
import java.util.Arrays;
import java.util.Scanner;



public class Drag {

    public static int a=0,b;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 5;
        int[][] a = new int[5][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n) {
                    a[i][j] = 1;
                }
                if (i + j < n) {
                    a[i][j] = 0;
                }

                if (i + j > n) {
                    a[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }


//    static int s(int[] c){
//        int f = 1;
//        for (int a: c)
//            f = (a % 3 == 0) ? a : f;
//        return f;
//    }
//    public static void main(String[] args) {


//        int a = 100001000;
//        int i = 1;
//        while (a > 0){
//
//            System.out.println("*" + i);
//            a++;
//            a %= 1000;
//            i++;
//        }
//        long a[] = new long[]{1,2,3};
//        int c = 0;
//        public static int s(int[] c){
//            int f = 1;
//            for(int a: c) f = (a%3==0)?a:f;
//            return f;
//        }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the coordinates: ");
//        boolean inputCorrect = false;
////        String s = scanner.next();
//        var userX = scanner.next().charAt(0);
//        var userY = scanner.next().charAt(0);
//        System.out.println(Character.getNumericValue(userX));
//
//        while (!inputCorrect) {
//            if (userX < '0' ||userX > '9' || userY < '0' || userY > '9'){
//                System.out.println("You should enter numbers!");
//                System.out.println("Enter the coordinates: ");
//
//                userX = scanner.next().charAt(0);
//                userY = scanner.next().charAt(0);
//            } else if (userX < '1' || userY < '1' || userX > '3' || userY > '3') {
//                System.out.println("You should enter numbers!");
//                System.out.println("Enter the coordinates: ");
//
//                userX = scanner.next().charAt(0);
//                userY = scanner.next().charAt(0);
//            }else if (tikTakArr[Character.getNumericValue(userX) - 1][Character.getNumericValue(userY) - 1] != '_') {
//
//                System.out.println("This cell is occupied! Choose another one!");
//                System.out.println("Enter the coordinates: ");
//
//                userX = scanner.next().charAt(0);
//                userY = scanner.next().charAt(0);
//            } else {
////                tikTakArr[Character.getNumericValue(userX) - 1][Character.getNumericValue(userY) - 1] = 'x';
//                inputCorrect = true;
//            }
//        }
//
//    }
}
