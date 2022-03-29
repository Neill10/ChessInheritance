public class King extends ChessPiece{
    private boolean checked;

    public King(boolean isWhite, boolean isCaptured, boolean checked)
    {
        super(isWhite,isCaptured);
        this.checked = checked;
    }

    public void move()
    {
        if(checked)
        {
            System.out.println("You have to move your king, you are in check");
        }
        else
        {
            super.move();
        }
    }

    public void castle()
    {
        if(checked)
        {
            System.out.println("You cannot castle out of check!");
        }
    }
}
