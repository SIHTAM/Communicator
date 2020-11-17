
public class Communicator {
    /*volatile*/boolean flag = false;
    /*int a = 0;*/
    String s = "";

    public void q(String msg) {
        while (flag) {
            /*try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println(msg);
        flag = true;
        /*a = 1;*/
        /*s = "Thread 1";*/
        /*notify();*/
    }

    public void a(String msg) {
        while (!flag) {
            /*try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println(msg);
        flag = false;
        /*if(a == 1)
        {
            System.out.println("a ist 1");
        }*/
        /*a = 2;*/
        /*System.out.println("Letzte Veränderung in " + s);
        s = "";*/
        /*notify();*/
    }
    public static void main(String[] args) {
        Communicator c = new Communicator();

        new Thread(new Thread2(c)).start();
        new Thread(new Thread1(c)).start();
    }
}

