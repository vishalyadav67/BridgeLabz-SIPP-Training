class Process {
    int pid, burstTime, remainingTime, priority;
    int waitingTime = 0, turnAroundTime = 0;
    Process next;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

public class RoundRobinScheduler {
    Process head = null;

    void addProcess(int pid, int burstTime, int priority) {
        Process p = new Process(pid, burstTime, priority);
        if (head == null) {
            head = p;
            p.next = p;
        } else {
            Process temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    void removeProcess(Process toRemove) {
        if (head == null) return;

        if (head == toRemove && head.next == head) {
            head = null;
            return;
        }

        Process temp = head;
        while (temp.next != toRemove && temp.next != head) temp = temp.next;
        temp.next = toRemove.next;
        if (toRemove == head) head = head.next;
    }

    void simulateRoundRobin(int quantum) {
        if (head == null) return;

        int time = 0;
        Process current = head;

        System.out.println("Simulating Round Robin Scheduling:");
        while (head != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(quantum, current.remainingTime);
                time += execTime;
                current.remainingTime -= execTime;

                if (current.remainingTime == 0) {
                    current.turnAroundTime = time;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    Process toRemove = current;
                    current = current.next;
                    removeProcess(toRemove);
                } else {
                    current = current.next;
                }

                displayQueue();
            }
        }

        calculateAverageTimes(time);
    }

    void calculateAverageTimes(int totalTime) {
        int totalWT = 0, totalTAT = 0, count = 0;
        Process temp = completedHead;

        while (temp != null) {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnAroundTime;
            count++;
            temp = temp.next;
        }

        System.out.println("\nAll processes completed.");
        System.out.println("Average Waiting Time: " + (float) totalWT / count);
        System.out.println("Average Turnaround Time: " + (float) totalTAT / count);
    }

    void displayQueue() {
        if (head == null) {
            System.out.println("No active processes.");
            return;
        }

        System.out.print("Queue: ");
        Process temp = head;
        do {
            System.out.print("[PID: " + temp.pid + ", Remaining: " + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // For storing completed process stats
    Process completedHead = null;
    void addToCompleted(Process p) {
        Process copy = new Process(p.pid, p.burstTime, p.priority);
        copy.waitingTime = p.waitingTime;
        copy.turnAroundTime = p.turnAroundTime;

        if (completedHead == null) completedHead = copy;
        else {
            Process temp = completedHead;
            while (temp.next != null) temp = temp.next;
            temp.next = copy;
        }
    }

    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        System.out.println("Initial Process Queue:");
        rr.displayQueue();

        int quantum = 4;
        rr.simulateRoundRobin(quantum);
    }
}
