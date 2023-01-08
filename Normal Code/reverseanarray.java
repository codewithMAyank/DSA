public class reverseanarray {
    public static void reverse(int numbers[]) {
        int first= 0, end = numbers.length-1;
        while (first < end) {
            //swap technique
            int temp = numbers[end];
            numbers[end]= numbers[first];
            numbers[first]= temp;
            // classical swaping code uper wala
            first++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50}; 
        reverse(numbers); 
        for (int i = 0 ; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
}
