public class Admin extends Person{
    private myDOB hiringDate = new myDOB(-1,-1,-1);
    private int adminID;

    Admin(){
        this.firstName = "";
        this.lastName = "";
        this.hiringDate = null;
        this.adminID = -1;
    }
    Admin(String firstName, String lastname, myDOB hiringDate, int adminID){
        this.firstName = firstName;
        this.lastName = lastname;
        this.hiringDate = hiringDate;
        this.adminID = adminID;
    }
    public String toString(){
        return firstName+ " "  + lastName+ " "  + hiringDate.toString() + " " +  adminID;
    }
}
