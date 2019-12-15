public class InsertionSort{
	public static void main(String[] args){
		int[] a = {5,2,4,6,1,3,7,8};
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.println();
		a = insertionSort_(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
	}



	public static int[] insertionSort_(int[] sortData){
		for(int j=1;j<sortData.length;j++){
			int key = sortData[j];
			int i = j-1;
			while(i>=0&&sortData[i]>key){
				sortData[i+1] = sortData[i];
				i--;
			}
			sortData[i+1]=key;
		}
		return sortData;
	}
}

