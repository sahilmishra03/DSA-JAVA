package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JCFPQ {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Sahil", 4));
        pq.add(new Student("Arnav", 3));
        pq.add(new Student("OM", 1));
        pq.add(new Student("Krish", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}