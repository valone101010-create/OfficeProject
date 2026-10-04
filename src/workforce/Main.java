package workforce;

public class Main {

    public static void main(String[] args) {

        Employee w1 = new Worker("w1", "ws1", 40, 5);
        Employee w2 = new Worker("w2", "ws2", 43, 15);
        Employee w3 = new Worker("w3", "ws3", 33, 8);
        Employee w4 = new Worker("w4", "ws4", 28, 10);

        Employee d1 = new Director("d1", "ds1", 36, 5);
        Employee d2 = new Director("d2", "ds2", 29, 5);

        ((Director) d1).addWorker(w1);
        ((Director) d1).addWorker(w2);
        ((Director) d1).addWorker(w3);

        ((Director) d2).addWorker(w4);
        ((Director) d1).addWorker(w2);

        System.out.println(d1);
        System.out.println(d1.calculateSalary());

    }


}


