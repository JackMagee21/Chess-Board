package chess.pieces;

import chess.Piece;

public class King extends Piece {
    public King(Color color) {
        super(color, color == Color.WHITE ? "♔" : "♚");
    }
}