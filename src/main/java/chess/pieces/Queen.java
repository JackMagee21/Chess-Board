package chess.pieces;

import chess.Piece;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color, color == Color.WHITE ? "♕" : "♛");
    }
}