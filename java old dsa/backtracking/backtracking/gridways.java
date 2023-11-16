package backtracking;

public class gridways {
    public static int gridways(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1) { //condititon for last cell
            return 1;
        }
        if(i>=n || j>=m) { //condition for out of grid
            return 0;
        }
        return gridways(i+1, j, n, m) + gridways(i, j+1, n, m);
        
    }
    public static void main(String[] args) {
        int n=3 , m=3;
        System.out.println(gridways(0, 0, n, m));
    }
}

//slow process  time complexity: O(2^(n+m))