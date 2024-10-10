import java.util.LinkedList;
import java.util.Queue;

class Job {
    private String jobName;
    private int processingTime; // Total time required to complete the job
    private int remainingTime;   // Remaining time for the job to complete
    private int waitingTime;     // Time spent waiting in the queue
    private int turnaroundTime;  // Total time from arrival to completion

    public Job(String jobName, int processingTime) {
        this.jobName = jobName;
        this.processingTime = processingTime;
        this.remainingTime = processingTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }

    // Getters and setters
    public String getJobName() {
        return jobName;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void reduceTime(int time) {
        this.remainingTime -= time;
    }

    public void addWaitingTime(int time) {
        this.waitingTime += time;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    @Override
    public String toString() {
        return jobName + ": Waiting Time = " + waitingTime + ", Turnaround Time = " + turnaroundTime;
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        // Create a queue for jobs
        Queue<Job> jobQueue = new LinkedList<>();

        // Add jobs to the queue with their processing times
        jobQueue.add(new Job("Job1", 10)); // 10 units of time
        jobQueue.add(new Job("Job2", 5));  // 5 units of time
        jobQueue.add(new Job("Job3", 8));  // 8 units of time
        jobQueue.add(new Job("Job4", 12)); // 12 units of time

        // Define time quantum
        int timeQuantum = 4; // Time slice for each job

        int totalTime = 0; // Total time spent processing

        // Process jobs in the queue using Round Robin scheduling
        while (!jobQueue.isEmpty()) {
            Job currentJob = jobQueue.poll();

            // Calculate the actual time the job can run
            int runTime = Math.min(currentJob.getRemainingTime(), timeQuantum);
            currentJob.reduceTime(runTime);

            // Update the total time spent
            totalTime += runTime;

            // If the job is still not completed, add it back to the queue
            if (currentJob.getRemainingTime() > 0) {
                // Add waiting time for the remaining time in the queue
                currentJob.addWaitingTime(totalTime - (runTime + currentJob.getWaitingTime()));
                jobQueue.add(currentJob);
            } else {
                // If job is completed, calculate turnaround time
                currentJob.setTurnaroundTime(totalTime);
                System.out.println(currentJob);
            }
        }
    }
}
