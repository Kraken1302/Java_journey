package Day3;

public class Reversearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int l=0;
        int r=arr.length - 1;
        while(r>l){
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
        }
        for (int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
