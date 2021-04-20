public class Student {
    private String id;
    private String name;
    private String address;
    private String prioritize;
    private ExamBlock element;

    public Student(String id, String name, String address, String prioritize) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
    }

    public Student(String id, String name, String address, String prioritize, ExamBlock element) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.prioritize = prioritize;
        this.element = element;
    }

    public ExamBlock getElement() {
        return element;
    }

    public void setElement(ExamBlock element) {
        this.element = element;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(String prioritize) {
        this.prioritize = prioritize;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id= " + id +
                ", name= " + name +
                ", address= " + address +
                ", prioritize= " + prioritize +
                ", element= " + element +
                '}';
    }
}
