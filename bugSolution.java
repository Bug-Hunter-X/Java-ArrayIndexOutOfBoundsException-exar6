public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        if(0 <= 4 && 4 < array.length){
            array[4] = 10; 
        }
        System.out.println(array[4]);
    }
}