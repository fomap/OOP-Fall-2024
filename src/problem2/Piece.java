package problem2;

public abstract class Piece {

	 protected Position position;

	 public Piece(Position position) 
	 {
	    this.position = position;
	 }

	 public Position getPosition() 
	 {
	        return position;
	 }

	 public abstract boolean isLegalMove(Position b);
}
