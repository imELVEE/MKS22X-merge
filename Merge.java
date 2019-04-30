public class Merge{
  public static void mergesort(int[]data){
    data = mergesort(data,0,data.length-1);
  }
  private static int[] mergesort(int[]data,int lo,int high){
    if (lo >= high){
      int[] sub = new int[high-lo+1];
      for (int i = 0 ; i < sub.length ; i++){
        sub[0] = data[i+lo];
      }
      return sub;
    }
    //mergesort left side
    int[] left = mergesort(data,lo,high-1);
    //mergesort right side
    int[] right = mergesort(data,lo+1,high);
    return merge(left,right);
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
