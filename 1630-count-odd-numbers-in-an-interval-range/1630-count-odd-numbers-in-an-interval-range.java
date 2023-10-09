class Solution {
    public int countOdds(int low, int high) {
        int range = (high - low + 1) / 2;

        if (low % 2 == 0 && high % 2 == 0) {
            return range;
        } else if (low % 2 != 0 && high % 2 != 0) {
            return range + 1;
        } else {
            return range;
        }
    }
}

