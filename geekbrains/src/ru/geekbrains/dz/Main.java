package ru.geekbrains.dz;






public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE/2;

    public static void main(String[] args) {
         outPutTimeMain();
         outPutTimeThread();
    }

    public static void outPutTimeMain() {
      float[] arrays = createArrays();
      long a = System.currentTimeMillis();
      changesArrays(arrays);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void outPutTimeThread() {
        float[] arrays = createArrays();
        float[] floats1 = new float[HALF];
        float[]  floats2 = new float[HALF];
        long a = System.currentTimeMillis();
        System.arraycopy(arrays, 0, floats1,0, HALF);
        System.arraycopy(arrays, HALF, floats2, 0, HALF);

        new Thread(() -> changesArrays(floats2)).start();

        changesArrays(floats1);

        System.arraycopy(floats1, 0, arrays, 0, HALF);
        System.arraycopy(floats2, 0, arrays, HALF, HALF);
        System.out.println(System.currentTimeMillis() - a);
    }

    public static float[] changesArrays(float[] arrays) {
        for(int count = 0; count < arrays.length; count++) {
            arrays[count] = (float) (arrays[count] * Math.sin(0.2f + count/5)
                    * Math.cos(0.2f + count/5) * Math.cos(0.4f + count/2));
        }
        return arrays;
    }

    public static float[] createArrays() {
        float[] arr = new float[SIZE];
       for(int i = 0; i < arr.length; i++) {
           arr[i] = 1;
        }
        return arr;
    }
}




