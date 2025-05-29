package Day3;

public class Sumarr{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int i: arr){
            sum += i;      //i is element itsel not index
            
        }
        System.out.println(sum);
    }
}
