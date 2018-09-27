
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel<File> {

    private ArrayList<File> files = new ArrayList<>();
    File dir = new File("D:\\");

    @Override
    public int getSize() {
        return files.size();
    }

    @Override
    public File getElementAt(int index) {
        return files.get(index);
    }

}
