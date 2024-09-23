import java.util.*;

public class AddressBook {

    private List<BuddyInfo> buddyInfoList;

    public AddressBook() {
        this.buddyInfoList = new ArrayList<BuddyInfo>(); 
        //testing edits in github
        //testing branching in github
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    private void addBuddy(BuddyInfo buddy) {
        buddyInfoList.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy) {
        buddyInfoList.remove(buddy);
    }
}
