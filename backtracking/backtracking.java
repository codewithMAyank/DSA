package backtracking;

public class backtracking {
    public static void changearr(int arr[], int i, int val) {
        //base case
        if (i==arr.length) {
            printArr(arr);
            return;
        }
        //recurssion
        arr[i] = val;
        changearr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
        
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
        System.out.println();
        }
    public static void main(String[] args) {
        int arr[]= new int [5];
        changearr(null, 0, 1);
        printArr(arr);
    }
}
