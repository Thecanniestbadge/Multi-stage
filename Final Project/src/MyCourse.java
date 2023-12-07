import java.util.ArrayList;
import java.util.Comparator;

/*
  Name: Nicholas Vickery
  Date: 11/08/2023
  Course: CPT 236 - Java Programming
  Project Name: Final Project
  Class Description: This class represents a course with a name, section number, instructor, and a list of students.
   It includes methods to add students to the course, sort them by last name, and print the course roster along with the instructor's details.
 */

/**
 * Represents a course, including its name, section number, instructor, and enrolled students.
 * This class provides methods to manage course details, add students while maintaining a sorted order, and display course information.
 */
public class MyCourse {
    private String courseName = "CPT 101";
    private String sectionNumber = "-001";
    private MyInstructor courseInstructor;
    private final ArrayList<MyStudent> courseList = new ArrayList<>();

    private static final int COURSE_NAME_LENGTH = 7;
    private static final String COURSE_NAME_PATTERN = "[A-Z]{3} \\d{3}";
    private static final String SECTION_NUMBER_PATTERN = "-\\d{3}";

    /**
     * Default constructor for MyCourse.
     * Initializes a new course with default values.
     */
    public MyCourse() {
        this.courseInstructor = new MyInstructor();
    }

    /**
     * Constructs a new MyCourse with the specified name, section number, and instructor.
     * Initializes the course with empty student list which can be populated using the addStudent method.
     *
     * @param courseName The name of the course.
     * @param sectionNumber The section number of the course.
     * @param courseInstructor The instructor for the course.
     */
    public MyCourse(String courseName, String sectionNumber, MyInstructor courseInstructor) {
        setCourseName(courseName);
        setSectionNumber(sectionNumber);
        setCourseInstructor(courseInstructor);
    }
    /**
     * Sets the course name after validating its format.
     * The course name must be 7 characters long, start with 3 uppercase letters, followed by a space, and then 3 digits.
     *
     * @param courseName The name to be set for the course.
     */
    // Setters and getters
    public void setCourseName(String courseName) {
        if (courseName.length() != COURSE_NAME_LENGTH) {
            System.out.println("ERROR: The Course Name must be 7 characters long.");
        } else if (!courseName.substring(0, 3).matches("[A-Z]{3}")) {
            System.out.println("ERROR: The Course Name must start with 3 letters.");
        } else if (courseName.charAt(3) != ' ') {
            System.out.println("ERROR: The Course name must have a space for the 4th character.");
        } else if (!courseName.substring(4).matches("\\d{3}")) {
            System.out.println("ERROR: The Course Name must end with 3 digits.");
        } else {
            this.courseName = courseName.toUpperCase();
        }
    }

    /**
     * Sets the section number after validating its format.
     * The section number must start with a dash and be followed by 3 digits.
     *
     * @param sectionNumber The section number to be set.
     */
    public void setSectionNumber(String sectionNumber) {
        if (!sectionNumber.startsWith("-")) {
            System.out.println("ERROR: Section Number must start with a dash.");
        } else if (sectionNumber.length() != 4) {
            System.out.println("ERROR: Section numbers must be 3 characters after the dash.");
        } else if (!sectionNumber.substring(1).matches("\\d{3}")) {
            System.out.println("ERROR: Section numbers must be 3 numbers after the dash.");
        } else {
            this.sectionNumber = sectionNumber;
        }
    }


    /**
     * Sets the course instructor.
     *
     * @param courseInstructor The instructor to be assigned to the course.
     */
    public void setCourseInstructor(MyInstructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    /**
     * Retrieves the course name.
     *
     * @return The name of the course.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Retrieves the section number of the course.
     *
     * @return The section number of the course.
     */
    public String getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Retrieves the course instructor.
     *
     * @return The instructor of the course.
     */
    public MyInstructor getCourseInstructor() {
        return courseInstructor;
    }

    /**
     * Adds a student to the course while maintaining the list in ascending order by last name.
     * If the student's last name is already in the list, the student will be added after existing students with the same last name.
     *
     * @param student The MyStudent object to be added to the course.
     */
    // Method to add a student to the course list
    public void addStudent(MyStudent student) {
        courseList.add(student);
        // Sort the list by last name each time a new student is added
        courseList.sort(Comparator.comparing(MyStudent::getLastName));
    }
    /**
     * Prints the list of students enrolled in the course.
     * Each student's full name and T-number are displayed, followed by the total number of students in the course.
     */
    // Method to print the course list in the specified format
    public void printCourseList() {
        System.out.println("Course List:");
        for (MyStudent student : courseList) {
            System.out.println(student.getFullName() + "-" + student.getIDNumber());
        }
        System.out.println("There are " + courseList.size() + " students in " + courseName);
        System.out.println();
    }

    // Method to print the student with the highest GPA
    /**
     * Prints the student with the highest GPA in the course.
     * Displays the student's name and GPA. If no students are enrolled, displays an appropriate message.
     */
    public void printMaxGPA() {
        if (courseList.isEmpty()) {
            System.out.println("No students in the course to determine the highest GPA.");
            return;
        }

        MyStudent maxGPAStudent = courseList.get(0);
        for (MyStudent student : courseList) {
            if (student.getEarnedGPA() > maxGPAStudent.getEarnedGPA()) {
                maxGPAStudent = student;
            }
        }

        System.out.println("In " + courseName + sectionNumber + ", " + maxGPAStudent.getFullName() + " has the highest GPA of " + String.format("%.1f", maxGPAStudent.getEarnedGPA()) + ".");
        System.out.println();
    }

    // Method to print the student with the earliest start year
    /**
     * Prints the student with the earliest start year in the course.
     * Displays the student's name and start year. If no students are enrolled, displays an appropriate message.
     */
    public void printMinYear() {
        if (courseList.isEmpty()) {
            System.out.println("No students in the course to determine the earliest start year.");
            return;
        }

        MyStudent minYearStudent = courseList.get(0);
        for (MyStudent student : courseList) {
            if (student.getStartYear() < minYearStudent.getStartYear()) {
                minYearStudent = student;
            }
        }

        System.out.println("In " + courseName + sectionNumber + ", " + minYearStudent.getFullName() + " has the earliest start date of " + minYearStudent.getStartYear() + ".");
        System.out.println();
    }
    /**
     * Prints all the course information including the course name, section number, and the instructor's full name.
     * This method provides a comprehensive display of the course details as specified in the project's requirements.
     */
    public void printAll() {
        System.out.println(courseName + sectionNumber + ", taught by: " + (courseInstructor != null ? courseInstructor.getFullName() : "No Instructor Assigned"));
    }
}