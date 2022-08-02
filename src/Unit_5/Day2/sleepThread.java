package Unit_5.Day2;

class demo extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<=30){
            try {
                if(i==5){
                    Thread.sleep(5*60*10*2);
                }
                System.out.println(i);
                i++;
            }catch (Exception e){
                System.out.println("Exception occurred");
            }

        }
    }
}

public class sleepThread {
    public static void main(String[] args) {
        demo sleepTimer = new demo();
        sleepTimer.start();
    }
}
