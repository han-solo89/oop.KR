import java.time.LocalDateTime;

public interface Repeatable {
    boolean checkOccurance(LocalDateTime localDateTime);
    void setTitle(String title);
    LocalDateTime getFirstDate();
    void setArchived (boolean archived);

}
