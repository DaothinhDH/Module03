package ra.model;

public class Subject {
    private int SubjectId;
    private String SubjectName;

    public Subject(){}
    public Subject(int subjectId, String subjectName) {
        SubjectId = subjectId;
        SubjectName = subjectName;
    }

    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "SubjectId=" + SubjectId +
                ", SubjectName='" + SubjectName + '\'' +
                '}';
    }
}
