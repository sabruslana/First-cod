package PractickWeek.Chess;

public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!checkMove(toLine) || !checkMove(toColumn)) return false;
        int x = Math.abs(toLine - line);
        int y = Math.abs(toColumn - column);
        if ((x == 1 && y == 2) || (x == 2 && y == 1)) {
            if ((chessBoard.board[toLine][toColumn] == null)) {
                return true;
            } else if (!chessBoard.board[toLine][toColumn].getColor().equals(color)) {
                return true;
            }
            return false;
        }
        return false;

    }

    @Override
    public String getSymbol() {
        return "H";
    }

    private boolean checkMove(int pos) {
        return pos >= 0 && pos <= 7;
    }
}