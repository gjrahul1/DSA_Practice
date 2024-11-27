public class Sum_of_Natural_Numbers {
    static int sum(int n) {

        if(n == 0) {
            return 0;
        }

        return n +  sum(n-1);
    }
    public static void main(String[] args) {
        int results;
        results = sum(5);
        System.out.print(""+results);
    }
}
