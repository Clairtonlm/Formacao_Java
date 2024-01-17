package pensionato;

public class Rent {
    private String name;
    private String email;

//Contrutrores
    public Rent(){

    }
    public Rent(String name, String email){
        this.name = name;
        this.email = email;
    }

// getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

// toString
    @Override
    public String toString() {
        return name + "," + email;
    }
}
