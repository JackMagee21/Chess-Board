package chess;

import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

public abstract class Piece extends StackPane {

    public enum Color { WHITE, BLACK }

    protected Color color;

    public Piece(Color color, String symbol) {
        this.color = color;
        Label label = new Label(symbol);
        label.setStyle("-fx-font-size: 48px;");
        getChildren().add(label);
    }

    public Color getColor() { return color; }
}