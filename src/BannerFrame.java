import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class BannerFrame extends JFrame {

    private JLabel label;
    private String text;

    public BannerFrame() {

        text = JOptionPane.showInputDialog(
                "Masukkan tulisan banner:");

        if (text == null || text.trim().isEmpty()) {
            text = "Banner Thread";
        }

        setTitle("Banner");
        setSize(600, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel(text);

        label.setHorizontalAlignment(
                SwingConstants.CENTER);

        label.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28));

        label.setForeground(Color.RED);

        add(label);

        setVisible(true);

        BannerThread bannerThread =
                new BannerThread(label, text);

        bannerThread.start();
    }
}