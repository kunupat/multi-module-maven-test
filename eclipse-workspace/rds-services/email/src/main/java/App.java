import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	final static Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(logger.isDebugEnabled()){
			logger.debug("This is debug");
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : ");
		}
		
		logger.warn("This is warn : ");
		logger.error("This is error : ");
		logger.fatal("This is fatal : ");
	}

}
