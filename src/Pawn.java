
public class Pawn extends ChessPiece{
    private boolean firstMove;

    public Pawn(boolean isWhite, boolean isCaptured, boolean firstMove)
    {
        super(isWhite,isCaptured);
        this.firstMove = firstMove;
    }

    public void promote(String piece)
    {
        System.out.println("Your pawn has promoted into a " + piece);
    }
}
