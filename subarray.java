public class subarray {
    //nested loop
    //2,4,6,8,10
    //start 2 end 4,6,8,10
    public static void printsubarray(int numbers[]) {
        for (int i=0;i<numbers.length;i++){
            for (int j=i;j<numbers.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(numbers[k]+"");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] number={2,4,6,8,10};
        printsubarray(number);
    }

}
