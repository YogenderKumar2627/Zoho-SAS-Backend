package day1;
class FrontendTeam extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Frontend Team completed Task " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FrontEnd team completed the task");
    }
}

class BackendTeam extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Backend Team completed Task " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BackEnd team completed the task");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        FrontendTeam frontend = new FrontendTeam();
        BackendTeam backend = new BackendTeam();
        frontend.start();
        backend.start();
    }
}
