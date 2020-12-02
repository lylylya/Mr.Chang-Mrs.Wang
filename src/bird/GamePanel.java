package bird;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 画板类
 */
public class GamePanel extends JPanel {

    BufferedImage bg;
    Ground ground;
    Column column;
    Column column1;


    public GamePanel(){
        //设置背景色
        setBackground(Color.pink);

        //设置背景图片
        bg = Tools.getImg("../img/bg.png");

        ground = new Ground();
        column = new Column(1);
        column1 = new Column(2);

    }
    //游戏开始的方法
    public void start(){
        while (true){
            ground.move();
            column.move();
            column1.move();
            try {
                Thread.sleep(20);
                //刷新
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg,0,0,null);
        g.drawImage(ground.img,ground.x,ground.y,null);
        g.drawImage(column.img,column.x,column.y,column.width,column.height,null);
        g.drawImage(column1.img,column1.x,column1.y,column1.width,column1.height,null);

    }
}
