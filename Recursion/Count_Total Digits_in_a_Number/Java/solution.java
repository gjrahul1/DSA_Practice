class Solution {
    // complete the below function
    public static int countDigits(int n) {
        
        if (n==0) {
            
            return 0;
        }
        return 1 + countDigits(n/10);
        
    }
}
