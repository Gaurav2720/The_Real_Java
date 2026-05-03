package assignment;
//4. Write a program to find all duplicate elements in an array using O(1) extra space
class Test {
    public static void main(String[] args) {
        System.out.println("Name: Gaurav Bhaskar, SAP ID: 590012457");
        int arr[] = {1,2,3,1,3,6,6};
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] >= 0)
                arr[index] = -arr[index];
            else
                System.out.println("Duplicate: " + index);
        }
    }
}