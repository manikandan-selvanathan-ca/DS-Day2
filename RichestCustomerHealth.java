public class RichestCustomerHealth {
    public int maximumWealth(int[][] accounts) {
        //Row - Customer
        //Column - Bank
        int max = Integer.MIN_VALUE;
        if(accounts == null || accounts.length == 0) return 0;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i=0;i<m;i++) {
            int currentSum = 0;
            for(int j=0;j<n;j++) {
                currentSum += accounts[i][j];
            }
            max = Math.max(max, currentSum);
        }
        return max;
    }
}
