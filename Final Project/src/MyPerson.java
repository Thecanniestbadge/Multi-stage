/**
 * Name: Nicholas Vickery
 * Date: 11/08/2023
 * Course: CPT 236 - Java Programming
 * Project Name: Final project
 * Class Description: This class represents a person with a first name, last name, and T-number.
 * It is a base class for instructors and students.
 */
/**
 * Represents a generic person within the tri-county college system.
 * This class serves as a base for more specific person types like MyStudent and MyInstructor.
 * It holds common information such as first name, last name, and a T-number.
 */
public class MyPerson {
    private String firstName = "John";
    private String lastName = "Doe";
    private int idNumber;
    protected static int baseIDNumber = 100001;

    /**
     * Default constructor for MyPerson.
     * Initializes a person with default names and assigns a unique T-number.
     */
    public MyPerson() {
        setIDNumber();
    }

    /**
     * Constructs a new MyPerson with a given full name.
     * The full name is split into first and last name and assigned after validation.
     * A T-number is also generated for the person.
     *
     * @param fullName The full name of the person in the format "First Last".
     */
    public MyPerson(String fullName) {
        setFullName(fullName);
        setIDNumber();
    }

    /**
     * Retrieves the first name of the person.
     *
     * @return The first name of the person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the person after trimming and validating it.
     * The first name must not be blank and must not contain spaces.
     *
     * @param firstName The first name to be set for the person.
     */
    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if (firstName.isBlank()) {
            System.out.println("ERROR: First Name cannot be blank.");
        } else if (firstName.contains(" ")) {
            System.out.println("ERROR: First name cannot contain a space.");
        } else {
            this.firstName = firstName;
        }
    }

    /**
     * Retrieves the last name of the person.
     *
     * @return The last name of the person.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the person after trimming and validating it.
     * The last name must not be blank and must not contain spaces.
     *
     * @param lastName The last name to be set for the person.
     */
    public void setLastName(String lastName) {
        lastName = lastName.trim();
        if (lastName.isBlank()) {
            System.out.println("ERROR: Last Name cannot be blank.");
        } else if (lastName.contains(" ")) {
            System.out.println("ERROR: Last Name cannot contain a space.");
        } else {
            this.lastName = lastName;
        }
    }

    /**
     * Retrieves the full name of the person, which is a combination of first name and last name.
     *
     * @return The full name of the person.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Sets the full name of the person after validating it.
     * The full name must contain a first name and a last name, separated by a single space.
     *
     * @param fullName The full name to be set for the person.
     */
    public void setFullName(String fullName) {
        fullName = fullName.trim();
        if (fullName.isBlank()) {
            System.out.println("ERROR: Full Name cannot be blank.");
        } else if (!fullName.contains(" ")) {
            System.out.println("ERROR: Full Name must contain a space between First Name and Last Name.");
        } else if (fullName.chars().filter(ch -> ch == ' ').count() > 1) {
            System.out.println("ERROR: Full Name cannot contain more than 1 space.");
        } else {
            String[] names = fullName.split(" ");
            setFirstName(names[0]);
            setLastName(names[1]);
        }
    }

    /**
     * Sets the T-number for the person.
     * The T-number is auto-generated and incremented from a base value.
     */
    private void setIDNumber() {
        this.idNumber = baseIDNumber++;
    }

    /**
     * Retrieves the T-number of the person.
     *
     * @return The T-number of the person.
     */
    public String getIDNumber() {
        return "T00" + this.idNumber;
    }

    /**
     * Prints all the personal information of the person in a formatted string.
     * The output includes the first name, last name, and T-number.
     */
    public void printAll() {
        System.out.println(getFullName() + ", T00" + idNumber);
    }
}