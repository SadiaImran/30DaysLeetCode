class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividing = new ArrayList<>() ;
        for(int i = left ; i<= right ; i++){
            if (!containsZero(i)){
                boolean ans = true ;
                int num = i ;
                while (num > 0 ){
                    int remainder = num % 10 ;
                    if(i % remainder != 0 || remainder ==0){
                        ans = false ;
                        break;
                    }
                    else{
                        num = num/ 10 ;
                    }

                }
                if(ans){
                    selfDividing.add(i);
                }
            }
        }


        return selfDividing ;

    }
     public boolean containsZero(int n ) {
        boolean ans = false ;
        if(n == 0 || n==10) {
            ans = true ;
            return ans ;
        }
        else {
            if(n<10){
                ans = false ;
                return ans ;
            }
            else{
                while (n >= 10) {
                    int remainder = n % 10;
                    if (remainder == 0) {
                        ans = true;
                        return ans;
                    } else {
                        n = n / 10;
                    }
                }
            }
        }
        return  ans ;
    }
}
