package javaBasic;

public class Arrays1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        String [][] stringsArr = {
                {"One", "Two", "There"},
                {"City", "Arsenal", "Chelsea"}
        };
        System.out.printf("to find length or array is "+ nums.length + "\n");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d \n", nums[i]);
        }
        System.out.printf("to find stringsArr or array is "+ stringsArr.length+ "\n");
        for (int i = 0; i < stringsArr.length; i++){
            for(int j=0; j < stringsArr[i].length; j++){

                System.out.printf("%s ", stringsArr[i][j]);
            }
            System.out.println();
        }

        // Looping through multidimensional arrays (перебор массива в цикле)
        int[][] nums2 = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums2.length; i++){
            for(int j=0; j < nums2[i].length; j++){

                System.out.printf("%d ", nums2[i][j]);
            }
            System.out.println();
        }
    }
}
