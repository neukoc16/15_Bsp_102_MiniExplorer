
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel {

    ArrayList array = new ArrayList<>();
    File dir = new File("D:\\");

    @Override
    public int getSize() {
        return array.size();
    }

    @Override
    public Object getElementAt(int index) {
        return array.get(index);
    }

}
