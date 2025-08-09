package com.interviewprep.leetcode.medium.containerwithmostwater;

public class FirstApproach {

	public static void main(String[] args) {
		
		//int[] height = {1,8,6,2,5,4,8,3,7};
		//int[] height = {1,1};
		int[] height = {8,7,2,1};
		
		FirstApproach fa = new FirstApproach();
		int maxArea = fa.maxArea(height);
		
		System.out.println(maxArea);
	}

	
	public int maxArea(int[] height) {

		int maxArea = 0;

		int altitude = 0;
		int width = 0;
		
		// start right from 1 and keep increasing
		for(int right=1; right< height.length; right++) {
			
			// start left from 0 and go towards right
			for(int left=0; left<right; left++) {
				
				altitude = Math.min(height[left] , height[right]);
		    	width = right - left;
		    	maxArea = Math.max(maxArea, altitude*width);
			}
					
		}
				
		return maxArea;
	}
}
