
import java.util.Queue;
import java.util.LinkedList;
public class No2 {
    public static void main(String[] args) {
        Queue<Double> data = new LinkedList<>();
        double[] nilai = { 91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 
                           27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4,
                           53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768 };
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        for (int i = 0; i < nilai.length; i++) {
            double value = nilai[i];
            if(value > max){
                max = value;
            }
            if(value < min){
                min = value;
            }
            sum += value;
            }
        
        double average = sum / nilai.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(average);
    }
  
}
