package method;

public class MethodArray {
    static int findLargest(int[] arr ) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.print(largest);
        return largest;
    }
    public static void main(String[] args){
        int[] result = {2,6,1,9,5,3};
        int Largest = findLargest(result);
        System.out.println("Largest = "+Largest);
    }
}
