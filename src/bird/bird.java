package bird;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * 小鸟类
 */
public class bird {
    int x;
    int y;
    int width;
    int height;
    BufferedImage img;
    public bird(){
        img =Tools.getImg("../img/0.png") ;
        height = img.getHeight()/2;
        width = img.getWidth()/2;
        x=300;
        y=-100;

        ArrayList<BufferedImage> list = new ArrayList<BufferedImage>();
        for(int i=0;i<8;i++){
            list.add(Tools.getImg("../img" + i + ".png"));
        }

    }
    //鸟的翅膀动起来
    public void fly(){
        x--;
    }
}
