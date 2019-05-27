
public class Main {
    public static void main(String[] args) {
        Ocean ocean = new Ocean();

        Ship s1 = new Ship(9, 9, false, 2);
        boolean result1 = ocean.putShip(s1); // Should be *false*
        int shipCount1 = ocean.getShipCount(); // Should be *0*

        Ship s2 = new Ship(0, 0, true, 3);
        boolean result2 = ocean.putShip(s2); // Should be *true*
        int shipCount2 = ocean.getShipCount(); // Should be *1*

        Ship s3 = new Ship(1, 1, true, 4);
        boolean result3 = ocean.putShip(s3); // Should be *false*
        int shipCount3 = ocean.getShipCount(); // Should be *1*

        Ship s4 = new Ship(1, 1, false, 5);
        boolean result4 = ocean.putShip(s4); // Should be *false*
        int shipCount4 = ocean.getShipCount(); // Should be *1*

        System.out.println(result1);
    }
}