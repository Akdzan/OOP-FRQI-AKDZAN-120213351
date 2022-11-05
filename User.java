public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String Name;
    int phoneNumber;
    public void setName(String name) {
        Name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register(){
        
        System.out.println("Name: "+ Name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Register Seuccess");
    }
        
}


