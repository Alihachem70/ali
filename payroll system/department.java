import java.util.ArrayList;
import java.util.List;

public class department {

    private String name;
    private List<employee> emp = new ArrayList<>();


    public department(String name, List<employee> emp) {
        this.name = name;
        this.emp = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<employee> getEmp() {
        return emp;
    }

    public void setEmp(List<employee> emp) {
        this.emp = emp;
    }


    public String payroll(){
        return "Payroll for " +getName()+"\n" +initEmp(getName())+"\n";
    }

    public String initEmp(String dpName){
        String str="";

        for (employee em:emp ) {
            if(dpName.equals(em.getDep()))
            str += "salary for "+ em.getName() +" is $"+em.getSalary()+"\n";
        }
        return str;
    }


}
