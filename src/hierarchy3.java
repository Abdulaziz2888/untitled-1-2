final class Manager {
    private Employee employee;
    private String department;

    public Manager(Employee employee, String department){
        this.employee = employee;
        this.department = department;
    }

    public String getName(){
        return employee.getName();
    }

    public int getAge(){
        return employee.getAge();
    }

    public Address getAddress(){
        return employee.getAddress();
    }

    public String getEmployeeId(){
        return employee.getEmployeeId();
    }

    public String getDepartment(){
        return department;
    }

    public void performTask(String task){
        System.out.println("As a manager, delegating task: " + task);
    }
}
