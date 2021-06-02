class Solution {
    public String toGoatLatin(String sentence) {
        //Used to create the final Goat Latin Sentence
        StringBuilder sb = new StringBuilder("");
        //Splits the argument into an array of strings
        String[] words = sentence.split(" ");
        //Used later to add a to end of each word per index value
        String rdCon = "a";
        
        for(int i = 0; i < words.length; i++){
            //Used for 3rd condition, resets with every loop
            String rep = "";
            //Used for 2nd condition to store deleted consonant, resets with every loop
            char cons = 'a';
            //Used for 2nd condition to store the modified word, resets with every loop
            StringBuilder conWord = new StringBuilder("");
            
            //Checks for condition 1, if first letter is vowel
            if(words[i].charAt(0) == 'a' || words[i].charAt(0) == 'e' || words[i].charAt(0) == 'i' || words[i].charAt(0) == 'o'|| words[i].charAt(0) == 'u' || words[i].charAt(0) == 'A' || words[i].charAt(0) == 'E' || words[i].charAt(0) == 'I' || words[i].charAt(0) == 'O' || words[i].charAt(0) == 'U'){
                
                //Adds it the the final sentence
                sb.append(words[i]);
                sb.append("ma");
            }
            //If not vowel, it's a consonant
            else{
                //Adds it the the final sentence
                cons = words[i].charAt(0);
                conWord.append(words[i]);
                conWord.deleteCharAt(0);
                sb.append(conWord);
                sb.append(cons);
                sb.append("ma");
            }
            //Adds extra a and space
            rep = rdCon.repeat(i + 1);
            sb.append(rep);
            sb.append(" ");
        }
        //Deletes the last extra space
        sb.setLength(sb.length() - 1);
        String ans = sb.toString();
        return ans;
    }
}