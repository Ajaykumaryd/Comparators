import java.util.*;

public class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return 0;
    }
    public static void main(String[] args) {

        Comparator<Student> comparator=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age){
                    return 1;
                }else {
                    return -1;
                }
            }
        };



        ArrayList<Student>stu=new ArrayList<>();
        stu.add(new Student(27,"ajay"));
        stu.add(new Student(23,"ayush"));
        stu.add(new Student(24,"arush"));
        // Sort the numbers using the custom comparator
//        Arrays.sort(stu,comparator);

        Collections.sort(stu,comparator);
        // Print the sorted numbers
        for (Student num : stu) {
            System.out.println(num);
        }


//        System.out.println(stu);
    }



}
