
import javax.swing.AbstractListModel;

public class DateiModell extends AbstractListModel<Datei> {

    private Datei file;

    {
        file = new Datei(".");
    }

    @Override
    public int getSize() {
        return file.getLowerFiles().size();
    }

    @Override
    public Datei getElementAt(int index) {
        return file.getLowerFile(index);
    }

    public void change(int idx) {
        if (!file.getLowerFile(idx).isDirectory()) {
            return;
        }
        file = file.getLowerFile(idx);
        fireContentsChanged(this, 0, file.listFiles().length);
    }
}
