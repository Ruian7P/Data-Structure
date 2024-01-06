每两个相邻比较，若大则交换
第n趟一定保证最后n位是倒数第n大的元素
average     O(n^2)
best case  O(n)
worst case  O(n^2)

eg.  1 3 4 2 5
  r1: 1比3，不交换；3比4，不交换；4比2，交换；4比5，不交换
     1 3 2 4 5
  r2: 1比3，不交换；3比2，交换；3比4，不交换；4比5，不交换
     1 2 3 4 5

public static void bubbleSort(int[] arr)
{
  for (int i=0; i < arr.length-1; i++)
    {
      boolean flag = true;
      for (int j = 0; j < arr.length-1-i; j++)
        {
          if (arr[j] > arr[j+1])                 // swap
          {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            flag = false;
          }
        }
      if (flag == true)
        break;
    }
}
