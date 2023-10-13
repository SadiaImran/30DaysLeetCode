#include <algorithm>

class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string mergedString = "";
    int lastIndex = 0;
    int lessLength = 0 ;
    if (word1.length() < word2.length()) {
        lessLength = word1.length() ; 
    }else{
        lessLength = word2.length();
    }

    for (int i = 0; i < lessLength; i++) {
        mergedString += word1[i];
        mergedString += word2[i];
        lastIndex = i;
    }
    string extra ="";
    if(word1.length() > word2.length()){
        extra = word1 ; 
    }
    else{
        extra = word2 ; 
    }
    for (int j = lastIndex + 1; j < max(word1.length(),word2.length()); j++) {
        mergedString += extra[j];
    }

    return mergedString;
    }
};