public class pairsarray {
    //all possible pairs
    //jese (1,2) like something
    //repeat nahi hona chahiye
    public static void pairs(int [] numbers) {
        for (int i=0;i<numbers.length;i++){
            int add = numbers[i];
            for (int j=i+1;j<numbers.length;j++){
                System.out.print("(" + add + "," + numbers[j] + ")");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1,4,6,9,2,3};
        pairs(numbers);

    }
}
