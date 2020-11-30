public class Simulator {

    public static void main(String[] args) {

        Process p1 = new Process(0,0,8);
        Process p2 = new Process(1,1,4);
        Process p3 = new Process(2,2,9);
        Process p4 = new Process(3,3,5);

        Scheduler scheduler = new Scheduler(3,4);

        scheduler.insertToScheduler(p1);
        scheduler.insertToScheduler(p2);
        scheduler.insertToScheduler(p3);
        scheduler.insertToScheduler(p4);

        scheduler.execute();
        scheduler.calculateTime();

    }
}
