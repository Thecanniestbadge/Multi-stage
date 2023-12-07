public class TestBench {

    public void testProject() {
        System.out.println("****************************");
        System.out.println("Testing the 'MyPerson' class");

        // Test default constructor
        MyPerson testPerson1 = new MyPerson();
        if (!testPerson1.getFullName().equals("John Doe"))
            System.out.println("testPerson1.getFullName failed - returned " + testPerson1.getFullName());
        if (!testPerson1.getIDNumber().equals("T00100019"))
            System.out.println("testPerson1.getIDNumber failed - returned " + testPerson1.getIDNumber());
        if (!testPerson1.getFirstName().equals("John"))
            System.out.println("testPerson1.getFirstName failed - returned " + testPerson1.getFirstName());
        if (!testPerson1.getLastName().equals("Doe"))
            System.out.println("testPerson1.getLastName failed - returned " + testPerson1.getLastName());

        // Test additional constructor
        MyPerson testPerson = new MyPerson("George Fiori");
        if (!testPerson.getFullName().equals("George Fiori"))
            System.out.println("testPerson.getFullName failed - returned " + testPerson.getFullName());
        if (!testPerson.getIDNumber().equals("T00100020"))
            System.out.println("testPerson.getIDNumber failed - returned " + testPerson.getIDNumber());
        if (!testPerson.getFirstName().equals("George"))
            System.out.println("testPerson.getFirstName failed - returned " + testPerson.getFirstName());
        if (!testPerson.getLastName().equals("Fiori"))
            System.out.println("testPerson.getLastName failed - returned " + testPerson.getLastName());

        // test setFullName
        testPerson.setFullName("  George Fiori  "); // No error
        System.out.print("1. ");
        testPerson.setFullName(""); // Cannot be blank error
        System.out.print("2. ");
        testPerson.setFullName("  GeorgeFiori  "); // Missing space error
        System.out.print("3. ");
        testPerson.setFullName("  George  Fiori  "); // Too many spaces error

        //Test setFirstName
        testPerson.setFirstName("  George  "); // No error
        System.out.print("4. ");
        testPerson.setFirstName(""); // Cannot be blank error
        System.out.print("5. ");
        testPerson.setFirstName("George Fiori"); // Cannot have a space error

        // Test setLastName
        testPerson.setLastName("  Fiori  "); // No error
        System.out.print("6. ");
        testPerson.setLastName(""); // Cannot be blank error
        System.out.print("7. ");
        testPerson.setLastName("George Fiori"); // Cannot have a space error

        System.out.println("There should be 7 errors.");

        // Test printAll
        System.out.println("Compare:");
        System.out.println("George Fiori, T00100020");
        testPerson.printAll();

        System.out.println("Tests of 'MyPerson' complete");
        System.out.println("****************************");
    }
}