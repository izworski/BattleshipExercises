public class Square {
    private int x;
    private int y;
    private boolean isHit;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        this.isHit = false;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void takeHit() {
        this.isHit = true;
    }

    public boolean isHit() {
        return this.isHit;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Square objSquare = (Square) obj;

        return this.x == objSquare.x && this.y == objSquare.y;
    }
}