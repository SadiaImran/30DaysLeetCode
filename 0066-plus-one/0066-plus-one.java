import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder ans = new StringBuilder() ;
        for(int i = 0 ; i<digits.length ; i++){
            ans.append(digits[i]);
        }
        BigInteger value = new BigInteger(ans.toString());
        value = value.add(BigInteger.ONE);
        String result = "";
        result = String.valueOf(value);

            int[] arr = new int[result.length()];
            for (int i = 0 ; i<arr.length ; i++){
                arr[i] = Character.getNumericValue(result.charAt(i));
            }
  



            return arr ;
        
    }
}