// Ise Dekh Lena Fir se Banana!

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9,10,12};
        int searchNum = 4;
        System.out.println(binarySearch(arr, 0, arr.length, searchNum));
    }

    public static int binarySearch(int[] arr, int i , int j , int searchNum)
    {
        if(i!=j)
        {
            if(searchNum>arr[(i+j)/2])
                return binarySearch(arr, ((i+j)/2)+1, j, searchNum);
            else if( searchNum<arr[(i+j)/2])
                return binarySearch(arr, i, ((i+j)/2)-1, searchNum);
        }
        if(arr[i]!=searchNum || arr[j]!=searchNum) return -1;
            else return searchNum;       
    }
}
