package Model;

public abstract class Personal extends Name implements Wage {
    private String id;
    private int age;
    private String address;
    private String email;
    private String phoneNumber;

    public Personal() {
    }

    public Personal(String name, int age, String address, String email, String phoneNumber) {
        super(name);
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Personal(String id, String name, int age, String address, String email, String phoneNumber) {
        super(name);
        this.id = id;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
