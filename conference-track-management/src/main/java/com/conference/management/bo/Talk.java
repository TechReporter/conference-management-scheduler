package main.java.com.conference.management.bo;

/**
 * Created by girmes on 22/05/17.
 */
public class Talk {

    private int durationInMinutes;
    private String title;

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public Talk(String title, int durationInMinutes)
    {
        this.durationInMinutes = durationInMinutes;
        this.title = title;
    }

}
