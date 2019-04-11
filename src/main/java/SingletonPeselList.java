import java.util.ArrayList;


public class SingletonPeselList {

    private ArrayList<String> peselList;

    private static SingletonPeselList ourInstance = new SingletonPeselList();

    public static SingletonPeselList getInstance() {
        return ourInstance;
    }

    private SingletonPeselList() {
        peselList = new ArrayList<String>();
    }

    public ArrayList<String> getPeselList() {
        return peselList;
    }
}
