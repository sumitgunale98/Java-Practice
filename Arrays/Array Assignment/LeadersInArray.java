public class LeadersInArray {
    public static void main(String[]args){
        int[]arr={1,2,13,12,5,2};
        int n= arr.length;
        System.out.println("Leader Elements are: ");

        for(int i=0;i<n;i++){
            boolean isLeader =true;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    isLeader =false;
                    break;
                }
            }
            if(!isLeader){
                System.out.println(arr[i]);
            }
        }
    }
}
