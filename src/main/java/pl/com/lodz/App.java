package pl.com.lodz;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class App 
{
	private static Logger logger = LogManager.getLogger(App.class.getName());
	
    public static void main( String[] args )
    {
        logger.info( "Application started!" );
        logger.info( "Application end!" );
    }
}
