package problemSolv;

public class binarySearch {

	public static void main(String[] args) {
		//int[] arr = {1,33,44,55,66,76,83,100,299};
		//int[] arr = {1223,1000,200,100,50};
		int[] arr= {551,551,551,551,551,550};
		int target = 5;
		System.out.println(ceilingOfNum(arr,target));
	//	System.out.println(floorOfNum(arr,target));

	}
	
	
	static int binarysearch(int arr[],int target) {
		int start =0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start]<arr[end];
		
		while(start<=end) {
		int mid = start + (end-start)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		
		if(isAsc) {
			if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			
		}
		else {
			if(arr[mid]>target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		
	}
		return -1;
	}
	
	static int ceilingOfNum(int arr[],int target) {
		//smallest number that is bigger than the target
		int start =0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start]<arr[end];
		if(isAsc) {
		if(arr[end]<target) {
			return -1;
		}
		}
		
		while(start<=end) {
		int mid = start + (end-start)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		
		if(isAsc) {
			if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			
		}
		else {
			if(arr[mid]>target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
	
		
	}
		if(isAsc) {
			return start;
		}
		else {
			return end;
		}
	}
	
static int floorOfNum(int arr[],int target) { 
	//biggest number that is smaller than the target
		int start =0;
		int end = arr.length-1;
		boolean isAsc = arr[start]<arr[end];
		if(isAsc) {
		
		  if(arr[end]>target) { return -1; }
		 
		}
		else {
			if((arr[start]>target)){ return -1; }
		}
		
		while(start<=end) {
		int mid = start + (end-start)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		
		if(isAsc) {
			if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			
		}
		else {
			if(arr[mid]>target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
	
		
	}
		if(isAsc) {
			return end; 
		}
		else {
			return start;
		}
	}
}
