class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsCandies = new ArrayList<>();
        for(int i = 0 ; i < candies.length ; i++){
            Boolean ans = true ; 
            for(int j = 0 ;j<candies.length ; j++){
                int value = candies[i] ; 
                if(value+extraCandies < candies[j]){
                    ans = false ; 
                }
            }
            kidsCandies.add(ans);
        }
        return kidsCandies ; 
    }

}