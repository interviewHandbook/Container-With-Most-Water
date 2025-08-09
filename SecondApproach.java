package com.interviewprep.leetcode.medium.containerwithmostwater;

public class SecondApproach {

	public static void main(String[] args) {

		//int[] height = {1,8,6,2,5,4,8,3,7};
		//int[] height = {1,1};
		int[] height = {8,7,2,1};
		
		SecondApproach sa = new SecondApproach();
		int maxArea = sa.maxArea(height);
		
		System.out.println(maxArea);
	}
	
	
	
	 public int maxArea(int[] height) {
		    
		    int maxArea = 0;
		    int left = 0;
		    int right = height.length-1;
		    int altitude = 0;
		    int width = 0;
		    
		    while(left <= right) {
		    			    	
		    	altitude = Math.min(height[left] , height[right]);
		    	width = right - left;
		    	maxArea = Math.max(maxArea, altitude*width);
		    	
		    	// compare the two heights and move towards bigger
		    	if(height[left] < height[right])
		    		left++;
		    	else
		    		right--;	    	
		    	
		    }
		    	    
		    return maxArea;
	    }

}
