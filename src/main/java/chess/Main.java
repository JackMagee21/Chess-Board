package chess;
import chess.board.Board;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


import chess.pieces.*;

public class Main extends Application {


    @Override
    public void start(Stage stage) {
        Board brd = new Board();

        int boardWidth  = brd.getTileSize() * brd.getNumOfTiles();
        int boardHeight = brd.getTileSize() * brd.getNumOfTiles();

        initialisePieces(brd);  // pieces go on the same board

        Scene scene = new Scene(brd, boardWidth, boardHeight);
        stage.setTitle("Chess 0.0.1");
        stage.setScene(scene);
        stage.show();
    }

    private void initialisePieces(Board board) {
        initialiseBlackPieces(board);
        initialiseWhitePieces(board);
    }

    private void initialiseBlackPieces(Board board) {
        board.setPiece(new King(Piece.Color.BLACK), 4, 0);
        board.setPiece(new Queen(Piece.Color.BLACK), 3, 0);
        board.setPiece(new Rook(Piece.Color.BLACK), 0, 0);
        board.setPiece(new Rook(Piece.Color.BLACK), 7, 0);
        board.setPiece(new Knight(Piece.Color.BLACK), 1, 0);
        board.setPiece(new Knight(Piece.Color.BLACK), 6, 0);
        board.setPiece(new Bishop(Piece.Color.BLACK), 2, 0);
        board.setPiece(new Bishop(Piece.Color.BLACK), 5, 0);
        initialisePawns(board, Piece.Color.BLACK);
    }

    private void initialiseWhitePieces(Board board) {
        board.setPiece(new King(Piece.Color.WHITE), 4, 7);
        board.setPiece(new Queen(Piece.Color.WHITE), 3, 7);
        board.setPiece(new Rook(Piece.Color.WHITE), 0, 7);
        board.setPiece(new Rook(Piece.Color.WHITE), 7, 7);
        board.setPiece(new Knight(Piece.Color.WHITE), 1, 7);
        board.setPiece(new Knight(Piece.Color.WHITE), 6, 7);
        board.setPiece(new Bishop(Piece.Color.WHITE), 2, 7);
        board.setPiece(new Bishop(Piece.Color.WHITE), 5, 7);
        initialisePawns(board, Piece.Color.WHITE);
    }

    private void initialisePawns(Board board, Piece.Color color) {
        int row = color == Piece.Color.BLACK ? 1 : 6;
        for (int col = 0; col < board.getNumOfTiles(); col++) {
            board.setPiece(new Pawn(color), col, row);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}