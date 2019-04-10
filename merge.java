public class merge {
  public static int[] mergesort(int[] data) {
	  return mergesort(data, data.length);

  }
  
  public static int[] mergesort(int[] data, int hi) {
	  if (hi <= 1) {
		  return data;
	  }
	  int[] left = new int[hi/2];
	  int[] right = new int[hi - hi/2];
	  for (int i = 0; i < left.length; i++) {
		  left[i] = data[i];
	  }
	  for (int i = 0; i < right.length; i++) {
		  right[i] = data[i + hi/2];
	  }
	  return merge(mergesort(left, left.length), mergesort(right, right.length));
  }
  
  public static int merge(int[] l, int[] r) {
	  int[] ans = new int[l.length + r.length];
	  int counter = 0;
	  int counter2 = 0;
	  for (int i = 0; i < ans.length; i++) {
		  if (counter >= l.length) {
			  counter2++;
			  ans[i] = r[counter2];
		  } else if (counter2 >= r.length) {
			  counter++;
			  ans[i] = l[counter];
		  } else if ( l[counter] <= r[counter2]) {
			  counter++;
			  ans[i] = l[counter];
		  } else {
			  counter2++;
			  ans[i] = r[counter2];
		  }
	  }
	  return ans;
  }
	  /*if (lo >= hi) {
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
	
  }*/
		
}
