public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] array1 = {5, 4, 1, 2};
        int n1 = 5;
        System.out.println("Missing number: " + findMissingNumber(array1, n1)); // Expected output: 3

        int[] array2 = {9, 5, 3, 2, 6, 1, 7, 8, 10};
        int n2 = 10;
        System.out.println("Missing number: " + findMissingNumber(array2, n2)); // Expected output: 4

        int[] array3 = {2, 3, 1, 5};
        int n3 = 5;
        System.out.println("Missing number: " + findMissingNumber(array3, n3)); // Expected output: 4

        int[] array4 = {1, 2, 3, 4, 5};
        int n4 = 6;
        System.out.println("Missing number: " + findMissingNumber(array4, n4)); // Expected output: 6
    }

    public static int findMissingNumber(int[] array, int x) {
        int Sum = x * (x + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return Sum - actualSum;
    }
}

//Time Complexity of above code is O(n)
