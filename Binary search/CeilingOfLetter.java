package problemSolv;

public class CeilingOfLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] arr={'c','f','j'};
		char res =nextGreatestLetter(new char[]{'c','f','j'},'c');
		System.out.println(res);
	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){

            int mid = start+(end-start)/2;

            if(mid>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start % (letters.length)];

    }

}
