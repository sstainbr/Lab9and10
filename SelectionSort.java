public class SelectionSort {
	private int temp;
	/** Creates a new instance of SelectionSort */
	public SelectionSort() {
		}
	/* A simple SelectionSort algorithm     
	 * * pre-condition:      
	 * * post-condition:     
	 * * inputs:     
	 * * outputs:     
	 * * special conditions:    
	 * */   
	public int[] basicSelectionSort(int[] x) {
		int	minValLocation = 0,
			i = 0;
		for(int k = 0; k < x.length - 1; ++k){
			minValLocation = k;
			for (i = k; i < x.length; ++i) {
					if (x[i] < x[minValLocation]) {
						minValLocation = i;
					}
			} // end of outer for loop
			temp = x[k];
			x[k] = x[minValLocation];
			x[minValLocation] = temp;
		}
		return x;
		} // end of basicSelectionSort method}
	}