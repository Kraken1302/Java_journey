// package Day3;

// public class MaxMin {
//     public static void main(String[] args) {
//         int arr[]={7,2,9,4,1};
//         int max= Integer.MAX_VALUE ;
//         int min= Integer.MIN_VALUE;
//         for(int i:arr){
//             if(i>max){
//                 max=i;
//             }if( i<min){
//                 min=i;
//             }
//         }
//         System.out.println(max+" "+min);
//     }
// }

package Day3;

public class MaxMin {
    public static void main(String[] args) {
        int arr[]={7,2,9,4,1};
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }if( i<min){
                min=i
            }
        }
        System.out.println("MAX: "+max+"   "+"MIN: "+min);
    }
}
