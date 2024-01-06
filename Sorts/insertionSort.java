从大往小与前面的元素比较，若比此元素大，比再前一个元素小，则插入此元素前面
average     O(n^2)
best case  O(n)
worst case  O(n^2)

eg.  1 3 2 4 5
  r1: 取3；3>1，不交换；
  r2: 取2；2<3，2在3前面；2>1，2在1后面 ——> 插入于1后面
     1 2 3 4 5
  r3: 取4；4>3，不交换
  r4: 取5；5>4，不交换


public static void insertionSort(int[] arr)
{
  for (int i=0; i < arr.length-1; i++)
    {
      int insertIndex = i;
      int insertValue = arr[i];

      while (insertIndex >0 && insertValue < arr[insertIndex-1])
        {
          arr[insertIndex] = arr[insertIndex -1];
          insertIndex --;
        }
      arr[insertIndex] = insertValue;
    }
}
