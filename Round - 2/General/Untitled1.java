public class StringReverse {
    public static void main(String[] args) {
        String str = "Abc@D";
        char[] array = str.toCharArray();
        int i = 0;
        int j = array.length - 1;
        boolean flag = false;
        while(i < j) {
            if(array[i] < 'a' && array[i] > 'z' && array[i] < 'A' && array[i] > 'Z') { i++; flag = true;}
            if(array[j] < 'a' && array[j] > 'z' && array[j] < 'A' && array[j] > 'Z') { j--; flag = true;}
            if(flag) continue;
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}