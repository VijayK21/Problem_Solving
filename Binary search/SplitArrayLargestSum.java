package problemSolv;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int ans =splitArray(nums,2);
		System.out.println(ans);
	}

	 public static int splitArray(int[] nums, int k) {
	      int start=0;
	      int end=0;

	      for(int i=0;i<nums.length;i++){
	        start = Math.max(start,nums[i]); 
	        end+=nums[i];
	      }

	      while(start<end){
	        int mid = start+(end-start)/2;
	        int sum=0;
	        int partition=1;

	       for(int num : nums){
	        if(sum+num>mid){
	            partition++;
	            sum = num;
	        }
	        else{
	            sum+=num;
	        }
	        					}
	          if(partition>k){
	        start=mid+1;
	      } 
	      else{
	        end=mid;
	      }
	       
	      				} 

	    return start;
	    }
}
