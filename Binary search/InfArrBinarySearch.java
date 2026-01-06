package problemSolv;

public class InfArrBinarySearch {

	public static void main(String[] args) {
		
		int start=0;
		int end=1;
		int[] arr = {1,44,52,56,67,89,99,123,253,566,599,601,623,655,763,799,800,801,804,850,900};
		int target=623;
		
		while(target>arr[end]) {
			int newStart = end+1;
			
			end=end+(end-start+1)*2;
			
			start=newStart;
			
			
		}
		
		System.out.println(binarySearch(arr,target,start,end));
	}
	
	
	
	static int binarySearch(int[] arr,int target,int start,int end) {
		
		while(start<=end) {
			int mid= start+(end-start)/2;
			
			if(arr[mid]>target) {
				end=mid-1;
			}
			
			else if(arr[mid]<target) {
				start=mid+1;
			}
			
			else {
				return mid;
			}
			
		}
		
		return -1;
	}

}
