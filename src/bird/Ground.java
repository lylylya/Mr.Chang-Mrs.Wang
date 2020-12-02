package bird;

import java.awt.image.BufferedImage;

/**
 * 地面类
 */
public class Ground{
    int x;
    int y;
    int width;
    int height;
    BufferedImage img;
    public Ground(){
        img = Tools.getImg("../img/ground.png");
        height = img.getHeight();
        width = img.getWidth();
        x=0;
        y=644-height;
    }
    public void move(){
        x--;
        if(x<=-(width-432)){
            x=0;
        }
    }
}
