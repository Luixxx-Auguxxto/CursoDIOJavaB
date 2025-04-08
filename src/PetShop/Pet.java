package PetShop;

public class Pet {
    private final String name;

    //para saber se esta limpo
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }


    // não gerou set de name pq é final
    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
