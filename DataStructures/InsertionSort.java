public class InsertionSort{
  public static void main(String[] args){
    int array[]={9,2,8,3,5,6,1};
    insertionSort(array);
      
  }
  public static void insertionSort(int[] array){
    for (j=1;j<array.length;j++){
      int temp = array[j];
      int i = j-1;
      while(i>0 && array[i]>temp){
        array[i+1]= array[i];
        i--;
      }
      array[i+1] = temp;
    }
  }
  
}
