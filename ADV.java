public class ADV {
    public static void main(String[] args) {
        //BUTTERFLY PATTERN
        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * * 
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *
         
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(n*(n-i))/2;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
           for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(n*(n-i))/2;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
