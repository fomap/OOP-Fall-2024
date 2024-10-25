package problem2;

public class Queen extends Piece{

	public Queen(Position position) {
		super(position);
		
	}

	@Override
	public boolean isLegalMove(Position b) {
		
		 return movesTo(b); 
	}
	
	 private boolean movesTo(Position b) 
	 {
	     return (b.getX() == position.getX() || b.getY() == position.getY()) ||
	    		(Math.abs(b.getY() - position.getY()) == Math.abs(b.getX() - position.getX()));
	 }
	

}
