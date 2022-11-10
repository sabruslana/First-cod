public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[11];
        int result = 5;
        for (int i = 0; i < array.length; i++){
            array[i] = result;
            result++;
        }
        //System.out.println("nash array " + Arrays.toString(array));
    }


}
