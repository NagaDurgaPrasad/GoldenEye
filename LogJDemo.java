import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogJDemo {
	
	static final Logger logger = Logger.getLogger(LogJDemo.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("hi this is Debug");
		logger.fatal("this is fatal msg");
		
	}

}
