/**
 * Cat
 * Use with Cats with BigArrayLists
 */
package Q2;

public class Cat {
    private String myName;
    private double myWeight;
    private int myAge;
    private double myCost;

    public Cat() {
        myName = "";
        myWeight = 0;
        myAge = 0;
        myCost = 0;
    }

    public Cat(String name, double weight, int age, double cost) {
        myName = name;
        myWeight = weight;
        myAge = age;
        myCost = cost;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public double getCost() {
        return myCost;
    }

    public void setCost(double cost) {
        myCost = cost;
    }

    public double getWeight() {
        return myWeight;
    }

    /**
     * Methods
     */
    public void setWeight(double weight) {
        myWeight = weight;
    }

    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }
}
