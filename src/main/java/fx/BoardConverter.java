package fx;

import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class BoardConverter {
    private final int TILE_SIZE = 100;

    public Pane createBoard(Marks[][] board) {
        Pane boardPane = new Pane();
        Group tiles = new Group();
        Group marks = new Group();

        boardPane.setPrefSize(board.length * TILE_SIZE, board.length * TILE_SIZE);
        boardPane.getChildren().addAll(tiles, marks);

        for (int y  = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                Tile tile = new Tile(x, y, TILE_SIZE);
                createTile(tiles, tile);

                Marks mark = board[x][y];
                if (mark != null) {
                    createMarkPane(board[x][y], marks, y, x);
                }
            }
        }

        return boardPane;
    }

    private void createMarkPane(Marks mark, Group marksGroup, int y, int x) {
        MarkPane markPane = new MarkPane(x, y, TILE_SIZE);
        markPane.create(mark);
        marksGroup.getChildren().add(markPane);
    }

    private void createTile(Group tileGroup, Tile tile) {
        tileGroup.getChildren().add(tile);
    }
}
