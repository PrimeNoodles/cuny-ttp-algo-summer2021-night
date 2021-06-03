class Solution {
    public int reverse(int x) {
        //Checks if negative or not
        int state = 0;
        //The reverse answer being returned
        int rev = 0;
        //Temp int to store reverse integers
        int temp = 0;
        //This tells if the result needs to be negated if it's a negative number
        if(x < 0){
            state = -1;
        }
        //Checks if x is a single digit, then return it; there is nothing to reverse
        if(Math.abs(x) < 10 && Math.abs(x) >= 0){
            return x;
        }
        //This gets each digit by it's power of 10th place and multiplies it by it's place in length, adding it to rev 
        while(Math.abs(x) / 10 != 0){
            temp = x % 10;
            x = x/10;
            rev += temp;
            rev *= 10;
        }
        //If was originally a negative number, make answer negative
        rev += x;
        if(state == 1){
            rev *= -1;
        }
        return rev;
    }
}

//The problem I had was dealing with int overflow, because integers can only contain a certain range, I don't know how to deal with this issue