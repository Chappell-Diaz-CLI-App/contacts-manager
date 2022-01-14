public class Contact{
    private String fullName;
    private String phoneNumber;

    public String getFullName(){
        return fullName;
}
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getPhoneNumber(){
        return phoneNumber = phoneNumber;
    }
    Contact(){
        fullName = null;
        phoneNumber = null;
    }
    public Contact(String name, String phoneNumber){
        this.fullName = name;
        this.phoneNumber = phoneNumber;
    }
}