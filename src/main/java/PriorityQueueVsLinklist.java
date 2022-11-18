import javax.xml.namespace.QName;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueVsLinklist {
    public static void main(String[] args) {


        //Queue<Double> queue = new PriorityQueue<>();
       // Queue<Double> queue = new LinkedList<>();
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
