public class HuluSorter {
    enum SortMode {
        ORCHESTRATION, CHOREOGRAPHY
    }
    SortMode mode;
    HuluSorter(SortMode mode) {
        this.mode = mode;
    }
    public void setMode(SortMode mode) {
        this.mode = mode;
    }

    public void quickSort(HuluBaby[]arr) {
        quickSortHelper(arr, 0, arr.length-1);
    }
    private void quickSortHelper(HuluBaby[]arr, int left, int right) {
        if (left < right) {
            int mid = partition(arr, left, right);
            quickSortHelper(arr, left, mid-1);
            quickSortHelper(arr, mid+1, right);
        }
    }
    private int partition(HuluBaby[]arr, int left, int right) {
        int i = left, j = right;
        HuluBaby pivot = arr[i];
        while (i < j) {
            while (i < j && arr[j].compareTo(pivot) >= 0) j--;
            if (i < j) arr[i] = arr[j];
            while (i < j && arr[i].compareTo(pivot) <= 0) i++;
            if (i < j) arr[j] = arr[i];
        }
        arr[i] = pivot;
        return i;
    }
}
