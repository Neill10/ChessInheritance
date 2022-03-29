public class ChessPiece {
    private boolean white;
    private boolean captured;

    public ChessPiece(boolean isWhite,boolean isCaptured)
    {
        this.white = isWhite;
        this.captured = isCaptured;
    }

    public void move()
    {
        System.out.println("You have moved your piece!");
    }
}
