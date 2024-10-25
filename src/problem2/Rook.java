package problem2;

class Rook extends Piece {
   
	public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b)
    {
        return movesTo (b);
    }

    private boolean movesTo(Position b) 
    {
        return  b.getX() == position.getX() || b.getY() == position.getY(); 
    }
}
