package Q4.VirtPetSim;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        // feeding behavior for Cat
        if (this.getEnergy() <= 60) {
            this.setEnergy(this.getEnergy() + 40);
        } else {
            this.setEnergy(100);
        }

        if (this.getHunger() <= 20) {
            this.setHunger(this.getHunger() + 80);
        } else {
            this.setHunger(100);
        }

        if (this.getHappiness() <= 50) {
            this.setHappiness(this.getHappiness() + 50);
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
        // playing behavior for Cat
        if (this.getEnergy() <= 25 || this.getHappiness() <= 20 || this.getHunger() <= 20) {
            return;
        } else {
            this.setEnergy(this.getEnergy() - 25);
            if (this.getHappiness() >= 90) {
                this.setHappiness(100);
            } else {
                this.setHappiness(this.getHappiness() + 10);
            }
            if (this.getHunger() > 15) {
                this.setHunger(this.getHunger() - 15);
            } else {
                this.setHunger(0);

            }
        }
    }

    @Override
    public void sleep() {
        // sleeping behavior for Cat
        if (this.getEnergy() > 90) {
            return;
        } else {
            if (this.getHunger() < 20) {
                this.setHunger(0);
            } else this.setHunger(this.getHunger() - 20);

            this.setEnergy(100);

            if (this.getHealth() >= 80) {
                this.setHealth(100);
            } else {
                this.setHealth(this.getHealth() + 20);
            }
        }

    }
}
