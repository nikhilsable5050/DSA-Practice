package Arrays;

public class RemoveDuplicatesUnsorted {

    // Method to remove duplicates from an unsorted array
    // Returns the new valid length after removing duplicates
    public static int removeDuplicate(int[] arr){

        int n = arr.length;   // Current valid size of array

        // Outer loop: pick one element at a time
        for(int i = 0; i < n; i++){

            // Inner loop: compare with all elements after index i
            for(int j = i + 1; j < n; j++){

                // If duplicate found
                if(arr[i] == arr[j]){

                    // Replace duplicate with last valid element
                    arr[j] = arr[n - 1];

                    // Reduce the size of valid array
                    n--;

                    // Decrease j so that we re-check
                    // the swapped element at index j
                    j--;
                }
            }
        }

        // Return new size of array after removing duplicates
        return n;
    }

    public static void main(String[] args){

        int[] arr = {2,6,3,2,4,6,3};

        // Print original array
        System.out.println("Before removing duplicates:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Call method and store new valid length
        int newLength = removeDuplicate(arr);

        // Print updated array (only valid elements)
        System.out.println("\nAfter removing duplicates:");
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
}