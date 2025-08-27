public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 7, 15, 9 };
        int largest = arr[0];
        int slargest = -1;
        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < ssmallest && arr[i] > smallest) {
                ssmallest = arr[i];
            }
        }
        System.out.println("SecondLargest element is: " + slargest);
        System.out.println("Largest element is: " + largest);
        System.out.println("Secondsmallest element is: " + ssmallest);
        System.out.println("Smallest element is: " + smallest);
    }
}