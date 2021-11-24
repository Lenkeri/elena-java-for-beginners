//package simplechatbot;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Programm {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int K = scanner.nextInt();
//        int[] dishes = new int[N];
//        for (int i = 0; i < N; i++) {
//            dishes[i] = scanner.nextInt();
//        }
//
//
//        int[] unicDishes = new int[N];
//        int dish = dishes[0];
//        int[] other = new int[dishes.length - 1];
//
//        int lastOtherIndex = 0;
//        for (int i = 1; i < dishes.length; i++) {
//            if (dish != dishes[i]) {
//                other[lastOtherIndex] = dishes[i];
//                lastOtherIndex += 1;
//            }
//        }
//        other = Arrays.copyOf(other, lastOtherIndex + 1);
//
//        if (other.length == 0) {
//
//        } else {
//
//        }
//
//
////        Arrays.
//
//    }
//
//    int[] getUnicDishes(int[] dishes, int[] acc) {
//
//        int dish = dishes[0];
//        int[] other = new int[dishes.length - 1];
//
//        int lastOtherIndex = 0;
//        for (int i = 1; i < dishes.length; i++) {
//            if (dish != dishes[i]) {
//                other[lastOtherIndex] = dishes[i];
//                lastOtherIndex += 1;
//            }
//        }
//        other = Arrays.copyOf(other, lastOtherIndex + 1);
//
//        if (other.length == 0) {
//            return unicDishes;
//        } else {
//            return getUnicDishes(other, acc);
//        }
//    }
//}
