public class Project {
    // MEMBER VARIABLES
    private String name;
    private String description;
    private Double initialCost;
    // CONSTRUCTOR
    public Project() {
        this.name = "un-named";
        this.description = "no description";
        this.initialCost = 0.00;
    }
    public Project(String name, String desc, Double cost) {
        this.name = name;
        this.description = desc;
        this.initialCost = cost;
    }
    public Project(String name, String desc) {
        this.name = name;
        this.description = desc;
        this.initialCost = 0.00;
    }
    public Project(String name, Double cost) {
        this.name = name;
        this.description = "no description";
        this.initialCost = cost;
    }
    public Project(Double cost) {
        this.name = "un-named";
        this.description = "no description";
        this.initialCost = cost;
    }
    // GETTERS
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.description;
    }
    public Double getCost() {
        return this.initialCost;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(Double cost) {
        this.initialCost = cost;
    }
    public void setDesc(String desc) {
        this.description = desc;
    }
    // instance method
    public String elevatorPitch() {
        return this.name + " : " + this.description;
    }
}