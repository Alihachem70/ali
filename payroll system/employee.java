public class employee {

    private String name;
    private String dep;
    private int salary;

    public employee() {
    }

    public employee(String name) {
        this.name = name;
    }

    public employee(String name, String dep, int salary) {
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }



}
