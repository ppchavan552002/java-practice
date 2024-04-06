public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int position = -1; // Initialize position to -1
        
        // Binary search logic directly within the main method
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == k) {
                position = mid; // Update position if k is found
                break; // Exit loop once k is found
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // Print the position of k in the array
        if (position != -1) {
            System.out.println("Position of " + k + " in the array: " + position);
        } else {
            System.out.println(k + " is not present in the array.");
        }
    }
}
