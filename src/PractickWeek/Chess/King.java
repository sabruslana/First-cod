package PractickWeek.Chess;

public class King extends ChessPiece {
    public King(String color) {
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
            if (checkDelta(line, column, toLine, toColumn)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    private boolean checkDelta(int line, int column, int toLine, int toColumn) {
        int dx = Math.abs(toLine - line);
        int dy = Math.abs(toColumn - column);
        if (dx == 0 && dy == 0) {
            return false;
        } else if (dx <= 1 && dy <= 1) {
            return true;
        }
        return false;
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        String colorOpposite = color.equals("White") ? "Black" : "White";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null && checkMove(i) && checkMove(j)) {
                    if (board.board[i][j].getColor().equals(colorOpposite)) {
                        System.out.print(board.board[i][j].getSymbol() + colorOpposite);
                        switch (board.board[i][j].getSymbol()) {
                            case "H":
                                board.board[i][j] = new Horse(colorOpposite);
                                if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {

                                    return false;
                                }
                                break;
                            case "P":
                                board.board[i][j] = new Pawn(colorOpposite);
                                if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {

                                    return false;
                                }
                                break;
                            case "Q":
                                board.board[i][j] = new Queen(colorOpposite);
                                if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {

                                    return false;
                                }
                                break;
                            case "R":
                                board.board[i][j] = new Rook(colorOpposite);
                                if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                                    System.out.print("i = " + i +  "j = " + j + "line = " + line + "column = " + column);

                                    return false;
                                }
                                break;
                            case "B":
                                board.board[i][j] = new Bishop(colorOpposite);
                                if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {

                                    return false;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean checkMove(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
