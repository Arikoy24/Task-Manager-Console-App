public class Task {

    int id;
    String name;
    String description;
    Status status;


    Task(int id, String name, String description, Status status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;

    }
        @Override
        public String toString() {
            return "\nId: " + id + "\nName: " + name + "\nDescription: " + description + "\nStatus: " + getStatus();
        }


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

}