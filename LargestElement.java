class Largestelement {
    public static void main(String[] args) {
        int[] arr = { 20, 5, 15, 23, 30, 9 };
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Enter largest element = " + largest);
    }
}