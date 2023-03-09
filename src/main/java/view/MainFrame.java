package view;

import javax.swing.*;
import java.awt.*;

public class MainFrameOfCoins extends JFrame {
    private int cols;
    private int rows;

    private MenuBarConverter menuBarConverter;
    public MainFrameOfCoins(int rows, int cols, String title){
        menuBarConverter = new MenuBarConverter();
        this.setJMenuBar(menuBarConverter);
        this.setSize(1280,720);
        this.setTitle(title);
        this.cols = cols;
        this.rows = rows;
        this.setLayout(new GridLayout(rows,cols));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void addInPosition(int row, int col, JPanel panel) {
        if(col <= this.cols && row <= this.rows){
            for(int i = 0; i < this.rows;i++){
                for(int j = 0; j < this.cols;j++){
                    if(row == i + 1 && col == j + 1){
                        this.add(panel);
                    }
                    else{
                        this.add(new GenericPanel(new Color(0x4669CE)));
                    }
                }
            }
        }
    }
}
