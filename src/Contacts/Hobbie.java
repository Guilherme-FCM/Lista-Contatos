package Contacts;

public class Hobbie {
    private String name;
    private int weekly_frequency;

    public Hobbie(String name, int weekly_frequency) {
        this.name = name;
        this.weekly_frequency = weekly_frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekly_frequency() {
        return weekly_frequency;
    }

    public void setWeekly_frequency(int weekly_frequency) {
        this.weekly_frequency = weekly_frequency;
    }
}
