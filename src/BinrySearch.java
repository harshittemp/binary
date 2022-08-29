public class BinrySearch {
    public static void main(String[] args) {

 int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
 int target=22;
 int ans= binrysearch(arr,target) ;
        System.out.println(ans);
    }
    //return index
    //return -1 if not exit
    static int binrysearch(int[]arr,int target){
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2//might be possible that(start +end will exceed the range in java)
            int mid =start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;


            }
            else {
                return mid;
            }
        }



        return -1;
    }
 }
