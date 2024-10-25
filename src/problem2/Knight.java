package problem2;

class Knight extends Piece {
    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return movesTo(b); 
    }

    private boolean movesTo(Position b) {
        int x = Math.abs(b.getX() - position.getX());
        int y = Math.abs(b.getY() - position.getY());
        return (x == 2 && y == 1) || (x == 1 && y == 2); 
    }
}