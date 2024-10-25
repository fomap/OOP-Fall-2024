package problem2;

public class Pawn extends Piece {

	public Pawn(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		
		 return movesTo(b); 
	}
	
	 private boolean movesTo(Position b) 
	 {
		 return (b.getX() == position.getX() && b.getY() - position.getY() == 1);
	 }
}
