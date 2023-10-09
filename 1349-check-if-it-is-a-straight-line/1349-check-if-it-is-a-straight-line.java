class Solution {
   
        public boolean checkStraightLine(int[][] coordinates) {
        boolean ans = true;
        double fixSlope = slope(coordinates[0], coordinates[1]);

        for (int i = 1; i < coordinates.length; i++) {
            for (int j = i + 1; j < coordinates.length; j++) {
                if (slope(coordinates[i], coordinates[j]) != fixSlope) {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }

    public double slope(int[] x, int[] y) {
        if(y[0] - x[0]==0){
             return Double.POSITIVE_INFINITY; 
        }
        return (y[1] - x[1]) / (y[0] - x[0]);
    }
}