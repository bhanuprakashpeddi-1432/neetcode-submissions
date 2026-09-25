class Solution {
    public boolean isPalindrome(String s) {

// Fails when contains NON-APLHABETS
        // for(int i = 0; i < s.length(); i++){
        //     if(s.charAt(i) != s.charAt(s.length()-1-i)){

        //         return false;

        //     }
        // }
        // return true;

        int frst = 0, lst = s.length()-1;

        while(frst < lst){

            //edge case is important frsyt < lst

            while(frst < lst && !Character.isLetterOrDigit(s.charAt(frst))){
                frst++;
            }

            while(frst < lst && !Character.isLetterOrDigit(s.charAt(lst))) {
                lst--;
            }

            //char at same is onnly equalss
            if(Character.toLowerCase(s.charAt(frst)) != Character.toLowerCase(s.charAt(lst))) {
                return false;
            }
            frst++;
            lst--;
        }

        return true;
        
    }
}
