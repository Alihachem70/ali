import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    public static String[] AvDep = new String[]{"IT","Management","Electronics","Art","Cook"};


    public static List<employee> empList = new ArrayList<>();
    public static List<employee> unempList = new ArrayList<>();
    public static department dp;
    public static employee p;


    public static void main(String[] args) {
        empList.add(new employee("Ali",AvDep[0],1000));
        empList.add(new employee("Mhmd",AvDep[1],2000));
        empList.add(new employee("Haidar",AvDep[0],300));

        char a ,b;
        do{
            System.out.println("Please choose an operation: \na) For viewing the employees with departments\nb)Add new person\nc)For join person and department\nd)Quit employee from department\ne)To change employee department\nf)exit ");
            a = sc.next().charAt(0);
            initChoose(a);
        }while (a != 'f');


    }

    public static void initChoose(char a){
        switch (a){
            case 'a':

                String dep;
                do{
                    System.out.println("Please enter department of the following(IT, Management, Electronics, Art, Cook):\n");
                    dep = sc.next();
                }while (!isDep(dep));
                dp = new department(dep,empList);
                System.out.println(dp.payroll());
                break;






            case 'b':
                System.out.println("Please enter person name:\n");
                String emp1 = sc.next();
                System.out.println("Added Successful!\n");
                unempList.add(new employee(emp1));
                break;






            case 'c':
                System.out.println(showP());
                String emp2 ;

                do{
                    System.out.println("Please enter person name from the list above:\n");
                    emp2 = sc.next();
                }while (!isPerson(emp2));


                String dep2 ;
                do{
                    System.out.println("Please enter department of the following(IT, Management, Electronics, Art, Cook):\n");
                    dep2 = sc.next();
                }while (!isDep(dep2));
                int salary = sc.nextInt();
                empList.add(new employee(emp2,dep2,salary));
                System.out.println("Joined Successful!\n");
                break;





            case 'd':
                System.out.println(showEmployees());
                String emp3 ;

                do{
                    System.out.println("Please enter employee name from the list above:\n");
                    emp3 = sc.next();
                }while (!isEmp(emp3));
                System.out.println("Quit Successful!\n");
                deleteEmp(emp3);
                unempList.add(new employee(emp3));


                break;

            case 'e':
                System.out.println(showEmployees());
                String emp4 ;

                do{
                    System.out.println("Please enter employee name from the list above to change his department:\n");
                    emp4 = sc.next();
                }while (!isEmp(emp4));

                String dep4;
                do{
                    System.out.println("Please enter department of the following(IT, Management, Electronics, Art, Cook):\n");
                    dep4 = sc.next();
                }while (!isDep(dep4));
                deleteEmp(emp4);
                p = new employee(emp4);
                System.out.println(p.getSalary());

                empList.add(new employee(emp4,dep4,p.getSalary()));

                break;


            case 'f':
                return ;







            default:
                System.out.println("Error");
                
        }
    }








    public static boolean isDep(String dep){
        boolean abc = false;
        for (String ab: AvDep) {
            if(dep.equals(ab)){
                abc = true;
            }
        }
        return abc;
    }


    public static boolean isPerson(String dep){
        boolean abc = false;
        for (employee ab: unempList) {
            if(dep.equals(ab.getName())){
                abc = true;
            }
        }
        return abc;
    }


    public static boolean isEmp(String dep){
        boolean abc = false;
        for (employee ab: empList) {
            if(dep.equals(ab.getName())){
                abc = true;
            }
        }
        return abc;
    }


    public static String showP(){
        String str="";
        int i=1;

        for (employee ab: unempList ) {
            str +="Person " + i + " = " + ab.getName()+"\n";
            i++;
        }

        return str;
    }



    public static String showEmployees(){
        String str="";
        int i=1;

        for (employee ab: empList ) {
            str +="Person " + i + " = " + ab.getName()+"\t"+ab.getDep()+"\n";
            i++;
        }

        return str;
    }






    public static void deleteEmp(String dep){
        for (employee ab: empList) {
            if(dep.equals(ab.getName())){
                empList.remove(ab);
                return;
            }
        }

    }












}
