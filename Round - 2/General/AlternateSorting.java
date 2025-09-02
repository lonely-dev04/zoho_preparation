public class AlternateSorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for(int i=0,n=array.length;i<n;i++) {
            if(i % 2 == 0) {
                for(int j=i+1;j<n;j++) {
                    if(array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp; 
                    }
                }
            } else {
                for(int j=i+1;j<n;j++) {
                    if(array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp; 
                    }
                }
            }
        }

        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
}