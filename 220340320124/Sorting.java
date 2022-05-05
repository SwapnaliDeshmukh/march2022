class Sorting{
	void insertionSort(int a[]){
		int n = a.length;
		for(int i=1;i<n;i++){
			int temp = a[i];
			int j = i-1;
			while(j>=0 && a[j]>temp){
				
			a[j+1] = a[j];
            j--;			
			}
			a[j+1] = temp;
		}
	}
	void display(int a[],int n){
		
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
			
		}
	}
	public static void main(String args[]){
		Sorting s = new Sorting(); 
		int arr[] = {2,4,6,8,3};
		int n = arr.length;
		s.insertionSort(arr);
		s.display(arr,n);
		
	}
	
}