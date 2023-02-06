package PractickWeek.Chess;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (((chessBoard.board[toLine][toColumn] == null) || !chessBoard.board[toLine][toColumn].getColor().equals(color))
                && checkMove(toLine) && checkMove(toColumn)) {

            if (new Rook(color).checkDelta(line, column, toLine, toColumn)) {
                if (new Rook(color).checkThrough(chessBoard, line, column, toLine, toColumn)) return true;
            } else if (new Bishop(color).checkDelta(line, column, toLine, toColumn)) {
                if (new Bishop(color).checkThrough(chessBoard, line, column, toLine, toColumn)) return true;
            }
            return false;
        }
        return false;

    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    private boolean checkMove(int pos) {
        return pos >= 0 && pos <= 7;
    }

}
