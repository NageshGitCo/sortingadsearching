/*
 * create a class with different searching algorithms
 * comment out the main method
 */

 import java.util.Arrays;

 public class Searching {
     //create a method for Linear Search
     public static void linearSearch(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         int index = linearSearch(array, 8);
         System.out.println("Linear Search: "+index);  // prints 2
     }
     public static int linearSearch(int[] array, int key) {
         for(int i=0;i<array.length;i++){
             if(array[i] == key){
                 return i;
             }
         }
         return -1;
     }
     //create a method for Binary Search
     public static void binarySearch(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = binarySearch(array, 5);
         System.out.println("Binary Search: "+index);  // prints 2
     }
     public static int binarySearch(int[] array, int key) {
         int first = 0;
         int last = array.length - 1;
         while(first <= last) {
             int mid = (first + last) / 2;
             if(array[mid] == key) {
                 return mid;
             }
             if(array[mid] < key) {
                 first = mid + 1;
             } else {
                 last = mid - 1;
             }
         }
         return -1;
     }
     //create a method for Jump Search
     public static void jumpSearch(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = jumpSearch(array, 5);
         System.out.println("Jump Search: "+index);  // prints 2
     }
     public static int jumpSearch(int[] array, int key) {
         int n = array.length;
         int step = (int)Math.floor(Math.sqrt(n));
         int prev = 0;
         while(array[Math.min(step, n)-1] < key) {
             prev = step;
             step += (int)Math.floor(Math.sqrt(n));
             if(prev >= n) {
                 return -1;
             }
         }
         while(array[prev] < key) {
             prev++;
             if(prev == Math.min(step, n)) {
                 return -1;
             }
         }
         if(array[prev] == key) {
             return prev;
         }
         return -1;
     }
     //create a method for Interpolation Search  
     public static void interpolationSearch(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = interpolationSearch(array, 5);
         System.out.println("Interpolation Search: "+index);  // prints 2
     }
     public static int interpolationSearch(int[] array, int key) {
         int low = 0;
         int high = array.length - 1;
         while(low <= high && key >= array[low] && key <= array[high]) {
             int pos = low + ((key - array[low]) * (high - low)) / (array[high] - array[low]);
             if(array[pos] == key) {
                 return pos;
             }
             if(array[pos] < key) {
                 low = pos + 1;
             } else {
                 high = pos - 1;
             }
         }
         return -1;
     }
     //create a method for Exponential Search
     public static void exponentialSearch(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = exponentialSearch(array, 5);
         System.out.println("Exponential Search: "+index);  // prints 2
     }
 
     public static int exponentialSearch(int[] array, int key) {
         int n = array.length;
         if(array[0] == key) {
             return 0;
         }
         int i = 1;
         while(i < n && array[i] <= key) {
             i = i * 2;
         }
         return Arrays.binarySearch(array, i/2, Math.min(i, n), key);
     }   
     //create a method for Ternary Search
     public static void ternarySearch(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = ternarySearch(array, 5);
         System.out.println("Ternary Search: "+index);  // prints 2
     }
     public static int ternarySearch(int[] array, int key) {
         int l = 0;
         int r = array.length - 1;
         while(r >= l) {
             int mid1 = l + (r - l) / 3;
             int mid2 = r - (r - l) / 3;
             if(array[mid1] == key) {
                 return mid1;
             }
             if(array[mid2] == key) {
                 return mid2;
             }
             if(key < array[mid1]) {
                 r = mid1 - 1;
             } else if(key > array[mid2]) {
                 l = mid2 + 1;
             } else {
                 l = mid1 + 1;
                 r = mid2 - 1;
             }
         }
         return -1;
     }
     //create a method for Jump Search
     public static void jumpSearch1interPo(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = jumpSearch(array, 5);
         System.out.println("Jump Search: "+index);  // prints 2
     }
     public static int jumpSearch1(int[] array, int key) {
         int n = array.length;
         int step = (int)Math.floor(Math.sqrt(n));
         int prev = 0;
         while(array[Math.min(step, n)-1] < key) {
             prev = step;
             step += (int)Math.floor(Math.sqrt(n));
             if(prev >= n) {
                 return -1;
             }
         }
         while(array[prev] < key) {
             prev++;
             if(prev == Math.min(step, n)) {
                 return -1;
             }
         }
         if(array[prev] == key) {
             return prev;
         }
         return -1;
     }
     //create a method for Interpolation Search  
     public static void interpolationSearch1(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = interpolationSearch(array, 5);
         System.out.println("Interpolation Search: "+index);  // prints 2
     }
     public static int interpolationSearch1(int[] array, int key) {
         int low = 0;
         int high = array.length - 1;
         while(low <= high && key >= array[low] && key <= array[high]) {
             int pos = low + ((key - array[low]) * (high - low)) / (array[high] - array[low]);
             if(array[pos] == key) {
                 return pos;
             }
             if(array[pos] < key) {
                 low = pos + 1;
             } else {
                 high = pos - 1;
             }
         }
         return -1;
     }
     //create a method for Exponential Search
     public static void exponentialSearch1(String[] args) {
         int[] array = {5, 2, 8, 9, 1};
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));  // prints [1, 2, 5, 8, 9]
         int index = exponentialSearch(array, 5);
         System.out.println("Exponential Search: "+index);  // prints 2
     }
 
     public static int exponentialSearch1(int[] array, int key) {
         int n = array.length;
         if(array[0] == key) {
             return 0;
         }
         int i = 1;
         while(i < n && array[i] <= key) {
             i = i * 2;
         }
         return Arrays.binarySearch(array, i/2, Math.min(i, n), key);
     }
 }
 
 
 
 
 