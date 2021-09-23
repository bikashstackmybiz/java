 class Threading2 extends Thread {
    
    public void run() {
        for(int i = 0 ; i < 100 ;i++){
            System.out.println(i);
        }
    }

}


 class Threading3 extends Thread {
    
        public void run() {
            for(int i = 100 ; i < 200 ;i++){
                System.out.println(i);
            }
        }

}

class Threading4 extends Thread {
    
    public void run() {
        for(int i = 200 ; i < 300 ;i++){
            System.out.println(i);
        }
    }

}


public class Threading  {
    public static void main(String[] args) throws InterruptedException {
        Threading3 task1 = new Threading3();
        task1.start();
        task1.setPriority(3); // to set priroity

        Threading2 task2 = new Threading2();
        task2.start();
        task2.join(); // to execute next task after execution of task2
        task1.join(); // to execute next task after execution of task1


        Threading4 task3 = new Threading4();
        task3.start();

    }
}