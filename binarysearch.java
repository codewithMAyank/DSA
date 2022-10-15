public class binarysearch {
    // dictionary wala search
    // binary search
    // sorted arrray acending or decending
    // start index 0
    // elements 7
    // end 7
    // start 0 end 7 
    // end=n-1
    // while (start<=end)
    // find mid = start + end/2
    // compare mid with key
    // mid==key matlab beeach ka , return output
    // mid>key left me he 1st half , end update
    // mid < key right me he 2nd half , start update
    public static int merabinary(int number[],int key) {
        int start = 0 ,end = number.length-1;
        while (start <=end) {
            int mid = start+end/2;
            //comparision krne ki bari
            if (number[mid]==key){
                System.out.println(mid);
            }
            if (number[mid]>key){//left
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    // ye important staps he 
    public static void main(String[] args) {
        int[] number={1,2,45,99,46,6,55,97};
        int key = 2;
        System.out.println("index search in binary"+merabinary(number,key));
    }
}
