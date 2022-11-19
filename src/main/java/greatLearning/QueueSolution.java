package greatLearning;

class QueueUsingArray {
    int front_Q, rear_q;
    int capacityOfQueue;
    int[] q1;

    QueueUsingArray(int size) {
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value) {
        if (rear_q == capacityOfQueue) {
            System.out.println("queue is already full, you cannot insert elements.");
        } else {
            q1[rear_q] = value;
            rear_q++;
        }
    }

    void dequeue() {
        if (rear_q == 0) {
            System.out.println("queue is empty, there is nothing to delete.");
        } else {
            for (int i = 0; i < rear_q - 1; i++) {
                q1[i] = q1[i + 1];

            }
            rear_q--;
        }
    }

    void display() {
        if (rear_q == 0) {
            System.out.println("queue is empty, there is nothing to Display.");
        } else {
            for (int i = 0; i < rear_q; i++) {
                System.out.print(q1[i] + " ");
            }

        }
    }
}

public class QueueSolution {
    public static void main(String[] args) {

        QueueUsingArray q2 = new QueueUsingArray(5);
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(8);
        q2.display();
        System.out.println();
        q2.dequeue();
        q2.display();

    }
}
