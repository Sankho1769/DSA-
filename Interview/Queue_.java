package Interview;

import java.util.Scanner;

public class Queue_ {
    static double findMedian(int[] a, int[] b) {
        if (a.length > b.length) {
            return findMedian(b, a);
        }

        int n = a.length;
        int m = b.length;

        int low = 0;
        int high = n;

        while (low <= high) {
            int cutA = (low + high) / 2;
            int cutB = (n + m + 1) / 2 - cutA;

            int leftA = cutA == 0 ? Integer.MIN_VALUE : a[cutA - 1];
            int rightA = cutA == n ? Integer.MAX_VALUE : a[cutA];

            int leftB = cutB == 0 ? Integer.MIN_VALUE : b[cutB - 1];
            int rightB = cutB == m ? Integer.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }

                return Math.max(leftA, leftB);
            }

            if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println(findMedian(a, b));

        sc.close();
    }
}