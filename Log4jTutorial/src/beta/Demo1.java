package beta;
import org.apache.logging.log4j.*;
public class Demo1 {
private static Logger Log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Log.debug("I am debugging");
	Log.info("Button is displayed");	
	Log.error("Button is not displayed");	
	Log.fatal("Button is missing");
	}

}
