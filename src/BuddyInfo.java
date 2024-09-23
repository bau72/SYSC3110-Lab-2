public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public BuddyInfo() {
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BuddyInfo tester = new BuddyInfo("Homer", "Simpson Street", 101);
        System.out.println("Hello " + tester.getName());
    }

}
