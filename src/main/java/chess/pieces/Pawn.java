package chess.pieces;

import chess.Piece;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, color == Color.WHITE ? "♙" : "♟");
    }
}