package problem2;

public class Bishop extends Piece{

	public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return movesTo(b); 
    }

    private boolean movesTo (Position b) {
       return Math.abs(b.getY() - position.getY()) == Math.abs(b.getX() - position.getX()); 
    }
}
