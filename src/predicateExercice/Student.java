package predicateExercice;

import java.util.ArrayList;
import java.util.function.Predicate;


public class Student {
    String name;
    char sex;
    String age;
    String course;
    String avrgGrade;

    Student(String name, char sex, String age, String course, String avrgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrgGrade = avrgGrade;

    }
    class StudentInfo {
        void printStudent(Student st) {
            System.out.println("Student name:" + st.name + ", sex:" + st.sex + ",aged:" + st.age
                    + ",learning on" + st.course + ",course with average grade of" + st.avrgGrade);
        }

        void testStudents(ArrayList<Student> al, Predicate<Student> t) {
            for (Student s : al) {
                if (t.test(s)) {
                    printStudent(s);
                }
            }
        }

        public void main(String[] args) {

            ArrayList<Student> list = new ArrayList<>();
            Student st1 = new Student("Eugen", 'm', "18", "4", "8.3");
            Student st2 = new Student("Alin", 'm', "25", "2", "7.1");
            Student st3 = new Student("David", 'm', "22", "1", "5.9");
            Student st4 = new Student("Alisa", 'f', "19", "5", "6.00");
            Student st5 = new Student("Anna", 'f', "45", "5", "7.5");
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);

            StudentInfo si = new StudentInfo();
            for (Student s : list) {
                System.out.println(s.name);
            }
            System.out.println();
            list.removeIf(x -> x.name.endsWith("a"));
            for (Student s : list) {
                System.out.println(s.name);

            }
            si.testStudents( list, (Student st10) ->{
            return Boolean.parseBoolean((st10.avrgGrade));
             });


        }
    }
}
