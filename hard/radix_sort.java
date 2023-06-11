import java.util.*;

class Program {
    public ArrayList<Integer> radixSort(ArrayList<Integer> array) {
        int maxBit = getMaxBit(array);

        for (int bit = 0; bit < maxBit; bit++) {
            ArrayList<Integer> zeros = new ArrayList<>();
            ArrayList<Integer> ones = new ArrayList<>();

            for (Integer num : array) {
                int maskedBit = (num >> bit) & 1;
                if (maskedBit == 0) {
                    zeros.add(num);
                } else {
                    ones.add(num);
                }
            }

            array.clear();
            array.addAll(zeros);
            array.addAll(ones);
        }

        return array;
    }

    private int getMaxBit(List<Integer> array) {
        int maxNum = Integer.MIN_VALUE;
        for (Integer num : array) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return (int) (Math.log(maxNum) / Math.log(2)) + 1;
    }
}
