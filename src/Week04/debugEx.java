package Week04;

public class debugEx {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        arr = reverse(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] arr) {
        int[] result = arr;
        int last=arr[2];
        result[0] = last;
        result[1] = arr[1];
        result[2] = arr[0];
        return result;
    }
}
