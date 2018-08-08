package likhith.example.likhith.multithreadsorting;



class Sorter extends Thread

{
    private int[] internal;

    Sorter(int[] arr)     //constructor acting as set method
    {
        internal = arr;
    }

    public int[] getInternal()  // nothing but get method
    {
        return internal;
    }


    public int[] leftHalf(int[] array){
    int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public int[] rightHalf(int[] array){
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public void merge(int[] result, int[] left, int[] right) {
        int i1 = 0,i2=0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            }
            else {
                result[i] = right[i2];
                i2++;
            }}}


    public void MultiThreadSort(int[] array)   //A recursive function
    {
        if (array.length > 1)
        {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            MultiThreadSort(left);    //recursion (0 to n/2)
            MultiThreadSort(right);   //recursion (n/2+1 to n)

            merge(array, left, right);
        }
    }

    public void run()
    {
        MultiThreadSort(internal); //function(mergersort)
    }
}
