package practice.sec01;

import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int[] scores = null;
        while(run){
            System.out.println("-----------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료" );
            System.out.println("-----------------------------");
            System.out.print("선택> ");

            String strNum = scanner.nextLine();


            if(strNum.equals("1")){
                System.out.print("학생수> ");
                int num = scanner.nextInt();
                scanner.nextLine();
                scores = new int[num];

            }else if(strNum.equals("2")){
                for(int i=0;i<scores.length;i++){
                    System.out.print("scores[" + i + "] >");
                    int score = scanner.nextInt();
                    scanner.nextLine();
                    scores[i] = score;
                }
            }else if(strNum.equals("3")){
                for(int i=0;i<scores.length;i++){
                    System.out.println("scores[" + i + "] >"+scores[i]);
                }
            }else if(strNum.equals("4")){
               int max = 0;
               double sum = 0;
               for(int i=0;i<scores.length;i++){
                   sum+=scores[i];
                   if(scores[i]>max){
                       max = scores[i];
                   }
               }
                System.out.println("최고 점수: "+max);
                System.out.println("평균 점수: "+sum/scores.length);

            }else if(strNum.equals("5")){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

}
