import java.util.List;
import java.util.ArrayList;

public class Ocean {
    private List<Ship> ships = new ArrayList<>();

    private final int minBoardIndex = 0;
    private final int maxBoardIndex = 9;

    public boolean putShip(Ship newShip) {

        if (isOutsideBoard(newShip)) {
            return false;
        }

        for (Ship shipInOcean : ships) {
            if (shipInOcean.isOverlapedBy(newShip)) {
                return false;
            }
        }

        ships.add(newShip);
        return true;
    }

    private bool isOutsideBoard(Ship newShip) {

        // TODO:
        // chck if any part of neShip (any of its squares) is outside of BoardIndexes
        // please use minBoardIndex and maxBoardIndex variables to check it

        return false;
    }

    public int getShipCount() {
        return ships.size();
    }
}