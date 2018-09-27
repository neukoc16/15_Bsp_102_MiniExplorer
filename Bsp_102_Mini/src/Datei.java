import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;


public class Datei extends File{  

    public Datei(String absolutePath) {
        super(absolutePath);
    }

    @Override
    public String toString() {
        if( isDirectory() ){
            return this.getName();
        }
        else{
            LocalDateTime ldt = 
                    LocalDateTime.ofEpochSecond(
                            this.lastModified()/1000, 0, ZoneOffset.UTC);
           
            return this.getName() + " "  + this.length() + " KB";
        }
    }
    
    

}