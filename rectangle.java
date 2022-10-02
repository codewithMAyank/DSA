public class rectangle {
    public static void rectangle1(int totalrows,int totalcol) {
        //outer loop
        for (int i=1; i<=totalrows;i++){
            //inner loop
            for(int j=1;j<=totalcol;j++){
                if (i==1 || i == totalrows || j==1 || j==totalcol){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        rectangle1(4, 5);
    }
}
