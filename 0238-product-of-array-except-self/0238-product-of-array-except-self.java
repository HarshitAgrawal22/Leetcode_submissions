class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr= new int[nums.length];
        int pord=1 ;
        for(int i =0 ; i< nums.length; i++){
            pord = pord * nums[i]; 
        }
        System.out.println(pord);
        for( int i = 0 ; i< nums.length;i++){
            arr[i]= nums[i]==0 ? product(nums, i): pord / nums[i];
        }
        return arr;
    }
    int product(int[]nums , int ip){
        int pord = 1;
        for(int i =0 ; i< nums.length; i++){
            if(i==ip){continue;}
            pord = pord * nums[i]; 
        }
        return pord;
    }
}