package TestHarness;

/**
 *
 * @author 
 */
public class testharness {
    
    public static void main(String[] args){

        //Restaurant Tests
        System.out.println("Running Test Stubs for Restaurant Ordering...");
        RestaurantTestHarness restTest = new RestaurantTestHarness();
        // RestaurantController Test Stubs
        restTest.RCTestStubs();
        // RestaurantOrderController Test Stubs
        restTest.ROCTestStubs();
        // RestaurantMenuUI Test Stubs
        restTest.RMUITestStubs();
        // RestaurantOrderUI Test Stubs
        restTest.ROUITestStubs();
        // Restaurant Test Stubs
        restTest.RTestStubs();
        System.out.println("...Restaurant End -> Finsihed Running All Restaurant Tests");
        
        //Navigation Tests
        System.out.println("Running Test Stubs for Navigation...");
        // NavigationController Test Stubs
        restTest.NCTestStubs();
        // NavigationUI Test Stubs
        restTest.NUITestStubs();
        System.out.println("...Navigation End -> Finished Running All Navigation Tests");
        
      
        //Activity Tests 
        System.out.println("Running Test Stubs for Activity Class");
        ActivityTestHarness activityTest = new ActivityTestHarness();
        //Activity Model Class Test
        activityTest.testModelActivity();
        
        
        //Admin Navigation Tests 
        System.out.println("Running Test Stubs for Admin Navigation...");
        //AdminNavigationController Test Stubs 
        activityTest.ACTestStubs();
        //AdminNavaigationUI Test Stubs 
        activityTest.ANUITestStubs();
        
        
        
    }
    
}
