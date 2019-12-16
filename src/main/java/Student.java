

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    public ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }


    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return  total / grades.size();
    }

    public void updateGrade(int oldGrade, int newGrade){
        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) == oldGrade){
                grades.set(i, newGrade);
                return;
            }
        }
    }

    public void deleteGrade(int delete) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) == delete) {
                grades.remove(i);
                return;
            }
        }
    }
}
