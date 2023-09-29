import javax.swing.*;

public class Msnake {
    public static void main(String[] args) {
        //绘制背景
        JFrame frame = new JFrame();
        frame.setBounds(10,10,900,700) ;
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //绘制画布
        frame.add(new MPanel());
        frame.setVisible(true);
    }
}
