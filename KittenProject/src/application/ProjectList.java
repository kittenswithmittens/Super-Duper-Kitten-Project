package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProjectList{
	ObservableList<project> myProjects;

	public ProjectList(){
		//look at picture to find the outline for this class...
		super();
		myProjects =FXCollections.observableArrayList (
		(new AppliancesProject()),
		(new LightBulbProject()),
		(new HeatProject()),
		(new WindowsDoorsProject()),
		(new InsulationProject()),
		(new IrrigationProject()),
		(new SolarProject())
		);
	}
	
	
	public ObservableList<String> getProjects() {
		ObservableList<String> output = FXCollections.observableArrayList();
		for(int i = 0; i < myProjects.size(); i++) {
			output.add(myProjects.get(i).toString());
		}
		return output;
	}
}
