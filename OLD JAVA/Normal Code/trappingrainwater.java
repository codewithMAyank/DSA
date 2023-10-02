public class trappingrainwater {
    //iterview impotant
    // auxillary arrays / helper array
    // minimum number sof baar is more than 2
    // no ascending or descending bar sequence 
    // 2 pointer approach
    public static int water_elevation(int [] bars) {
        // calculated left max 
        int [] leftmax= new int [bars.length];
        leftmax[0]= bars[0];
        for (int i=1;i<bars.length; i++){
            leftmax[i]= Math.max(bars[i], leftmax[i-1]);
        }
        // right max boundary
        int [] rightmax= new int [bars.length];
        rightmax[bars.length-1]= bars[bars.length-1];
        for (int i=bars.length-2;i>=0; i--){
            rightmax[i]= Math.max(bars[i], rightmax[i+1]);
        }
        int trapped_water= 0;
        // loop 
        for (int i=0;i<bars.length;i++){
            int trappingrainwater= Math.min(leftmax[i],rightmax[i]);
            trapped_water+=trappingrainwater - bars[i];

        }
        return trapped_water;
        // water = (left minmimum boundary and right max boundary)
        // trapped water = water level - actual height
    }
    public static void main(String[] args) {
        int[] bars = {4,6,8,2,3,6,10};
        System.out.println(water_elevation(bars));
    }
}
