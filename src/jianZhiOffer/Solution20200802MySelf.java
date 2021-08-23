package jianZhiOffer;

public class Solution20200802MySelf {
    public static void main(String[] args) {
        //int[] array = new int[]{1,2,3,3,4,4,4,5};
        int[] array = new int[]{3,3,3,3,3};
        int result = getCount(array,3);
        System.out.println(result);
    }
    public static int getCount(int[] array,int k){
        if (array==null||array.length<=0){
            return 0;
        }
        int start = 0;
        int end = array.length-1;
        int first = getFirst(array,start,end,k);
        if (first==-1){
            return 0;
        }
        int last = getLast(array,start,end,k);
        return last - first + 1;
    }

    public static int getFirst(int[] array,int start,int end,int k){
        if (start>end)
            return -1;
        int mid = (start+end)>>1;
        if (array[mid]==k){
            if (mid==0||array[mid-1]!=k){
                return mid;
            }else {
                end = mid - 1;
            }
        }else if (k>array[mid]){
            start = mid + 1;
        }else {
            end = mid - 1;
        }
       return getFirst(array,start,end,k);
    }

    public static int getLast(int[] array,int start,int end,int k){
        if (start>end){
            return -1;
        }
        int mid = (start+end)>>1;
        if (array[mid]==k){
            if (mid==array.length-1||array[mid+1]!=k){
                return mid;
            }else {
                start = mid + 1;
            }
        }else if (k>array[mid]){
            start = mid + 1;
        }else {
            end = mid - 1;
        }
        return getLast(array,start,end,k);
    }
}

