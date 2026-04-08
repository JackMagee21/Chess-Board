package chess.pieces;

import chess.Piece;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color, color == Color.WHITE ? "♖" : "♜");
    }
}