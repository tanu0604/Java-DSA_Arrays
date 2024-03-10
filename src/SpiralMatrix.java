import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] mat = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int n = mat.length;
        int m = mat[0].length;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        int[] arr = new int[n * m];
        int index = 0;
        while (top <= bottom && left <= right) {
            // At first it will move from left to right and the top remains constant
            for (int i = left; i <= right; i++) {
                arr[index++] = mat[top][i];
            }
            top++;

            // Second is from top to bottom and the right remains constant
            for (int i = top; i <= bottom; i++) {
                arr[index++] = mat[i][right];
            }
            right--;

            if (top <= bottom) {
                // Third is from right to left and the bottom is constant
                for (int i = right; i >= left; i--) {
                    arr[index++] = mat[bottom][i];
                }
                bottom--;
            }

            // Fourth move is from bottom to top and the left remains constant
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[index++] = mat[i][left];
                }
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
