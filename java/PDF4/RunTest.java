package PDF4;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Parent class Phone");
        Phone p = new Phone();
        p.wakeupPhone();
        p.unlockPhone();
        p.makeTheCall();
        p.endTheCall();
        p.lock();
        System.out.println(" "); //To create space between each set of printing statement

        //Phone class inherits Apple so the responses are the same as Phone
        System.out.println("Child class Apple");
        Apple a = new Apple();
        a.wakeupPhone();
        a.unlockPhone();
        a.makeTheCall();
        a.endTheCall();
        a.lock();
        a.numberOfCameras();
        a.screen();
        a.sound();
        System.out.println(" "); //To create space between each set of printing statement

        //Phone class also inherits Samsung
        System.out.println("Child class Samsung");
        Samsung s = new Samsung();
        s.wakeupPhone();
        s.unlockPhone();
        s.makeTheCall();
        s.endTheCall();
        s.lock();
        s.numberOfCameras();
        s.screen();
        s.sound();
        System.out.println(" "); //To create space between each set of printing statement

        System.out.println("Parent class Tablet");
        Tablet t = new Tablet();
        t.numberOfCameras();
        t.screen();
        t.sound();
    }
}
