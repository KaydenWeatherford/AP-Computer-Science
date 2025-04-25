package Q4.VirtPetSim;

import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets = new ArrayList<>();

    // TODO: Implement methods as needed to interact with the pets list
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(String name) {
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName().equals(name)) {
                pets.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public Pet getSelectedPet(int index) {
        if (index < pets.size()) {
            return pets.get(index);
        } else return null;
    }

    public void setPets(ArrayList<Pet> pek) {
        this.pets = pek;
    }

}
