public class ADV2 {
    public static void main(String[] args) {
        //           * * * * *
        //         * * * * *
        //       * * * * *           SOLID RHOMBUS PATTERN
        //     * * * * *
        //   * * * * *    
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
