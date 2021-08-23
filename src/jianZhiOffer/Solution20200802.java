package jianZhiOffer;

public class Solution20200802 {
        public static void main(String[] args) {
            int[] array = new int[]{1,2,3,3,3,3,4,5};
            int result = GetNumberOfK(array,99);
            System.out.println(result);
        }
        public static int GetNumberOfK(int[] array, int k) {
            if(array==null || array.length<=0)
                return 0;
            int firstK = getFirstK(array,0,array.length-1,k);
            if(firstK == -1)
                return 0;
            int lastK = getLastK(array,firstK,array.length-1,k);
            return lastK-firstK+1;
        }

        private static int getFirstK(int[] arr, int start, int end, int k){
            if(start>end)
                return -1;
            int mid = (start+end)>>1;  //相当于对于start end 取了一个平均值，并且去除余数
            if(arr[mid]==k){           //如果需要确定的那个k就是 中间的值
                if( mid == 0 ||arr[mid-1]!=k )   //如果这个中间值是第一个元素或者这个中间值的前一个元素不为k
                    return mid;                  //那么可以断定此时的mid 就是第一个k的位置
                else                             //如果不符合，那么说明第一个k还要在前面，那么就是将end置为mid-1
                    end = mid-1;
            }else if(arr[mid]<k){      //如果需要确定的那个数字K  比数组中间位置上的值要大
                start = mid+1;         //将start放到mid+1 的位置上
            }else{                     //如果要确定的那个数字K  比数组中间位置上的值要小
                end = mid-1;           //那么就将end设置为mid-1
            }
            return getFirstK(arr,start,end,k);
        }

        private static int getLastK(int[] arr, int start, int end, int k){
            if(start>end)
                return -1;
            int mid = (start+end)>>1;
            if(arr[mid]==k){
                if(mid==arr.length-1 || arr[mid+1]!=k )
                    return mid;
                else
                    start = mid+1;
            }else if(arr[mid]<k){
                start = mid+1;
            }else{
                end = mid-1;
            }
            return getLastK(arr,start,end,k);
        }
    }