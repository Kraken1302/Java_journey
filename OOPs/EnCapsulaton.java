package OOPs;

public class EnCapsulaton {
    public static void main(String[] args) {
        car c1 = new car("ferrari", "SF90", 2025);
        System.out.println(c1.getcompany());
        System.out.println(c1.setyear(2021));
    }
}
public class car{
    private String company;
    private String model;
    private int year;
    car(String company,String model,int year){
        this.company=company;
        this.model=model;
        this.year=year;
    }
    public String getcompany(){
        return company;
    }
    public int setyear(int year){
        this.year=year;
        return year;
    }

}
