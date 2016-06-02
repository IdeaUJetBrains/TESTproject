import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "PRINT_TRANSACTION")
public class PrintTransaction {
    
    @Id
    public int id;

    
    @Column(name = "DATA_FILE")
    @Lob
    public Blob dataFile;

}
