

public class Exo026 {
    public static void main(String[] args){
        Chien larry = new Chien("larry", 12, "poodle");
        Chat pepe = new Chat("pepe", 5, "chat orange");
        larry.sePresenter();
        pepe.sePresenter();
    }
}

class Animal {
    private String nom;
    private int age;
    private String race;

    public Animal(String nom, int age, String race){
        this.setNom(nom);
        this.setAge(age);
        this.setRace(race);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public String getRace() {
        return this.race;
    }
}

class Chien extends Animal {
    public Chien(String nom, int age, String race){
        super(nom, age, race);
    }

    public String parler(){
        return "Woof!";
    }

    public void sePresenter(){
        System.out.printf("Je suis un "+this.getRace()+", mon nom est "+this.getNom()+", j'ai "+this.getAge()+" ans "+this.parler()+"\n");
    }
}

class Chat extends Animal {
    public Chat(String nom, int age, String race){
        super(nom, age, race);
    }

    public String parler(){
        return "Meow!";
    }

    public void sePresenter(){
        System.out.printf("Je suis un "+this.getRace()+", mon nom est "+this.getNom()+", j'ai "+this.getAge()+" ans "+this.parler()+"\n");
    }
}
