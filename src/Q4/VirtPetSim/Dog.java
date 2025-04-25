package Q4.VirtPetSim;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        // feeding behavior for Dog
        if (this.getEnergy() <= 40) {
            this.setEnergy(this.getEnergy() + 60);
        } else {
            this.setEnergy(100);
        }

        if (this.getHunger() <= 20) {
            this.setHunger(this.getHunger() + 80);
        } else {
            this.setHunger(100);
        }

        if (this.getHappiness() <= 30) {
            this.setHappiness(this.getHappiness() + 70);
        } else {
            this.setHappiness(100);
        }

        if (this.getHealth() >= 95) {
            this.setHealth(100);
        } else if (this.getHealth() < 95) {
            this.setHealth(this.getHealth() + 5);
        }
    }

    @Override
    public void play() {
        // playing behavior for Dog
        if (this.getHappiness() <= 10 || this.getHunger() <= 20) {
            return;
        } else {
            if (this.getEnergy() < 30) {
                this.setEnergy(0);
            } else {
                this.setEnergy(this.getEnergy() - 30);
            }

            if (this.getHappiness() > 80) {
                this.setHappiness(100);
            } else {
                this.setHappiness(this.getHappiness() + 20);
            }

            if (this.getHunger() < 15) {
                this.setHunger(0);
            } else {
                this.setHunger(this.getHunger() - 15);
            }
        }
    }

    @Override
    public void sleep() {
        // sleeping behavior for Dog
        if (getHunger() <= 20 || this.getEnergy() > 90) {
            return;
        } else {
            this.setHunger(this.getHunger() - 20);

            if (this.getEnergy() > 20) {
                this.setEnergy(100);
            } else {
                this.setEnergy(this.getEnergy() + 80);
            }

            if (this.getHealth() >= 80) {
                this.setHealth(100);
            } else {
                this.setHealth(this.getHealth() + 20);
            }
        }
    }
}
