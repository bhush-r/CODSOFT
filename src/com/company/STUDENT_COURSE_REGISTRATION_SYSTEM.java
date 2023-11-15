//package com.company;
//
//
//import java.util.ArrayList;
//        import java.util.Scanner;
//
//class Course {
//    private String courseCode;
//    private String title;
//    private String description;
//    private int capacity;
//    private String schedule;
//
//    public Course(String courseCode, String title, String description, int capacity, String schedule) {
//        this.courseCode = courseCode;
//        this.title = title;
//        this.description = description;
//        this.capacity = capacity;
//        this.schedule = schedule;
//    }
//
//    public String getCourseCode() {
//        return courseCode;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public String getSchedule() {
//        return schedule;
//    }
//}
//
//class Student1 {
//    private int studentID;
//    private String name;
//    private ArrayList<Course> registeredCourses;
//
//    public Student(int studentID, String name) {
//        this.studentID = studentID;
//        this.name = name;
//        this.registeredCourses = new ArrayList<>();
//    }
//
//    public int getStudentID() {
//        return studentID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public ArrayList<Course> getRegisteredCourses() {
//        return registeredCourses;
//    }
//
//    public void registerCourse(Course course) {
//        if (registeredCourses.size() < 3) { // Assuming a student can register for up to 3 courses
//            registeredCourses.add(course);
//            System.out.println("Course registration successful for " + course.getTitle());
//        } else {
//            System.out.println("You have reached the maximum limit of registered courses.");
//        }
//    }
//
//    public void dropCourse(Course course) {
//        if (registeredCourses.contains(course)) {
//            registeredCourses.remove(course);
//            System.out.println("Course dropped successfully for " + course.getTitle());
//        } else {
//            System.out.println("You are not registered for this course.");
//        }
//    }
//}
//
//public class STUDENT_COURSE_REGISTRATION_SYSTEM {
//    public static void main(String[] args) {
//        Course course1 = new Course("CSC101", "Introduction to Programming", "Fundamentals of programming", 50, "Mon/Wed 10:00 AM");
//        Course course2 = new Course("MAT201", "Calculus I", "Basic calculus concepts", 40, "Tue/Thu 2:00 PM");
//        Course course3 = new Course("ENG301", "Advanced Writing", "Improving writing skills", 30, "Mon/Fri 1:00 PM");
//
//        ArrayList<Course> availableCourses = new ArrayList<>();
//        availableCourses.add(course1);
//        availableCourses.add(course2);
//        availableCourses.add(course3);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to the Student Course Registration System!");
//
//        while (true) {
//            System.out.println("\n1. Display available courses");
//            System.out.println("2. Register for a course");
//            System.out.println("3. Drop a course");
//            System.out.println("4. Exit");
//
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    displayAvailableCourses(availableCourses);
//                    break;
//
//                case 2:
//                    registerForCourse(scanner, availableCourses);
//                    break;
//
//                case 3:
//                    dropCourse(scanner, availableCourses);
//                    break;
//
//                case 4:
//                    System.out.println("Exiting. Thank you!");
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Invalid option. Please try again.");
//            }
//        }
//    }
//
//    private static void displayAvailableCourses(ArrayList<Course> courses) {
//        System.out.println("\nAvailable Courses:");
//        for (Course course : courses) {
//            System.out.println("Course Code: " + course.getCourseCode());
//            System.out.println("Title: " + course.getTitle());
//            System.out.println("Description: " + course.getDescription());
//            System.out.println("Capacity: " + course.getCapacity());
//            System.out.println("Schedule: " + course.getSchedule());
//            System.out.println("------------------------------");
//        }
//    }
//
//    private static void registerForCourse(Scanner scanner, ArrayList<Course> courses) {
//        System.out.println("\nEnter your student ID: ");
//        int studentID = scanner.nextInt();
//        System.out.println("Enter your name: ");
//        scanner.nextLine(); // Consume the newline character
//        String studentName = scanner.nextLine();
//
//        Student student = new Student(studentID, studentName);
//
//        displayAvailableCourses(courses);
//
//        System.out.println("Enter the course code to register: ");
//        String courseCode = scanner.next();
//
//        Course selectedCourse = findCourseByCode(courses, courseCode);
//
//        if (selectedCourse != null) {
//            student.registerCourse(selectedCourse);
//        } else {
//            System.out.println("Invalid course code. Please try again.");
//        }
//    }
//
//    private static void dropCourse(Scanner scanner, ArrayList<Course> courses) {
//        System.out.println("\nEnter your student ID: ");
//        int studentID = scanner.nextInt();
//        System.out.println("Enter your name: ");
//        scanner.nextLine(); // Consume the newline character
//        String studentName = scanner.nextLine();
//
//        Student student = new Student(studentID, studentName);
//
//        ArrayList<Course> registeredCourses = student.getRegisteredCourses();
//
//        if (!registeredCourses.isEmpty()) {
//            System.out.println("Registered Courses:");
//            for (Course course : registeredCourses) {
//                System.out.println("Course Code: " + course.getCourseCode());
//                System.out.println("Title: " + course.getTitle());
//                System.out.println("------------------------------");
//            }
//
//            System.out.println("Enter the course code to drop: ");
//            String courseCode = scanner.next();
//
//            Course selectedCourse = findCourseByCode(registeredCourses, courseCode);
//
//            if (selectedCourse != null) {
//                student.dropCourse(selectedCourse);
//            } else {
//                System.out.println("Invalid course code. Please try again.");
//            }
//        } else {
//            System.out.println("You are not registered for any courses.");
//        }
//    }
//
//    private static Course findCourseByCode(ArrayList<Course> courses, String courseCode) {
//        for (Course course : courses) {
//            if (course.getCourseCode().equals(courseCode)) {
//                return course;
//            }
//        }
//        return null;
//    }
//}
