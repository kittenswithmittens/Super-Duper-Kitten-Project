package application;

import java.util.ArrayList;

public class ProjectList{
	ArrayList<project> myProjectList;

	public ProjectList(){
		//look at picture to find the outline for this class...
		super();
		myProjectList = new ArrayList<project>();
		myProjectList.add(new AppliancesProject());
		myProjectList.add(new LightBulbProject());
		myProjectList.add(new HeatProject());
		myProjectList.add(new WindowsDoorsProject());
		myProjectList.add(new InsulationProject());
		myProjectList.add(new IrrigationProject());
		myProjectList.add(new SolarProject());
		
	}
}
