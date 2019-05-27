import java.util.List;
import java.util.ArrayList;

public class Ship {
    private List<Square> shipSquares = new ArrayList<>();
    private List<Square> shipAreaSquares = new ArrayList<>();

    /// X X X X X
    /// X S S S X
    /// X X X X X

    /// S - ship sqare
    /// X - area around a ship

    public Ship(int startX, int startY, boolean isHorizontal, int length) {
        CreateShip(startX, startY, isHorizontal, length);
    }

    private void CreateShip(int startX, int startY, boolean isHorizontal, int length) {
        // TODO
        // populate *shipSquares* and *shipAreSquares*
    }

    public boolean isOverlapedBy(Ship otherShip) {
        // TODO
        // check every square from *otherShip* if that part is not in this ship
        return false;
    }

    private boolean isPartOfShip(Square square) {
        return shipSquares.contains(square);
    }

    private boolean isPartOfShipArea(Square square) {
        return shipAreaSquares.contains(square);
    }

}
