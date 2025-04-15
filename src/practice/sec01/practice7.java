package practice.sec01;

public class practice7 {
    public static void main(String[] args) {
        int[][] array={
                {95, 86},
                {83,92,96},
                {78,83,93,87,88}
        };
        double sum=0;
        double avg=0;
        int count = array[0].length+ array[1].length+array[2].length;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sum+= array[i][j];
            }
        }

        System.out.println("합: "+(int)sum);
        System.out.println("평균: "+sum/count);
    }
}
