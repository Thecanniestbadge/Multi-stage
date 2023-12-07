/**
 * Name: Nicholas Vickery
 * Date: 11/08/2023
 * Course: CPT 236 - Java Programming
 * Project Name: Final project
 * Class Description: This class represents a student with an enrolled year and major, including methods to validate and record these attributes while extending the base person class to include student-specific details.
 * Additionally, it offers functionality to calculate and display the student's academic standing based on their GPA and enrollment history.
 */
/**
 * This class represents a student with specific academic details.
 * It stores the year the student started and their current GPA.
 * The class extends from the MyPerson class, adding academic attributes and methods to the basic personal details.
 * It provides methods to set and validate the start year and GPA, and to print the student's academic information.
 */
public class MyStudent extends MyPerson {
    private int startYear = 2018;
    private double earnedGPA = 3.0;

    // Constants for min and max values
    private static final int MIN_START_YEAR = 2010;
    private static final int MAX_START_YEAR = 2019;
    private static final double MIN_GPA = 0.0;
    private static final double MAX_GPA = 4.0;

    /**
     * Default constructor for MyStudent.
     * Initializes a new student with default values.
     */
    public MyStudent() {
        super();
    }
    /**
     * Constructs a new MyStudent with the specified full name, start year, and GPA.
     * The constructor ensures that the provided values are valid and applies them to the student's profile.
     *
     * @param fullName The full name of the student.
     * @param startYear The year the student started their studies.
     * @param earnedGPA The GPA earned by the student.
     */
    public MyStudent(String fullName, int startYear, double earnedGPA) {
        super(fullName);
        setStartYear(startYear);
        setEarnedGPA(earnedGPA);
    }

    public int getStartYear() {
        return startYear;
    }
    /**
     * Sets the start year for the student, ensuring it falls within the valid range.
     * The start year must be between the established minimum and maximum years.
     *
     * @param startYear The year the student started their studies.
     * @throws IllegalArgumentException if the start year is not within the valid range.
     */
    public void setStartYear(int startYear) {
        if (startYear < MIN_START_YEAR) {
            System.out.println("ERROR: Start Year cannot be less than " + MIN_START_YEAR + ".");
        } else if (startYear > MAX_START_YEAR) {
            System.out.println("ERROR: Start Year cannot be greater than " + MAX_START_YEAR + ".");
        } else {
            this.startYear = startYear;
        }
    }

    public double getEarnedGPA() {
        return earnedGPA;
    }
    /**
     * Sets the student's GPA while ensuring it falls within the valid range.
     * The GPA must be between 0.0 and 4.0, inclusive.
     *
     * @param earnedGPA The GPA earned by the student.
     * @throws IllegalArgumentException if the GPA is less than 0.0 or greater than 4.0.
     *
     */
    public void setEarnedGPA(double earnedGPA) {
        if (earnedGPA < MIN_GPA) {
            System.out.println("ERROR: Earned GPA cannot be less than " + MIN_GPA + ".");
        } else if (earnedGPA > MAX_GPA) {
            System.out.println("ERROR: Earned GPA cannot be greater than " + MAX_GPA + ".");
        } else {
            this.earnedGPA = earnedGPA;
        }
    }
    /**
     * Prints all the student's details including their name, T-number, start year, and GPA.
     * The information is formatted according to the project's specifications.
     */
    @Override
    public void printAll() {
        super.printAll();
        System.out.printf("   Start Year: %d, GPA: %.1f\n", startYear, earnedGPA);
    }
}