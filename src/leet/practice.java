package leet;

public class practice {

	public static void main(String[] args) {
		
	}
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        for (int i = 0 ; i < nums.length-1 ; i++){
	        	
	            for (int j = 1+i; j < nums.length ; j++) {
	                if(nums[i] + nums[j] == target) {
	                     return new int[] {i, j};        
	                }
	            }
	        }
			return new int[2];
	        
	    }
	}

}
