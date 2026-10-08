class Node {

    int processId;
    int burstTime;
    int priority;

    Node next;

    Node(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}


class RoundRobin {

    Node head = null;
    Node tail = null;


    // 1. Add process at end
    void addProcess(int processId, int burstTime, int priority) {

        Node newNode = new Node(processId, burstTime, priority);

        if (head == null) {
            head = newNode;
            tail = newNode;

            // Circular connection
            newNode.next = head;

            return;
        }

        tail.next = newNode;
        tail = newNode;

        // Make it circular
        tail.next = head;
    }


    // 2. Remove process by ID
    void removeProcess(int processId) {

        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = tail;

        do {

            if (current.processId == processId) {

                // Only one node
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                    return;
                }

                // Removing head
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                    return;
                }

                // Removing middle or tail
                previous.next = current.next;

                if (current == tail) {
                    tail = previous;
                    tail.next = head;
                }

                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);
    }


    // 3. Display circular list
    void display() {

        if (head == null) {
            System.out.println("No processes");
            return;
        }

        Node current = head;

        do {
            System.out.println(
                    "P" + current.processId +
                    " | Burst Time: " + current.burstTime +
                    " | Priority: " + current.priority
            );

            current = current.next;

        } while (current != head);

        System.out.println();
    }


    // 4. Round Robin Scheduling
    void schedule(int quantum) {

        if (head == null) {
            return;
        }

        Node current = head;

        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        int completed = 0;
        int elapsedTime = 0;

        int totalProcesses = countProcesses();

        while (head != null) {

            System.out.println("Running Process: P" + current.processId);

            if (current.burstTime > quantum) {

                current.burstTime =
                        current.burstTime - quantum;

                elapsedTime = elapsedTime + quantum;

                current = current.next;

            } else {

                int executionTime = current.burstTime;

                elapsedTime = elapsedTime + executionTime;

                int turnAroundTime = elapsedTime;

                int waitingTime =
                        turnAroundTime - getOriginalBurstTime(current.processId);

                totalTurnAroundTime =
                        totalTurnAroundTime + turnAroundTime;

                totalWaitingTime =
                        totalWaitingTime + waitingTime;

                int completedId = current.processId;

                Node nextProcess = current.next;

                removeProcess(completedId);

                completed++;

                System.out.println(
                        "Process P" + completedId + " completed"
                );

                System.out.println("Processes remaining:");

                display();

                if (head == null) {
                    break;
                }

                current = nextProcess;

                if (current == head) {
                    current = head;
                }
            }
        }

        System.out.println(
                "Average Waiting Time: " +
                (double) totalWaitingTime / totalProcesses
        );

        System.out.println(
                "Average Turnaround Time: " +
                (double) totalTurnAroundTime / totalProcesses
        );
    }


    int countProcesses() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }


    // For simplicity, original burst time is fixed here
    int getOriginalBurstTime(int processId) {

        // This should ideally be stored separately.
        return 0;
    }
}


public class CPU_Scheduling {

    public static void main(String[] args) {

        RoundRobin cpu = new RoundRobin();

        cpu.addProcess(1, 5, 1);
        cpu.addProcess(2, 3, 2);
        cpu.addProcess(3, 4, 1);

        System.out.println("Initial Processes:");
        cpu.display();

        int timeQuantum = 2;

        cpu.schedule(timeQuantum);
    }
}