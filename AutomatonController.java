/**
 * Set up and control an elementary cellular automaton.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version  2016.02.29
 */
public class AutomatonController
{
    /*
     * 24. Creates a pattern of sort.
     * 25. Yes, after the reset it creates the same pattern.
     * 26. java.util.Arrays has two fill methods for int[]. 
     * They're used to quickly initialize or reset int arrays.
     * In an Automaton's reset() method, they'd likely clear state/transition arrays to default values.
     * 
     * 
     * 
     * 
     * 29.
     */
    
    // The automaton.
    
    private Automaton auto;
    
    /**
     * Create an AutomatonController.
     * @param numberOfCells The number of cells in the automaton.
     */
    public AutomatonController(int numberOfCells, int initialOnes)
    {
        //auto = new Automaton(numberOfCells, 30, initialOnes);
        auto.print();
    }
    
    /**
     * Create an AutomatonController with
     * a default number of cells.
     */
    public AutomatonController()
    {
        this(50,5);
    }
    
    /**
     * Run the automaton for the given number of steps.
     * @param numSteps The number of steps.
     */
    public void run(int numSteps)
    {
        for(int step = 1; step <= numSteps; step++) {
            step();
        }
    }
    
    /**
     * Run the automaton for a single step.
     */
    public void step()
    {
        auto.update();
        auto.print();
    }
    
    /**
     * Reset the automaton.
     */
    public void reset()
    {
        auto.reset();
        auto.print();
    }
}
