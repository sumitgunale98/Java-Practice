public class SpecificValue {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,9,8,87,76,56};
        int inputValue = 87;
        boolean Found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==inputValue){
                Found=true;
                break;

            }

        }
        if(Found) {
            System.out.println("Given value is Present in Array");
        }
        else{
            System.out.println("Given value is Not Present in Array");
        }
    }
}
