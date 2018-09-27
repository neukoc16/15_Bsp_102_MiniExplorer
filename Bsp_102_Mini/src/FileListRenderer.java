
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class FileListRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean hasFocus) {

        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);
        if (o instanceof Datei) {
            Datei file = (Datei) o;
            if (file.isDirectory()) {
                label.setForeground(Color.red);
                label.setBackground(new Color(200, 200, 200));
                label.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 12));
            } else {
                label.setForeground(Color.blue);
                label.setBackground(new Color(230, 230, 230));
                label.setFont(new Font("Courier New", Font.PLAIN, 12));
            }
        } else {
            label.setForeground(Color.red);
            label.setBackground(new Color(200, 200, 200));
            label.setFont(new Font("Courier New", Font.BOLD + Font.ITALIC, 12));
        }

        return label;
    }
}
