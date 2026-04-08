package chess.pieces;

import chess.Piece;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, color == Color.WHITE ? "♗" : "♝");
    }
}