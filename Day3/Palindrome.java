package Day3;

public class Palindrome {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        boolean isPalindrome=false;
        int l=0;
        int r= arr.length-1;
        while(r>l){
            if(arr[r]==arr[l]){
                l++;
                r--;
                isPalindrome=true;
            }else{
                isPalindrome=false;
            }
        }
        System.out.println(isPalindrome);
    }
}
