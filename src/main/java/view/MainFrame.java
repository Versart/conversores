package view;

import view.panelscoins.PanelConverterOfCoin;
import view.panelstemp.PanelTemp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private int cols;
    private int rows;

    private MenuBarConverter menuBarConverter;

    private PanelConverterOfCoin panelConverterOfCoin = new PanelConverterOfCoin();

    private PanelTemp panelTemp = new PanelTemp();

    private GenericPanel[] genericPanels = new GenericPanel[9];


    {
        for (int i = 0; i < genericPanels.length;i++) {
            genericPanels[i] = new GenericPanel();
        }
    }

    public MainFrame(int rows, int cols, String title){
        menuBarConverter = new MenuBarConverter();
        menuBarConverter.getjMenuItemCoin().addActionListener(this);
        menuBarConverter.getjMenuItemTemp().addActionListener(this);
        this.setJMenuBar(menuBarConverter);
        this.setSize(1280,720);
        this.setTitle(title);
        this.cols = cols;
        this.rows = rows;
        this.setLayout(new GridLayout(rows,cols));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuBarConverter.getjMenuItemTemp()){
            createFrameTemp();
        }
        else{
            createFrameCoins();
        }
        this.setVisible(false);
        this.setVisible(true);
    }

    public void createFrameCoins() {
        if(!panelConverterOfCoin.isActive()){
            panelConverterOfCoin.setActive(true);
            panelTemp.setActive(false);
            this.remove(panelTemp);
            for(GenericPanel genericPanel : genericPanels){
                this.remove(genericPanel);
            }
            for(int i = 0; i < this.rows * this.cols;i++){
                if(i == 4){
                    this.add(panelConverterOfCoin);
                }
                else{
                    this.add(genericPanels[i]);
                }
            }
        }

    }
    public void createFrameTemp(){
        if(!panelTemp.isActive()){
            panelTemp.setActive(true);
            panelConverterOfCoin.setActive(false);
            this.remove(panelConverterOfCoin);
            for(GenericPanel genericPanel : genericPanels){
                this.remove(genericPanel);
            }
            for(int i = 0; i < this.rows *  this.cols;i++){
                if(i == 4){
                    this.add(panelTemp);
                }
                else{
                    this.add(genericPanels[i]);
                }
            }
        }

    }

}
