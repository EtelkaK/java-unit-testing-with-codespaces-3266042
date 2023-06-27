package junit;

public class Calculator {

    public int sum(int x, int y) {
        return x+y;
    }

    public int subtract(int x, int y) {
        return x-y;
    }

    public int multiply(int x, int y) {
        return x*y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Ints cannot be divided by zero");
        }
        double result = x/y;
        return (int) result;
    }

    public int[] incrementArray(int[] values) {
        int[] newValues = new int[values.length];
        for (int i=0; i<values.length; i++) {
            newValues[i] = values[i] + 1;
        }
        return newValues;
    }

}