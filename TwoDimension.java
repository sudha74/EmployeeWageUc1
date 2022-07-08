import java.io.IOException;

public class TwoDimension {
    // java program to print the elements of
    // a 2 D aaray or matrix


        public static void print2D(int mat[][]) {
            // Loop through all rows
            for (int i = 0; i < mat.length; i++)
                // Loop through elements of all elements of current row
                for (int j = 0; j < mat[i].length; j++)
                    System.out.println(mat[i][j] + " ");
        }

        public static void main(String[] args)
                throws IOException {
            int mat[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};


            print2D(mat);
        }
    }


