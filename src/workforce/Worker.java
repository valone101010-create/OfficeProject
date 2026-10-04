package workforce;


public class Worker extends Employee {

    public Worker(String firstName, String lastName,
                  double salaryCoefficient, int experience) {
        super(firstName, lastName,salaryCoefficient, experience);
        setPosition();
    }

    @Override
    public void setPosition() {
        this.position = Position.WORKER;
    }
}
