package chess.board;

import chess.Piece;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Board extends GridPane{
    
    private static final int TILE_SIZE = 80;

    private static final int NUMBER_OF_TILES = 8;


    private static final Color LIGHT = Color.web("#F0D9B5");
    private static final Color DARK  = Color.web("#B58863");


    public Board(){
        initialiseBoard();
    }

    public int getTileSize(){
        return TILE_SIZE;
    }

    public int getNumOfTiles(){
        return NUMBER_OF_TILES;
    }
    
    public void setPiece(Piece piece, int col, int row) {
        StackPane tile = (StackPane) getChildren().get(row * NUMBER_OF_TILES + col);
        tile.getChildren().add(piece);
    }

    private void initialiseBoard() {
        for (int row = 0; row < NUMBER_OF_TILES; row++) {
            for (int col = 0; col < NUMBER_OF_TILES; col++) {
                Rectangle square = new Rectangle(TILE_SIZE, TILE_SIZE);
                square.setFill((row + col) % 2 == 0 ? LIGHT : DARK);

                StackPane tile = new StackPane(square);
                tile.setPrefSize(TILE_SIZE, TILE_SIZE);
                add(tile, col, row);
            }
        }
    }

    // in Board.java

    private StackPane getTile(int col, int row) {
        return (StackPane) getChildren().get(row * NUMBER_OF_TILES + col);
    }

    public void highlightSquare(int col, int row) {
        StackPane tile = getTile(col, row);
        Circle circle = new Circle(15, Color.rgb(0, 0, 0, 0.3));
        circle.setMouseTransparent(true);
        circle.setId("highlight");
        tile.getChildren().add(circle);
    }

    public void clearHighlights() {
        for (int row = 0; row < NUMBER_OF_TILES; row++) {
            for (int col = 0; col < NUMBER_OF_TILES; col++) {
                StackPane tile = getTile(col, row);
                tile.getChildren().removeIf(n -> "highlight".equals(n.getId()));
            }
        }
    }

}
