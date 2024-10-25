package problem2;

public class King extends Piece{

	public King(Position position) {
		super(position);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		
		 return movesTo(b); 
	}
	
	 private boolean movesTo(Position b) 
	 {
		 return (Math.abs(b.getX() - position.getX()) <= 1 && 
				 Math.abs(b.getY() - position.getY()) <= 1); 
	 }

}
