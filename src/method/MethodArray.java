package method;

public class MethodArray {
    static int findSmallest(int[] arr ) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }
        return smallest;
    }
    public static void main(String[] args){
        int[] result = {2,6,1,9,5,3};
        int Largest = findSmallest(result);
        System.out.println("Smallest = "+Largest);
    }
}
