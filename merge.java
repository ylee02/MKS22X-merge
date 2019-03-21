public class merge {
  public static void mergesort(int[] data) {
	  mergesort(data, 0, data.length - 1);

  }
  
  public static void mergesort(intp[ data, int lo, int hi) {
	  if (lo >= hi) {
		  return;
	  }
	  int pivot = (high+low) / 2;
	  mergesort(data, lo, pivot);
	  mergesort(data, pivot + 1, hi);
	  merge(data, lo, pivot + 1, hi);
  }
}
