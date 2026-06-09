import javax.swing.JLabel;

public class BannerThread extends Thread {

    private JLabel label;
    private String text;

    public BannerThread(
            JLabel label,
            String text) {

        this.label = label;
        this.text = text;
    }

    @Override
    public void run() {

        while (true) {

            text =
                    text.substring(1)
                            + text.charAt(0);

            label.setText(text);

            try {

                Thread.sleep(200);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }
        }
    }
}