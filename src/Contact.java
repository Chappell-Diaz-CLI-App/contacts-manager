public class Contact {
    private String fullName;
    private String phoneNumber;//double or string??

    public Contact(String name, String phoneNumber) {
        this.fullName = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String fileEntry) {
        String[] data = fileEntry.split(" | ");
        this.fullName = data[0];
        this.phoneNumber = data[data.length - 1];
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }

        public String toString() {
            return "Name: " + fullName + ", Number: " + phoneNumber;
        }
        public String toFileString () {
            return fullName + " | " + phoneNumber;
        }
    }

