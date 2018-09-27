
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class Datei extends File {

    ArrayList<Datei> files = new ArrayList<>();

    public Datei(String absolutePath) {
        super(absolutePath);
    }

    @Override
    public String toString() {
        if (isDirectory()) {
            return this.getName();
        } else {
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(this.lastModified() / 1000, 0, ZoneOffset.UTC);

            return this.getName() + " " + ldt + " " + this.length() + " KB";
        }
    }

    public void loadLowerFiles() {
        File[] dateien = listFiles();
        files.add(new Datei(getAbsolutePath()));
        for (File file : dateien) {
            files.add(new Datei(file.getAbsolutePath()));
        }
        files.sort(new FileComparer());
    }

    public ArrayList<Datei> getLowerFiles() {
        if (files.isEmpty()) {
            loadLowerFiles();
        }
        return files;
    }

    public Datei getLowerFile(int index) {
        return files.get(index);
    }

    public Datei getUpperFile() {
        return new Datei(getParent());
    }
}
