class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        Integer max= Integer.MIN_VALUE;

        for(int i =0 ;i < candies.length ; i++){

            max = Math.max(max, candies[i]);
        }
        for(int i =0 ;i < candies.length ; i++){
            Integer a= candies[i];
            if(candies[i] +extraCandies>= max ){
               
                result.add(true);
                System.out.println(a);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}