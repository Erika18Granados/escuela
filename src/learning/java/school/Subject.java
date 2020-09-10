package learning.java.school;

//CLASE MATERIA
class Subject {
    private String name;
    private int credits;
    //GET Y SET SON PARA ACCEDER A VARIABLES PRIVADAS DE LAS CLASES EN OTRAS CLASES


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}


