public class merge {
  public static void mergesort(int[] data) {
	  mergesort(data, 0, data.length - 1);

  }
  
  public static void mergesort(int[] data, int lo, int hi) {
	  if (lo >= hi) {
		  return;
	  }
	  int pivot = (high+low) / 2;
	  mergesort(data, lo, pivot);
	  mergesort(data, pivot + 1, hi);
	  merge(data, lo,  hi, pivot + 1);
  }
  
  public static void merge(int[] data, int lo, int hi, int pivot) {
	int start = lo;
	int end = pivot;
	int[] temp = new int[hi - lo + 1];
	for (int i = 0; i < hi - lo; i++) {
		if (start != pivot) {
			if (end + 1 == hi || data[start] < data[end]) {
				temp[i] = data[start];
				start += 1;
			}
		}
		else {
			temp[i] = data[end];
			end += 1;
		}
	}
	for (int i = 0; i <= hi - lo; i++) {
		data[i + lo] = temp[i];
	}
	
  }
}
