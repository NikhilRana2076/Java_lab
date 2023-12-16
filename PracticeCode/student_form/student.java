package student_form;

public class student extends college{
    String studentName;

    public student(String collegeName, String studentName)
    {
        super(collegeName);
        this.studentName = studentName;
    }

}
