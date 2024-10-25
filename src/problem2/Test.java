package problem2;

public class Test {

	public static void main(String[] args) {
		
		King king = new King(new Position(5,1));
		Queen queen = new Queen(new Position(4, 1));
		Rook rook = new Rook(new Position(1, 1));
		Knight knight = new Knight(new Position(2, 1));
        Bishop bishop = new Bishop(new Position(3, 1));
        Pawn pawn = new Pawn(new Position(7,2));
        
        System.out.println("King");
        System.out.println(king.isLegalMove(new Position(5, 2))); 
        System.out.println(king.isLegalMove(new Position(5, 3))); 
        
        
        System.out.println("Queen");
        System.out.println(queen.isLegalMove(new Position(2, 3))); 
        System.out.println(queen.isLegalMove(new Position(2, 4))); 
        
        
        System.out.println("Rook");
        System.out.println(rook.isLegalMove(new Position(1, 8))); 
        System.out.println(rook.isLegalMove(new Position(2, 8))); 
        
        
        System.out.println("Knight");
        System.out.println(knight.isLegalMove(new Position(3, 3))); 
        System.out.println(knight.isLegalMove(new Position(3, 4))); 
        
        
        System.out.println("Bishop");
        System.out.println(bishop.isLegalMove(new Position(8, 6))); 
        System.out.println(bishop.isLegalMove(new Position(8, 7))); 
        
        
        System.out.println("Pawn");
        System.out.println(pawn.isLegalMove(new Position(7, 3))); 
        System.out.println(pawn.isLegalMove(new Position(7, 4))); 
	}

}
