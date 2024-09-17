import java.util.*;

public class AddressBook {
    List<BuddyInfo> listOfBuddyInfo = new ArrayList<BuddyInfo>();

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
    }

    private void addBuddy(BuddyInfo buddy) {
        listOfBuddyInfo.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy) {
        listOfBuddyInfo.remove(buddy);
    }
}
