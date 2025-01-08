
public class Array2D {
    public static void main(String[] args){

        //  2D ARRAYS : An Array Of A Arrays, think as Rows & Columns


        Integer[][] arr = {  {1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9},
                           };

        Integer[][] arr1 = new Integer[2][2];      // 2 Rows , 2 Columns. defining With Size

        arr1[0][0] = 1;
        arr1[0][1] = 2;   //  Then Adding The Elements To The Array
        arr1[1][0] = 3;
        arr1[1][1] = 4;

        for(int i=0; i< arr.length; i++){
            System.out.println();
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }


    }
}
