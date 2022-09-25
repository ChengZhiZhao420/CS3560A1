public class Student {
    private String studentID;
    public Student(String studentID){
        setID(studentID);
    }

    private void setID(String ID) {
        studentID = ID;
    }

    public String getID() {
        return studentID;
    }
}
