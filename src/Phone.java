public class Phone {
    private int id;
    private String Name;
    private String PhoneNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }
}
