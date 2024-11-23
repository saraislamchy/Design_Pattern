    interface Sorting{
    public String performOp(int[] arge);
}

    class BubbleSort implements Sorting{
        public String performOp(int[] arge){
            return "This is Bubble Sort";
        }
    }

    class MergeSort implements Sorting{
        public String performOp(int[] arge){
            return "This is Merge Sort";
        }
    }
    class QuickSort implements Sorting{
        public String performOp(int[] arge){
            return "This is Quick Sort";
        }
    }

 class Context{
    private Sorting sorting;
    public Context(Sorting sorting){
        this.sorting = sorting;
     }
    public String doSorting(int[] arge){
        return sorting.performOp(arge);
    }
 }


public class SortingMainl {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 7, 9};
        
        Context c1 = new Context(new BubbleSort());
        System.out.println("BubbleSort: " + c1.doSorting(arr));
        
        Context c2 = new Context(new MergeSort());
        System.out.println("MergeSort: " + c2.doSorting(arr));
        
        Context c3 = new Context(new QuickSort());
        System.out.println("QuickSort: " + c3.doSorting(arr));

    }
}
