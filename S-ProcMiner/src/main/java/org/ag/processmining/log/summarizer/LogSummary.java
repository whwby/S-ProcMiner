  
package org.ag.processmining.log.summarizer;

/**
 *
 * @author ahmed
 */

import java.util.Map;
import java.util.TreeSet;
import org.ag.processmining.log.model.EventClass;
import org.ag.processmining.log.model.Originator;

/**
 *
 */
public class LogSummary {
        /**
	 * The name of the logs (e.g. name of the application that generated the logs)
	 */
        private String logName = null ; 
        /**
	 * The description of the logs (e.g. description of the application that generated the logs)
	 */
        private String logDescription = null ;
        /**
	 * The time frame of the process instances in the log
	 */
	private TimeFrame processTimeFrame = null;
        /*
        The total number of events of the log
        */
	private int numberOfEvents = 0;
	/**
	 * The total number of process instances contained in a log.
	 */
	private int numberOfProcessInstances = 0;
	
	/**
	 * Alphabetically ordered set containing as strings the log's event classes
	 */
	private TreeSet<EventClass> eventClasses = null;
	
	/**
	 * Mapping from event classes that start a process instance to the
	 * number of process instances actually start a process instance
	 */
	private Map<EventClass, Integer> startingLogEvents = null;
	/**
	 * Mapping from event classes that end a process instance to the
	 * number of process instances actually end a process instance
	 */
	private Map<EventClass, Integer> endingLogEvents = null;
	
        /**
	 * Mapping from event classes to the number of processes they occured in 
	 */
	private Map<EventClass, Integer> eventClassOccurences = null;
        
        /**
	 * Log originators alphabitically ordered by their name
	 */
	private TreeSet<Originator> originators = null;
	
        /**
	 * Mapping from originator to the event classes they execute 
	 */
	private Map<Originator, Map<EventClass,Integer>> mapOriginatorsToEventClasses = null;
	
	
	/**
	 * Creates a new log summary.
	 * @param logName of the summarized log.
	 * @param logDescription Description of the summarized log.
	 */
	public LogSummary(String logName, String logDescription) {
		this.logName = logName ;
                this.logDescription = logDescription ;
	}

	/**
	 * Creates a new, empty and initialized lightweight
	 * log summary instance.
	 */
	public LogSummary() {
		this("", "");
	}

    /**
     * @return the logName
     */
    public String getLogName() {
        return logName;
    }

    /**
     * @param logName the logName to set
     */
    public void setLogName(String logName) {
        this.logName = logName;
    }

    /**
     * @return the logDescription
     */
    public String getLogDescription() {
        return logDescription;
    }

    /**
     * @param logDescription the logDescription to set
     */
    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription;
    }

    /**
     * @return the processTimeFrame
     */
    public TimeFrame getProcessTimeFrame() {
        return processTimeFrame;
    }

    /**
     * @param processTimeFrame the processTimeFrame to set
     */
    public void setProcessTimeFrame(TimeFrame processTimeFrame) {
        this.processTimeFrame = processTimeFrame;
    }

    /**
     * @return the numberOfEvents
     */
    public int getNumberOfEvents() {
        return numberOfEvents;
    }

    /**
     * @param numberOfEvents the numberOfEvents to set
     */
    public void setNumberOfEvents(int numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    /**
     * @return the numberOfProcessInstances
     */
    public int getNumberOfProcessInstances() {
        return numberOfProcessInstances;
    }

    /**
     * @param numberOfProcessInstances the numberOfProcessInstances to set
     */
    public void setNumberOfProcessInstances(int numberOfProcessInstances) {
        this.numberOfProcessInstances = numberOfProcessInstances;
    }

    /**
     * @return the eventClasses
     */
    public TreeSet<EventClass> getEventClasses() {
        return eventClasses;
    }

    /**
     * @param eventClasses the eventClasses to set
     */
    public void setEventClasses(TreeSet<EventClass> eventClasses) {
        this.eventClasses = eventClasses;
    }

    /**
     * @return the startingLogEvents
     */
    public Map<EventClass, Integer> getStartingLogEvents() {
        return startingLogEvents;
    }

    /**
     * @param startingLogEvents the startingLogEvents to set
     */
    public void setStartingLogEvents(Map<EventClass, Integer> startingLogEvents) {
        this.startingLogEvents = startingLogEvents;
    }

    /**
     * @return the endingLogEvents
     */
    public Map<EventClass, Integer> getEndingLogEvents() {
        return endingLogEvents;
    }

    /**
     * @param endingLogEvents the endingLogEvents to set
     */
    public void setEndingLogEvents(Map<EventClass, Integer> endingLogEvents) {
        this.endingLogEvents = endingLogEvents;
    }

    /**
     * @return the mapEventClassToProcessOccurences
     */
    public Map<EventClass, Integer> getEventClassesOccurences() {
        return eventClassOccurences;
    }

    /**
     * @param mapEventClassToProcessOccurences the mapEventClassToProcessOccurences to set
     */
    public void setEventClassOccurences(Map<EventClass, Integer> eventClassOccurences) {
        this.eventClassOccurences = eventClassOccurences;
    }

    /**
     * @return the originators
     */
    public TreeSet<Originator> getOriginators() {
        return originators;
    }

    /**
     * @param originators the originators to set
     */
    public void setOriginators(TreeSet<Originator> originators) {
        this.originators = originators;
    }
    
    /**
     * @param originator add an originator 
     */
    public void addOriginator(Originator originator){
        this.originators.add(originator) ; 
    }
    /**
     * @return the mapOriginatorsToEventClasses
     */
    public Map<Originator, Map<EventClass,Integer>> getMapOriginatorsToEventClasses() {
        return mapOriginatorsToEventClasses;
    }

    /**
     * @param mapOriginatorsToEventClasses the mapOriginatorsToEventClasses to set
     */
    public void setMapOriginatorsToEventClasses(Map<Originator, Map<EventClass,Integer>> mapOriginatorsToEventClasses) {
        this.mapOriginatorsToEventClasses = mapOriginatorsToEventClasses;
    }

	
}
