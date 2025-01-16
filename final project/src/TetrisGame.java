import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TetrisGame extends JPanel {
    private static final int ROWS = 20;
    private static final int COLS = 10;
    private static final int CELL_SIZE = 30;
    private static final char EMPTY_CELL = '.';
    private static final char BLOCK_CELL = '#';

    private char[][] grid = new char[ROWS][COLS];
    private int score = 0;
    private boolean isGameOver = false;
    private int currentRow = 0;
    private int currentCol = COLS / 2;

    public TetrisGame() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = EMPTY_CELL;
            }
        }
        setPreferredSize(new Dimension(COLS * CELL_SIZE, ROWS * CELL_SIZE));
        setBackground(Color.BLACK);

        Timer timer = new Timer(500, e -> {
            if (!isGameOver) {
                moveBlockDown();
                repaint();
            }
        });
timer.start();
addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
    if (!isGameOver) {
    switch (e.getKeyCode()) {
        case KeyEvent.VK_LEFT:
            moveBlock(-1);
            break;
        case KeyEvent.VK_RIGHT:
            moveBlock(1);
            break;
        case KeyEvent.VK_DOWN:
            moveBlockDown();
            break;
    }
repaint();   
}
}
});
setFocusable(true);
}
}