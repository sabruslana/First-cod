package PractickWeek.Chess;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!checkMove(toLine) || !checkMove(toColumn)) return false;
        if (checkDelta(line, column, toLine, toColumn)) {
            if (!checkThrough(chessBoard,line, column, toLine, toColumn)) return false;
            if (chessBoard.board[toLine][toColumn] == null) {
                return true;
            } else if (!chessBoard.board[toLine][toColumn].getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    public boolean checkDelta(int line, int column, int toLine, int toColumn) {
        int dx = Math.abs(toLine - line);
        int dy = Math.abs(toColumn - column);
        if (dx == 0 && dy == 0) {
            return false;
        } else if (dx * dy == 0) {
            return true;
        }
        return false;
    }

    private boolean checkMove(int pos) {
        return pos >= 0 && pos <= 7;
    }


    public boolean checkThrough(ChessBoard board, int line, int column, int toLine, int toColumn) {

        int dx = toLine - line; //line = 5 toLine = 3 (-2)
        int dy = toColumn - column; // column = 4 toColumn = 5 (+2)
        int a = Math.abs(dx) > 0 ? Math.abs(dx) : Math.abs(dy);
        for (int i = 1; i < a; i++) {
            if (dx > 0 && dy == 0) {
                if (board.board[line + i][column] != null)
                    return false;
            }
            if (dx < 0 && dy == 0) {
                if (board.board[line - i][column] != null)
                    return false;
            }
            if (dx == 0 && dy > 0) {
                if (board.board[line][column + i] != null)
                    return false;
            }
            if (dx == 0 && dy < 0) {
                if (board.board[line][column - i] != null)
                    return false;
            }
        }
        return true;
    }


}
