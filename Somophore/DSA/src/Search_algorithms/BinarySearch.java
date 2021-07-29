package Search_algorithms;

public class BinarySearch {
  public static int BinarySearch(int[] a, int key){
    int left = 0;
    int right = a.length - 1;
    int mid;
    
    while (left <= right) { 
      mid = (left + right)/2;
      if (a[mid] == key) 
        return mid;
      else if (a[mid] < key) 
        left = mid + 1;
      else 
        right = mid -1;          
    }    
    return -1;           
}
}

        //* Big-Oh = O(n)