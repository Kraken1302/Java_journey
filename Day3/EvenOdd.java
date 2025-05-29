package Day3;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int evencnt=0;
        int oddcnt=0;
        for(int i: arr){
            if(i%2==0){
                evencnt++;
            }else{
                oddcnt++;
            }
        }
        System.out.println("EVEN: "+evencnt+"   "+"ODD: "+oddcnt);
    }
}
