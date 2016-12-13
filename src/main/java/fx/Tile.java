package fx;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    public Tile(int x, int y, int width) {
        this.setWidth(width);
        this.setHeight(width);
        relocate(x * width, y * width);
        setFill(Color.WHITE);

        setStroke(Color.BLACK);
        setStrokeWidth(5);
    }
}
