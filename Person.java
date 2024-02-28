
import java.util.Calendar;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String Title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        Title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFullName()
    {

        return this.firstName + " " + this.lastName;
    }
    public String getFormalName()
    {

        return this.Title + " " + getFullName();
    }
    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - YOB;
    }
    public int getAge(int year) {
        return year - YOB;
    }
    public String toCSVDataRecord()
    {
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.Title + ", " + this.YOB;
    }

}
