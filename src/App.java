import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]

        //searching for an element
        int index = Arrays.binarySearch(array, 5);
        System.out.println("Sorted Element " +index);  // prints 2
        //invoke the sorting method
        Sorting.sorting1(args);
        Sorting.sorting2(args);
        Sorting.sorting3(args);
        Sorting.sorting4(args);
        Sorting.sorting5(args);
        Sorting.sorting6(args);
        Sorting.sorting7(args);
        Sorting.sorting8(args);
        //invoke the searching method
        Searching.linearSearch(args);
        Searching.binarySearch(args);
        Searching.jumpSearch(args);
        Searching.exponentialSearch(args);
        Searching.interpolationSearch(args);
        


        


    }
    
    



}