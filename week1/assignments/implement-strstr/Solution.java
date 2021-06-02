class Solution {
    public int strStr(String haystack, String needle) {
        //Checks if empty string
        if(needle == ""){
            return 0;
        }
        //Checks if needle is present in haystack
        if(haystack.contains(needle) == false){
            return -1;
        }
        //If the two top conditions are not met, needle must be in haystack
        //Returns the first index value of haystack when needle is found
        return haystack.indexOf(needle);
    }
}