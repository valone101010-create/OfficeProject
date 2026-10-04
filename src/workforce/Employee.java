package workforce;


public abstract class Employee extends Person {
    protected Position position;
    protected double salaryCoefficient;
    protected int experience;
    protected static final double BASE_RATE = 1000.0;

    public Employee(String firstName, String lastName,
                    double salaryCoefficient, int experience) {
        super(firstName, lastName);
        this.salaryCoefficient = salaryCoefficient;
        this.experience = experience;
    }


    public abstract void setPosition();


    public double calculateSalary() {
        return BASE_RATE * salaryCoefficient * experience;
    }

    public Position getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    @Override
    public String toString() {
        return String.format(getFullName(), position, calculateSalary(), experience);
    }

}

