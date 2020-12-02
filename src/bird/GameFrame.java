package bird;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

/**
 * 游戏窗体类
 */
public class GameFrame extends JFrame {
    public GameFrame(){
        //定义窗体的大小
        setSize(432,664);
        //窗体居中显示
        setLocationRelativeTo(null);
        //设置关闭窗体的同时终止程序
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //设置标题
        setTitle("飞翔的小鸟");
        //设置图标
        try {
            setIconImage(ImageIO.read(this.getClass().getResource("../img/0.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        //创建画板对象
        GamePanel panel = new GamePanel();
        //为窗体添加画板
        frame.add(panel);
        //显示窗体
        frame.setVisible(true);
        panel.start();

    }


}
