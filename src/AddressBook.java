import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddies.add(buddy);} //Test 
    }

    public void removeBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddies.remove(buddy); //Test2
        }
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
