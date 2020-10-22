public class Demo {

public static void main(String[] args){

//    printLoop();

    int [][] arr = { {1,2,3}, {4,5,6}, {2} };
//    System.out.println(arrayDeepToString(arr)) ;

    int [][] arra = create2DArray(3,2,5);
//    System.out.println(arrayDeepToString(arra));

    int [][] arrayy = create2DArrayRandomized(4, 7, 9);
//    System.out.println(arrayDeepToString(arrayy));

}


  public static void printLoop(){

    for (int i = 1; i <= 5; i++){

      for (int j = 5; j >= i; j--){
        System.out.print(i);


    }
    System.out.println();
  }
}
  public static String arrToString(int[]arr){

    String str = "{";

  for (int i = 0 ; i < arr.length ; i++){

    str += arr[i];

    if (i != arr.length - 1){
      str += ", ";
    }

  }
  str += "}";
  return str;
  }

  public static String arrayDeepToString(int[][]arr){
    String stri = "{ ";

    for (int i = 0 ; i < arr.length ; i++){
        stri += arrToString(arr[i]);
        if (i != arr.length - 1){
          stri += ", ";
        }
    }

    stri += " }";
    return stri ;
     }

     public static int[][] create2DArray(int rows, int cols, int maxValue){
        int [][] arr = new int[rows][cols];

        int n = 0;


        for(int i = 0 ; i < arr.length; i++){
          for (int j = 0; j < arr[i].length; j++){
            arr[i][j] = n;
            if (n == maxValue) n = 0;
            else n++;
          }

        }

        return arr;
    }

    public static int[][] create2DArrayRandomized (int rows, int cols, int maxValue){
      int[][] arr = new int[rows][];
      int n = 0;

      for (int i = 0; i < arr.length; i++){

        arr[i] = new int[ (int)Math.round(Math.random()*cols)];
        for (int j = 0; j <arr[i].length ; j++){
          arr[i][j] = n;
          if (n == maxValue) n = 0;
          else n++;

        }

      }

      return arr;
    }

   }
