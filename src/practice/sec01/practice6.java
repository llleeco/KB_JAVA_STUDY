package practice.sec01;

public class practice6 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>max)
                max = array[i];
        }
        System.out.println("최대값: "+max);
    }
}
