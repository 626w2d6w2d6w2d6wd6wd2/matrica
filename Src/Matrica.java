import java.util.Arrays;
import java.util.Random;

public class Matrica {

    public static void main(String[] args) {
        int[][] array = new int[5][3];
        Random random = new Random();

        for (int n = 0; n < array.length; n++) {

            for (int m = 0; m < array[n].length; m++) {
                array[n][m] = random.nextInt(10);
            }
        }

        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array[n].length; m++) {

               System.out.print(array[n][m]+"\t");
               // Arrays.sort(array);
                System.out.println(Arrays.deepToString(array));
            }
        }


    }
    }
























//        for (int m = 0; m < array.length; m++) {
  //          for (int n = 0; n < array[m].length; n++) {
    //            array[m][n] = random.nextInt(10);
      //      }
        //}
          //      for (int n = 0; n < array.length; n++) {
            //        for (int m = 0; m < array[n].length; m++)

              //          System.out.print(array[n][m] + "\t");
                //    }

                  //  System.out.println(Arrays.deepToString(array));







