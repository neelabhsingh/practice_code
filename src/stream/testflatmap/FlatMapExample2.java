package stream.testflatmap;
import java.util.*;
import java.util.stream.Collectors;

class Standard{
        String className;
        List<Student> students;
        Standard(String className, List<Student> students){
                this.className = className;
                this.students = students;
        }
}

class Student{
        String studentName;
        Student(String studentName){
                this.studentName = studentName;
        }
}
public class FlatMapExample2 {
        public static void main(String[] args) {
                Standard standard0 = new Standard("Nursery",
                        Arrays.asList(
                                new Student("Babua"),
                                new Student("Vinayak")
                        )
                );
                Standard standard1 = new Standard("LKG",
                        Arrays.asList(
                                new Student("Aadvik"),
                                new Student("Dibbu")
                        )
                );

                Standard standard2 = new Standard("UKG",
                        Arrays.asList(
                                new Student("GOlU"),
                                new Student("Kuhu")
                        )
                );
                List<Standard> allStanards = Arrays.asList(standard0, standard1);
                List<String> allNames = allStanards.stream().flatMap(
                        standard -> standard.students.stream()
                                .map(student -> student.studentName)
                ).collect(Collectors.toList());
                System.out.println(allNames);

        }
}
