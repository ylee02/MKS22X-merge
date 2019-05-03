import java.util.*;
public class Merge {
  public static void mergesort(int[] data) {
	  mergesort(data, 0, data.length - 1);

  }
  
  public static void mergesort(int[] data, int lo, int hi) {
	  if (lo >= hi) {
		  return;
	  }
	  //System.out.println(lo + " " + hi);
	  mergesort(data, lo, (hi + lo) / 2);
	  mergesort(data, (hi + lo) / 2 + 1, hi);
	  merge(data, lo, hi, (hi + lo) / 2 + 1);	  
	 
  }
  
  public static void merge(int[] data, int lo, int hi, int pivot) {
	 
	  int start = lo;
	  int end = pivot;
	  int[] ans = new int[hi - lo + 1];
	   
	  for (int i = 0; i <= hi - lo; i++) {
		if (start != pivot && (end - 1 == hi || data[start] < data[end])) {
			ans[i] = data[start];
			start += 1;
		}
		else {
			ans[i] = data[end];
			end += 1;
		}
	}
	//System.out.println(Arrays.toString(ans));
	for (int i = 0; i <= hi - lo; i++) {
		data[i + lo] = ans[i];
	}
	
  }
  /*public static void main(String[] args) {
	  Random rand = new Random();
	  int[] test = new int[200000];
	  for (int i = 0; i < 200000; i++) {
		 test[i] = rand.nextInt() % 1000;
	  }
	  //System.out.println(Arrays.toString(test));
	  mergesort(test);
	  System.out.println(Arrays.toString(test));
  }*/
  

	  /*int[] ans = new int[l.length + r.length];
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
  }*/
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
