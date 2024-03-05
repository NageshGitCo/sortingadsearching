import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    //sorting an array using comparator
    public static void sorting1(String[] args) {
        String[] array = {"Java", "Python", "C++", "C"};
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("Using Comarator: "+Arrays.toString(array));  // prints [C, Java, Python, C++]
    }
    //create a method for Bubble Sort
    public static void sorting2(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        bubbleSort(array);
        System.out.println("Bubble Sort: "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap the elements!
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //create a method for Selection Sort
    public static void sorting3(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        selectionSort(array);
        System.out.println("Selection Sort "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
    //create a method for Insertion Sort
    public static void sorting4(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        insertionSort(array);
        System.out.println("Insertion Sort "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    //create a method for Merge Sort
    public static void sorting5(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        mergeSort(array, 0, array.length - 1);
        System.out.println("Merge Sort "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    //create a method for Quick Sort
    public static void sorting6(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println("Quick Sort "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }
    public static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }
    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i+1];
        array[i+1] = array[end];
        array[end] = swapTemp;

        return i+1;
    }
    //create a method for Heap Sort
    public static void sorting7(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        heapSort(array);
        System.out.println("Heap Sort "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }  
    public static void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for (int i = n-1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && array[l] > array[largest])
            largest = l;

        if (r < n && array[r] > array[largest])
            largest = r;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }
    //create a method for Counting Sort
    public static void sorting8(String[] args) {
        int[] array = {5, 2, 8, 9, 1};
        countingSort(array);
        System.out.println("Counting Sort "+Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
    }

    public static void countingSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }

    

}