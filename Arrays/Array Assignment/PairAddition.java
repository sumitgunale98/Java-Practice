public class PairAddition {
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5,6,7,8,10,9};
        int totalSum=6;
        System.out.println("Pairs with addition "+totalSum +" :");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==totalSum){
                    System.out.println(arr[i]+"+"+arr[j]);
                }
            }
        }
    }
}
