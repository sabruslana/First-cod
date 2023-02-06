package PractickWeek.Chess;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        String colorOpposite = color.equals("White") ? "Black" : "White";
        if (checkMove(toLine) && checkMove(toColumn)) {
            int dx = toLine - line;
            int dy = toColumn - column;
            if ((Math.abs(dx) < 3) && (dy == 0) && chessBoard.board[toLine][toColumn] == null) {
                if (color.equals("White")) {
                    if (line == 1 && chessBoard.board[line + 1][column] == null) {
                        if (dx == 1 || dx == 2) {
                            return true;
                        }
                        return false;
                    } else if ((dx == 1)) {
                        return true;
                    }
                    return false;
                } else if (color.equals("Black")) {
                    if (line == 6 && chessBoard.board[line - 1][column] == null) {
                        if (dx == -1 || dx == -2) {
                            return true;
                        }
                        return false;
                    } else if ((dx == -1)) {
                        return true;
                    }
                    return false;
                }
                return false;

            } else if (Math.abs(dx) == 1 && Math.abs(dy) == 1 && chessBoard.board[toLine][toColumn] != null) {
                if (chessBoard.board[toLine][toColumn].getColor().equals(colorOpposite)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

    private boolean checkMove(int pos) {
        return pos >= 0 && pos <= 7;
    }

}

