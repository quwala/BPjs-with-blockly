package com.iot_proj.iot_proj.custom;

import java.io.PrintStream;

import javax.swing.DefaultListModel;

import il.ac.bgu.cs.bp.bpjs.execution.listeners.BProgramRunnerListener;
import il.ac.bgu.cs.bp.bpjs.model.BEvent;
import il.ac.bgu.cs.bp.bpjs.model.BProgram;
import il.ac.bgu.cs.bp.bpjs.model.BThreadSyncSnapshot;
import il.ac.bgu.cs.bp.bpjs.model.FailedAssertion;

public class CustomBProgramRunnerListener implements BProgramRunnerListener {
	private final PrintStream out;
    private DefaultListModel<String> eventsModel;
    
    public CustomBProgramRunnerListener( PrintStream aStream){
        out = aStream;
    }
    
    public CustomBProgramRunnerListener() {
        this( System.out );
    }
    
    public CustomBProgramRunnerListener(DefaultListModel<String> eventsModel){
    	this.out = System.out;
    	this.eventsModel = eventsModel;
    }

    @Override
    public void starting(BProgram bp) {
        out.println("---:" + cutBPName(bp.getName()) + " Starting");
    }

    @Override
    public void started(BProgram bp) {
        out.println("---:" + cutBPName(bp.getName()) + " Started");
    }

    @Override
    public void ended(BProgram bp) {
        out.println("---:" + cutBPName(bp.getName()) + " Ended");
    }

    @Override
    public void assertionFailed(BProgram bp, FailedAssertion theFailedAssertion) {
        out.println("---:" + cutBPName(bp.getName()) + " B-thread " + theFailedAssertion.getBThreadName()
                           + " is in invalid state: " + theFailedAssertion.getMessage());
    }

    @Override
    public void eventSelected(BProgram bp, BEvent theEvent) {
        out.println(" --:" + cutBPName(bp.getName()) + " Event " + cutEventName(theEvent.toString()));
        try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        removeEventFromList(cutEventName(theEvent.toString()));
    }

    @Override
    public void superstepDone(BProgram bp) {
        out.println("---:" + cutBPName(bp.getName()) + " No Event Selected");
    }

    @Override
    public void bthreadAdded(BProgram bp, BThreadSyncSnapshot theBThread) {
        out.println("  -:" + cutBPName(bp.getName()) + " Added " + theBThread.getName());
    }

    @Override
    public void bthreadRemoved(BProgram bp, BThreadSyncSnapshot theBThread) {
        out.println("  -:" + cutBPName(bp.getName()) + " Removed " + theBThread.getName());
    }
    
    @Override
    public void bthreadDone(BProgram bp, BThreadSyncSnapshot theBThread) {
        out.println("  -:" + cutBPName(bp.getName()) + " Done " + theBThread.getName());
    }
    
  //cleans up the BProgram name for logging
    private String cutBPName(String name){
    	int index = name.lastIndexOf("/") + 1;
    	return name.substring(index);
    }
    
    //cleans up the event name for logging
    private String cutEventName(String name){
    	int index = name.indexOf(':') +1;
    	return name.substring(index, name.length() - 1);
    }
    
    private void removeEventFromList(String name){
    	if(eventsModel != null){
    		eventsModel.removeElement(name);
    	}
    }
}
