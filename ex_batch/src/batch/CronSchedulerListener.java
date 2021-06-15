package batch;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.SchedulerException;

public class CronSchedulerListener implements ServletContextListener {

CronScheduler cronScheduler;
	
	// constructor
	public CronSchedulerListener() { }
	
	// method
	@Override
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("=====WEB SERVICE STOP!=====");
    	try {
    		cronScheduler.scheduler.clear();
    		cronScheduler.scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
    }
	@Override
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("=====WEB SERVICE START!=====");
    	cronScheduler = new CronScheduler("0 45 17 ? * TUE *", TopHitBoard.class);
    	cronScheduler.execute();
    }
	
}
