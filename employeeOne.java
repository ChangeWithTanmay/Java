public class employeeOne {
    public String name, employeeId, month;
    public float monthlySalary;

    public void employeeSalary(){
        System.out.println("name: "+ name + " employeeId: " + employeeId+" month: " + month);
    }
}

class employee {
    public static void main(String[] args){
        employeeOne e1 = new employeeOne();
        e1.employeeId = "12458";
        e1.month = "Fab";
    }
}