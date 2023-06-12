import java.util.*;

class Program {
  static class MinHeap {
    List<Integer> heap = new ArrayList<Integer>();

    public MinHeap(List<Integer> array) {
      heap = buildHeap(array);
    }

    public List<Integer> buildHeap(List<Integer> array) {
      int last = array.size() - 1;
      int firstParent = (last - 1) / 2;
      for (int i = firstParent; i >= 0; i--) {
        siftDown(i, array.size() - 1, array);
      }
      return array;
    }

    public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
      int childOne = currentIdx * 2 + 1;
      while (childOne <= endIdx) {
        int childTwo = currentIdx * 2 + 2 <= endIdx ? currentIdx * 2 + 2 : -1;
        int idxToSwap;
        if (childTwo != -1 && heap.get(childTwo) < heap.get(childOne)) {
          idxToSwap = childTwo;
        } else {
          idxToSwap = childOne;
        }
        if (heap.get(idxToSwap) < heap.get(currentIdx)) {
          swap(heap, currentIdx, idxToSwap);
          currentIdx = idxToSwap;
          childOne = currentIdx * 2 + 1;
        } else {
          return;
        }
      }
    }

    public void siftUp(int currentIdx, List<Integer> heap) {
      int parentIdx = (currentIdx - 1) / 2;
      while (currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)) {
        swap(heap, currentIdx, parentIdx);
        currentIdx = parentIdx;
        parentIdx = (currentIdx - 1) / 2;
      }
    }

    public int peek() {
      return heap.get(0);
    }

    public int remove() {
      swap(heap, 0, heap.size() - 1);
      int removed = heap.get(heap.size() - 1);
      heap.remove(heap.size() - 1);
      siftDown(0, heap.size() - 1, heap);
      return removed;
    }

    public void insert(int value) {
      heap.add(value);
      siftUp(heap.size() - 1, heap);
    }

    public void swap(List<Integer> heap, int i, int j) {
      int tmp = heap.get(i);
      heap.set(i, heap.get(j));
      heap.set(j, tmp);
    }
  }
}
