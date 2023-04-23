package Model;

public class PartTimeStaff extends Personal implements Comparable<PartTimeStaff> {
    private int hour;

    public PartTimeStaff() {

    }

    public PartTimeStaff(int hour) {
        this.hour = hour;
    }

    public PartTimeStaff(String id, int age, String address, String email, String phoneNumber, int hour) {
        super(id, age, address, email, phoneNumber);
        this.hour = hour;
    }

    public PartTimeStaff(String id, String name, int age, String address, String email, String phoneNumber, int hour) {
        super(id, name, age, address, email, phoneNumber);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int getMoney() {
        return getHour() * 20000;
    }

    @Override
    public String toString() {
        return  getId() + ", " + getName() + ", " + getAge() + ", " + getAddress() + ", " +
                getEmail() + ", " + getPhoneNumber() + ", " + getHour();
    }

    @Override
    public int compareTo(PartTimeStaff o) {
        return getHour() - o.getHour();
    }
}
