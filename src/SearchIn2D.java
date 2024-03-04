//https://leetcode.com/problems/search-a-2d-matrix/submissions/1192621430/
public class SearchIn2D {
    public static void main(String[] args) {
        int [][] matrix={
                {1,3,5,7},
                {10,11,16,20},
                {23,34,63,60}
        };
        int target=14;
        System.out.println(searchMatrix(matrix,target));
    }

            static boolean searchMatrix(int[][] matrix, int target) {
                int row,col;
                for(row=0;row<matrix.length;row++)
                {
                    for(col=0;col<matrix[row].length;col++)
                    {
                        if(target==matrix[row][col])
                        {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
