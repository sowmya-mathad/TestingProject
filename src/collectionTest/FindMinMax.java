package collectionTest;

public class FindMinMax {
    public static void main(String args[]) {
        int[] array = {23,45,67,10,4,7};
       int temp;
        for(int i=0;i<array.length;i++) {

            for(int j=i;j<array.length;j++){
                if(array[i] >= array[j]) {
                   temp = array[i];
                   array[i]=array[j];
                   array[j] = temp;
                }
            }
        }

         System.out.println("Min:" + array[0] + "Max: ");

        }
  }
