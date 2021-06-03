class Solution {
    public String toLowerCase(String s) {
        //Convert the string into an array of characters
        char[] let = s.toCharArray();
        //This is used to store the lowercase string to return
        String ans = "";
        //Goes through a switch statement, if it's an upper case, add the lower case equivalent to the string, otherwise add the character at the current index to the string which should be its lower case equivalent
        for(int i = 0; i < s.length(); i++){
            switch(let[i]){
                case 'A':
                    ans += 'a';
                    break;
                case 'B':
                    ans += 'b';
                    break;
                case 'C':
                    ans += 'c';
                    break;
                case 'D':
                    ans += 'd';
                    break;
                case 'E':
                    ans += 'e';
                    break;
                case 'F':
                    ans += 'f';
                    break;
                case 'G':
                    ans += 'g';
                    break;
                case 'H':
                    ans += 'h';
                    break;
                case 'I':
                    ans += 'i';
                    break;
                case 'J':
                    ans += 'j';
                    break;
                case 'K':
                    ans += 'k';
                    break;
                case 'L':
                    ans += 'l';
                    break;
                case 'M':
                    ans += 'm';
                    break;
                case 'N':
                    ans += 'n';
                    break;
                case 'O':
                    ans += 'o';
                    break;
                case 'P':
                    ans += 'p';
                    break;
                case 'Q':
                    ans += 'q';
                    break;
                case 'R':
                    ans += 'r';
                    break;
                case 'S':
                    ans += 's';
                    break;
                case 'T':
                    ans += 't';
                    break;
                case 'U':
                    ans += 'u';
                    break;
                case 'V':
                    ans += 'v';
                    break;
                case 'W':
                    ans += 'w';
                    break;
                case 'X':
                    ans += 'x';
                    break;
                case 'Y':
                    ans += 'y';
                    break; 
                case 'Z':
                    ans += 'z';
                    break;                     
                default:
                    ans += let[i];
            }
        }
        return ans;
    }
}