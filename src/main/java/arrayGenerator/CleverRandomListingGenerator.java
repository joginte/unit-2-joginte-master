package arrayGenerator;


public class CleverRandomListingGenerator extends RandomListingGenerator {
    /**
     * Generate an array containing elements in a random order
     *
     * @param size the size of the array to be generated
     */
    public CleverRandomListingGenerator(int size) {
        super(size);
    }

    @Override
    protected void randomise() {
        //int[] newArray = new int[getArray().length]; // creating array to store values
        int randomIndex = getRandomIndex(); //getRandomIndex method taken from super class RandomListingGenerator random index is random value taken from array
        for (int i = 0; i < getArray().length; i++) // iterating while obtaining non-repetitive values for array
        {
            int randomValue = getArray()[randomIndex]; //fisher yates algorithm
            getArray()[randomIndex] = getArray()[i];
            getArray()[i] = randomValue;
        }
    }
    }
