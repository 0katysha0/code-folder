

// Tetris Game 
// Group members: Kate Lozova and Zlata Kapustyan 
// Game description: The game consists of a grid where blocks fall from the top, and the player can move them horizontally or downwards to complete rows (use arrows to control). 
//Completed rows are cleared, and the player earns points. The game ends when the grid is filled up to the top and givimh you message "game over".

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
        // Initialize the grid
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == BLOCK_CELL) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }
                g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.DARK_GRAY);
                g.drawRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 10, 20);
    }

    public void moveBlockDown() {
        if (currentRow < ROWS - 1 && grid[currentRow + 1][currentCol] == EMPTY_CELL) {
            grid[currentRow][currentCol] = EMPTY_CELL;
            currentRow++;
            grid[currentRow][currentCol] = BLOCK_CELL;
        } else {
            checkForFullRows();
            if (currentRow == 0) {
                isGameOver = true;
                repaint();
                JOptionPane.showMessageDialog(this, "Game Over! Final Score: " + score);
            } else {
                spawnNewBlock();
            }
        }
    }

    public void moveBlock(int direction) {
        int newCol = currentCol + direction;
        if (newCol >= 0 && newCol < COLS && grid[currentRow][newCol] == EMPTY_CELL) {
            grid[currentRow][currentCol] = EMPTY_CELL;
            currentCol = newCol;
            grid[currentRow][currentCol] = BLOCK_CELL;
        }
    }

    private void spawnNewBlock() {
        currentRow = 0;
        currentCol = COLS / 2;
        if (grid[currentRow][currentCol] != EMPTY_CELL) {
            isGameOver = true;
            repaint();
            JOptionPane.showMessageDialog(this, "Game Over! Final Score: " + score);
        } else {
            grid[currentRow][currentCol] = BLOCK_CELL;
        }
    }

    private void checkForFullRows() {
        for (int i = 0; i < ROWS; i++) {
            boolean isFull = true;
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == EMPTY_CELL) {
                    isFull = false;
                    break;
                }
            }
            if (isFull) {
                clearRow(i);
                score += 10;
            }
        }
    }

    private void clearRow(int row) {
        for (int i = row; i > 0; i--) {
            System.arraycopy(grid[i - 1], 0, grid[i], 0, COLS);
        }
        for (int j = 0; j < COLS; j++) {
            grid[0][j] = EMPTY_CELL;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris Game");
        TetrisGame game = new TetrisGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
