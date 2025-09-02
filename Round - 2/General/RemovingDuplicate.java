public class RemovingDuplicate {
    public static void main(String[] args) {
        String str = "aabbbcc";
        char prev = '1';
        String result = "";
        char[] array = str.toCharArray();
        for(int i=0;i<array.length;i++) {
            if(prev == array[i]) {
                continue;
            } else {
                prev = array[i];
                result += prev;
            }
        }
        System.out.println("Result: "+result);
    }
}