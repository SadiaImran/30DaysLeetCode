class Solution {
    public int romanToInt(String s) {
        int sum = 0 ;
        for(int i =0 ; i<s.length() ;  i++){
            int n = i + 1;
            switch(s.charAt(i)) {
                case 'I': {
                    if (n < s.length() && s.charAt(n) == 'V') {
                        sum += 4;
                        i++;
                    } else if (n < s.length() && s.charAt(n) == 'X') {
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }
                    break;
                }
                case 'V': {
                    sum += 5;
                    break;
                }
                case 'X': {
                    if (n < s.length() && s.charAt(n) == 'L') {
                        sum += 40;
                        i++;
                    } else if (n < s.length() && s.charAt(n) == 'C') {
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                    break;
                }
                case 'L': {
                    sum += 50;
                    break;
                }
                case 'C': {
                    if (n < s.length() && s.charAt(n) == 'D') {
                        sum += 400;
                        i++ ; 
                    }
                    else if(n < s.length() && s.charAt(n) == 'M'){
                        sum += 900 ; 
                        i++ ; 
                    }
                    else{
                        sum += 100 ; 
                    }
                    break ; 
                }
                case 'D' : {
                    sum +=500 ; 
                    break ; 
                }
                case 'M' : {
                    sum +=1000 ; 
                    break ; 
                }
            }
        }
        return sum ;
    }
}