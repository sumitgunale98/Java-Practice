public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {21, 34, 56, 34, 20, 21, 56, 89};
        int n = arr.length;
        System.out.println("After Removing duplicates: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i]+"");
        }

        }
    }
}