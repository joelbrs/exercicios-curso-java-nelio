package entities;

public class StudentEntry {
    
    private Integer studentCode;

    public StudentEntry(Integer studentCode) {
        this.studentCode = studentCode;
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((studentCode == null) ? 0 : studentCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentEntry other = (StudentEntry) obj;
        if (studentCode == null) {
            if (other.studentCode != null)
                return false;
        } else if (!studentCode.equals(other.studentCode))
            return false;
        return true;
    } 
}
