
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel {
    
    ArrayList array = new ArrayList<>();
    
    @Override
    public int getSize() {
        return array.size();
    }
    
    @Override
    public Object getElementAt(int index) {
        return array.get(index);
    }
    
}
