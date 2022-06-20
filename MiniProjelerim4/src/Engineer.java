public class Engineer extends Employee {
    String branch;




    public Engineer(int EmpoloyeeID,String branch, String name, String surname, double salary) {
        super(EmpoloyeeID, name, surname, salary);
        this.branch=branch;
    }

    public Engineer(int EmpoloyeeID,String branch, String name, String surname) {
        super(EmpoloyeeID, name, surname);
        this.branch=branch;
    }

    public Engineer(int EmpoloyeeID, double salary) {
        super(EmpoloyeeID, salary);
    }

    public  void ShowInfos(){
        System.out.println("employee degeri: "+this.EmployeeId);
        System.out.println("bransi: "+this.branch);
        System.out.println("adi: "+this.name);
        System.out.println("soyadi "+this.surname);
        System.out.println("maasi "+this.salary);

    }

}
