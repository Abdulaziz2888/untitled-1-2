class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, Address address, String employeeId) {
        super(name, age, address);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }


    public void work() {
        System.out.println("Employee is working...");
    }

    public void work(String task) {
        System.out.println("Employee is working on: " + task);
    }
}
