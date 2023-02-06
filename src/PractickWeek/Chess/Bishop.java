package PractickWeek.Chess;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!checkMove(toLine) || !checkMove(toColumn)) return false;
        if (line == toLine || column == toColumn) return false;
        if (chessBoard.board[toLine][toColumn] != null && chessBoard.board[toLine][toColumn].getColor().equals(color)) return false;
        if (checkDelta(line, column, toLine, toColumn)) {
            if (checkThrough(chessBoard,line,column,toLine,toColumn)) return true;
        } return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    private boolean checkMove(int pos) {
        return pos >= 0 && pos <= 7;
    }
    public boolean checkDelta(int line, int column, int toLine, int toColumn) {

        if (Math.abs(toLine - line) == Math.abs(toColumn - column)) {
            if (Math.abs(toLine - line) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean checkThrough(ChessBoard board, int line, int column, int toLine, int toColumn) {

        int dx = toLine - line; //line = 5 toLine = 3 (-2)
        int dy = toColumn - column; // column = 4 toColumn = 5 (+2)

        for (int i = 1; i < Math.abs(dx); i++) {
            if (dx > 0 && dy > 0) {
                if (board.board[line + i][column + i] != null)
                    return false;
            }
            if (dx < 0 && dy < 0) {
                if (board.board[line - i][column - i] != null)
                    return false;
            }
            if (dx < 0 && dy > 0) {
                if (board.board[line - i][column + i] != null)
                    return false;
            }
            if (dx > 0 && dy < 0) {
                if (board.board[line + i][column - i] != null)
                    return false;
            }
        }
        return true;
    }
}

