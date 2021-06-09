import java.util.*;

class KidsWithCandies{

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        
        
        for(int i=0;i<candies.length;i++) {
         int sum = candies[i] +extraCandies;
            if(sum>=max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        KidsWithCandies kidsWithCandies = new KidsWithCandies();
        List<Boolean> result = kidsWithCandies.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        System.out.println("The result is"+ result);
    }
}