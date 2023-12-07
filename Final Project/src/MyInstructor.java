/**
 * Name: Nicholas Vickery
 * Date: 11/08/2023
 * Course: CPT 236 - Java Programming
 * Project Name: Final Project
 * Class Description: This class represents an instructor with a hire year and base salary, encapsulating the functionality to validate and assign these attributes while inheriting common personal details from the person class.
 * It also provides a specialized print method to display the instructor's complete information, including their hiring details and salary, formatted according to the project's specifications.
 */
/**
 * Represents an instructor at a tri-county college.
 * Stores information about the instructor's hire year and base salary.
 * Extends from the MyPerson class, inheriting basic personal details.
 */
public class MyInstructor extends MyPerson {
    private int hiredYear = 2000;
    private double baseSalary = 20000.00;

    // Constants for min and max values
    private static final int MIN_HIRED_YEAR = 1963;
    private static final int MAX_HIRED_YEAR = 2019;
    private static final double MIN_SALARY = 0.00;
    private static final double MAX_SALARY = 100000.00;

    /**
     * Default constructor for MyInstructor.
     * Initializes an instructor with default hired year and base salary.
     */
    public MyInstructor() {
        super();
    }

    /**
     * Constructs a new MyInstructor with specified full name, hired year, and base salary.
     * Inherits basic personal details from MyPerson and sets additional instructor-specific details.
     *
     * @param fullName The full name of the instructor.
     * @param hiredYear The year the instructor was hired.
     * @param baseSalary The base salary of the instructor.
     */
    public MyInstructor(String fullName, int hiredYear, double baseSalary) {
        super(fullName);
        setHiredYear(hiredYear);
        setBaseSalary(baseSalary);
    }

    /**
     * Retrieves the hire year of the instructor.
     *
     * @return The year the instructor was hired.
     */
    public int getHiredYear() {
        return hiredYear;
    }
    /**
     * Sets the hire year of the instructor.
     * The hire year must be between the established minimum and maximum years.
     *
     * @param hiredYear The year the instructor was hired.
     * @throws IllegalArgumentException if the hired year is less than the minimum year or greater than the maximum year.
     */
    public void setHiredYear(int hiredYear) {
        if (hiredYear < MIN_HIRED_YEAR) {
            System.out.println("ERROR: Hired Year cannot be less than " + MIN_HIRED_YEAR + ".");
        } else if (hiredYear > MAX_HIRED_YEAR) {
            System.out.println("ERROR: Hired Year cannot be greater than " + MAX_HIRED_YEAR + ".");
        } else {
            this.hiredYear = hiredYear;
        }
    }

    /**
     * Sets the base salary of the instructor.
     * Validates that the salary is within the established minimum and maximum range.
     *
     * @param baseSalary The base salary to be set for the instructor.
     */
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < MIN_SALARY) {
            System.out.println("ERROR: Base Salary cannot be less than $" + String.format("%.2f", MIN_SALARY) + ".");
        } else if (baseSalary > MAX_SALARY) {
            System.out.println("ERROR: Base Salary cannot be greater than $" + String.format("%.2f", MAX_SALARY) + ".");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    /**
     * Prints all the instructor's details including personal information from MyPerson and instructor-specific details.
     * Outputs the instructor's full name, T-number, hire year, and base salary.
     */
    @Override
    public void printAll() {
        super.printAll();
        System.out.printf("   Year hired: %d, Salary: $%.2f\n", hiredYear, baseSalary);
    }
}