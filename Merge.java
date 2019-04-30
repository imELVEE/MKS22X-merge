public class Merge{
  public static void mergesort(int[]data){
  }
  private static void mergesort(int[]data,int lo,int high){
    /*
    if lo >= hi :
      return
    mergesort left side
    mergesort right side
    merge
    */
  }
  private static int[] merge(int[] data1, int[] data2){
    int[] merged = new int[data1.length + data2.length];
    int counter1 = 0;
    int counter2 = 0;
    for (int i = 0 ; i < merged.length ; i++){
      if (counter1 < data1.length && counter2 < data2.length){
        if (data1[counter1] > data2[counter2]){
          merged[i] = data1[counter1];
          counter1++;
        }
        else{
          merged[i] = data2[counter2];
          counter2++;
        }
      }
      else if (counter1 < data1.length){
        merged[i] = data1[counter1];
        counter1++;
      }
      else{
        merged[i] = data2[counter2];
        counter2++;
      }
    }
    return merged;
  }

}
