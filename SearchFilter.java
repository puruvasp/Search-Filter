package collection;

import java.util.*;
public class SearchFilter {

    static enum E_FILTER_PARAMS{
        NAME,
        BATCH,
        COURSE,
        COLLEGE
    }
    static class Student{

        String name;
        String batch;
        String course;
        String college;

        Student(String name,String batch, String course, String college){
            this.name = name;
            this.batch = batch;
            this.course = course;
            this.college = college;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", batch='" + batch + '\'' +
                    ", course='" + course + '\'' +
                    ", college='" + college + '\'' +
                    '}';
        }
    }
    public static void main(String[] args){
        Collection<Student> name = new ArrayList<>();
        Collection<Student> batch = new ArrayList<>();
        Collection<Student> course = new ArrayList<>();
        Collection<Student> college = new ArrayList<>();

        Student s1 = new Student("Rahul", "A1", "Java", "IIT Delhi");
        Student s2 = new Student("Ravi", "A1", "Python", "IIT Delhi");
        Student s3 = new Student("Rajesh", "B1", "C++", "NIT Trichy");
        Student s4 = new Student("Ramesh", "A1", "Java", "MIT USA");
        Student s5 = new Student("Rakesh", "B1", "Data Science", "Tokyo University");
        Student s6 = new Student("Soniya", "C1", "Machine Learning", "IIT Bombay");
        Student s7 = new Student("Sunita", "B1", "AI", "Harvard University");
        Student s8 = new Student("Suresh", "C1", "Spring Boot", "IIT Kanpur");
        Student s9 = new Student("Sachin", "B1", "Cloud Computing", "Cape Town University");
        Student s10 = new Student("Pranay", "B1", "Full Stack", "IIT Madras");
        Student s11 = new Student("Preeti", "A1", "Cyber Security", "Seoul National University");
        Student s12 = new Student("Aman", "A2", "DevOps", "IIT Roorkee");
        Student s13 = new Student("Neha", "C2", "Web Development", "Stanford University");
        Student s14 = new Student("Mohit", "B2", "Android Development", "IIT Kharagpur");
        Student s15 = new Student("Komal", "C2", "UI/UX Design", "University of Melbourne");
        Student s16 = new Student("Aditya", "A2", "Blockchain", "Oxford University");
        Student s17 = new Student("Anjali", "C1", "Data Analytics", "IIT Guwahati");
        Student s18 = new Student("Nikhil", "B2", "Game Development", "Carnegie Mellon University");
        Student s19 = new Student("Megha", "A1", "Cloud Security", "ETH Zurich");
        Student s20 = new Student("Pooja", "C2", "Embedded Systems", "Technical University of Munich");

        Collection<Student> globalCollection = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20));

        E_FILTER_PARAMS NAME = E_FILTER_PARAMS.NAME;
        E_FILTER_PARAMS BATCH = E_FILTER_PARAMS.BATCH;
        E_FILTER_PARAMS COURSE = E_FILTER_PARAMS.COURSE;
        E_FILTER_PARAMS COLLEGE = E_FILTER_PARAMS.COLLEGE;

        E_FILTER_PARAMS[] parms = {NAME, BATCH, COURSE, COLLEGE};
        filter(parms,"","A1","","", globalCollection);
    }

    private static void filter(E_FILTER_PARAMS[] parms, String name, String batch, String course, String college, Collection<Student> globalCollection)
    {
        Collection<Student> collection = new LinkedList<>();
        Iterator<Student> iter = null;

        if(parms[0] == E_FILTER_PARAMS.NAME){
            iter = globalCollection.iterator();
            int count = 0;
            while(iter.hasNext()){
                Student student = iter.next();
                if(student.name == name){
                    if(!collection.contains(student))
                    {
                        collection.add(student);
                    }
                }
            }
        }
        if(parms[1] == E_FILTER_PARAMS.BATCH){
            iter = globalCollection.iterator();
            int count = 0;
            while(iter.hasNext()){
                Student student = iter.next();
                if(student.batch == batch){
                    if(!collection.contains(student))
                    {
                        collection.add(student);
                    }
                }
            }
        }
        if(parms[1] == E_FILTER_PARAMS.COURSE){
            iter = globalCollection.iterator();
            int count = 0;
            while(iter.hasNext()){
                Student student = iter.next();
                if(student.course == course){
                    if(!collection.contains(student))
                    {
                        collection.add(student);
                    }
                }
            }
        }
        if(parms[1] == E_FILTER_PARAMS.COLLEGE){
            iter = globalCollection.iterator();
            int count = 0;
            while(iter.hasNext()){
                Student student = iter.next();
                if(student.college == college){
                    if(!collection.contains(student))
                    {
                        collection.add(student);
                    }
                }
            }
        }
        System.out.println(collection);
    }
}
