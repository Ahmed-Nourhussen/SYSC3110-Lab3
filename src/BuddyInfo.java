public class BuddyInfo {

    private String name;
    private String address;
    private int phone_number;

    public BuddyInfo(String name, String address, int phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public BuddyInfo(){
        this("Unknown", "Unknown", 0);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    static void main() {
        BuddyInfo buddy1 = new BuddyInfo("Homer", "Colonel By", 613);
        System.out.println("Hello, " + buddy1.getName());
    }
}
