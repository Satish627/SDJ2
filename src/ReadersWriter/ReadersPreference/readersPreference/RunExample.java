package ReadersWriter.ReadersPreference.readersPreference;

import ReadersWriter.ReadersPreference.readersPreference.ReadersPreferenceToSharedFile;

import java.util.Random;

public class RunExample {
    public static void main(String[] args) {
        Random random = new Random();
        ReadersPreferenceToSharedFile rp= new ReadersPreferenceToSharedFile();

        for (int i=0; i<3;i++){
            new Thread(()->{
                while (true) {
                    rp.acquireWrite();
                    rp.increment();
                    System.out.println("Writer incremented");
                    rp.releaseWrite();
                    try {
                        Thread.sleep(200+random.nextInt(50));
                    } catch (InterruptedException e) {
                    }
                }
            }).start();
        }
        for (int i=0;i<50;i++){
            int fianlI = i;
            new Thread(()->{
                while (true) {
                    rp.acquireRead();
                    int result = rp.readInt();
                    System.out.println("reader "+ fianlI + ": " + result);
                    rp.releaseRead();
                   /* try {
                        Thread.sleep( random.nextInt(50));
                    } catch (InterruptedException e) { }*/
                }
            }).start();
        }
    }
}

