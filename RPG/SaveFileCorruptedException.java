package RPG;

public class SaveFileCorruptedException extends Exception{
    public SaveFileCorruptedException(String message){
        super(message);
    }
}
