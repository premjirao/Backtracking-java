public class MergeSort {
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        
        //kaam kya hai 
        int mid = si+(ei-si)/2;//we can also use this approach (si+ei)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        //left(0, 3)=4  right(4, 6)=3
        int temp[] = new int[ei-si+1];
        int i = si; //this is left part
        int j = mid+1;//this is right part
        int k = 0; //iterator for temparory array

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            }
            else{
                temp[k]=arr[j];
                j++; 
            }
            k++;
        }

        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // copy temperory array to my original array

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]){

        int arr[] = {6,3,9,5,2,8,-2,-3,45};
        mergeSort(arr, 0, arr.length-1);
       // System.out.println(arr);
       PrintArr(arr);
    }
    
}
