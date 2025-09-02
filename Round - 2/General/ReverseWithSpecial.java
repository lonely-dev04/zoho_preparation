public class ReverseWithSpecial {
    public static void main(String[] args) {
        String str = "Hemasundar's Age is 22";
        char[] array = str.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            boolean flag = false;
            if(!((array[i] >= 'a' && array[i] <= 'z') || (array[i] >= 'A' && array[i] <= 'Z'))) { i++; flag = true;}
            if(!((array[j] >= 'a' && array[j] <= 'z') || (array[j] >= 'A' && array[j] <= 'Z'))) { j--; flag = true;}
            if(flag) continue;
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(array));
    }
}