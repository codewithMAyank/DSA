public class maxsubarray {
    // Prefix Array Method
    //kr le 
    public static void pairs(int [] numbers) {
        int totalpair=0;
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");
                totalpair++;

            }
            System.out.println();
        }
        System.out.println("total pairs =>"+totalpair);
    }
    public static void main(String[] args) {
        int[] numbers = {1,4,6,9,2,3};
        pairs(numbers);

    }
}
