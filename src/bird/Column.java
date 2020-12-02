package bird;

import java.awt.image.BufferedImage;

/**
 * 柱子类
 */
public class Column {
    int x;
    int y;
    int width;
    int height;
    BufferedImage img;
    public Column(int i){
        img = Tools.getImg("../img/column.png");
        height = img.getHeight()/2;
        width = img.getWidth()/2;
        x=300;
        y=-100;
    }
    public void move(){
        x--;
        if (x<=-width){
            x=432;
        }
    }
}
