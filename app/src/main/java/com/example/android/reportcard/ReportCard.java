package com.example.android.reportcard;

class ReportCard {
    private String subjectName;
    private int subjectMarks;
    private String subjectGrade;
    private int subjectIcon;

    ReportCard(int icon, String name, int mark, String grade) {
        this.setSubjectIcon(icon);
        this.setSubjectName(name);
        this.setSubjectMarks(mark);
        this.setSubjectGrade(grade);
    }

    String getSubjectName() {
        return subjectName;
    }

    int getSubjectMarks() {
        return subjectMarks;
    }

    String getSubjectGrade() {
        return subjectGrade;
    }

    public int getSubjectIcon() {
        return subjectIcon;
    }

    private void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    private void setSubjectMarks(int subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    private void setSubjectGrade(String subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    private void setSubjectIcon(int subjectIcon) {
        this.subjectIcon = subjectIcon;
    }

    @Override
    public String toString() {
        return "You Child got " + subjectGrade + "\n Grade in " + subjectName;
    }
}