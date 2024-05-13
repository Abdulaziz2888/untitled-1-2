public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "Country");
        Employee objectA = new Employee("John", 30, address, "E001");
        Manager objectB = new Manager(objectA, "HR");
        Manager objectC = new Manager(new Employee("Alice", 35, address, "E002"), "Finance");

        // Вывод свойств объекта objectA
        System.out.println("Employee:");
        System.out.println("Name: " + objectA.getName());
        System.out.println("Age: " + objectA.getAge());
        System.out.println("Address: " + objectA.getAddress().getStreet() + ", " + objectA.getAddress().getCity() + ", " + objectA.getAddress().getCountry());
        System.out.println("Employee ID: " + objectA.getEmployeeId());

        objectA.work();
        objectA.work("Project presentation");

        System.out.println();
        System.out.println("Manager:");
        System.out.println("Name: " + objectB.getName());
        System.out.println("Age: " + objectB.getAge());
        System.out.println("Address: " + objectB.getAddress().getStreet() + ", " + objectB.getAddress().getCity() + ", " + objectB.getAddress().getCountry());
        System.out.println("Employee ID: " + objectB.getEmployeeId());
        System.out.println("Department: " + objectB.getDepartment());

        objectB.work();
        objectB.work("Hiring process");

        System.out.println();

        System.out.println("Manager:");
        System.out.println("Name: " + objectC.getName());
        System.out.println("Age: " + objectC.getAge());
        System.out.println("Address: " + objectC.getAddress().getStreet() + ", " + objectC.getAddress().getCity() + ", " + objectC.getAddress().getCountry());
        System.out.println("Employee ID: " + objectC.getEmployeeId());
        System.out.println("Department: " + objectC.getDepartment());

        objectC.work();
        objectC.work("Budget planning");
    }
}
