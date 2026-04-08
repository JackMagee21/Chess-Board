package chess.pieces;

import chess.Piece;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color, color == Color.WHITE ? "♘" : "♞");
    }
}