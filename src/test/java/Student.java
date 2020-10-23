import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.var;
import sun.awt.image.ImageWatched;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String Name;
    private Integer Age;

    public static void main(String[] args) {
        PriorityQueue<Student> a = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        Student a1 = new Student("a", 13);
        Student b = new Student("b", 15);
        Student c = new Student("c", 16);
        a.add(a1);a.add(c);a.add(b);
        a.add(new Student("d",3));
        a.add(new Student("d",33));
        while (!a.isEmpty()) {
            System.out.println(a.poll());
        }
//        System.out.println(a);
//        Student student = new Student(12,12);
//        Student student = new Student();
//        student.setAge(12);
//        Deque<Integer> a = new LinkedList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        System.out.println(a);
//        a.remove();
//        a.removeLast();
//        System.out.println(a);

    }
}
