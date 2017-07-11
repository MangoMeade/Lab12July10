/**
 * Created by aibar on 7/10/2017.
 */
//Player class creates a generateRoshambo method and initializes two variables: name and choice.
//choice variable is from the Roshambo class. Choice will choose from one of the enumeration options
public abstract class Player {

    private String name;
    public Roshambo choice;

    public abstract Roshambo generateRoshambo();

    public void setName(String name) {
        this.name = name;
    }

    public void setChoice(Roshambo choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public Roshambo getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return choice.toString();
    }
}
