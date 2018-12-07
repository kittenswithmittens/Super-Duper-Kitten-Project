package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import diyProjects.SolarProject;


public class ProjectList{
	public ObservableList<project> myProjects;

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
		(new SolarProject()),
		(new ThermostatProject())
		);
	}
	
	
	public ObservableList<project> getPros() {
		return this.myProjects;
	}
	
	
	
	public void sortCost() {
		Collections.sort(myProjects, new SortbyCost());
		
	}
	
	public void sortDifficulty() {
		Collections.sort(myProjects,  new SortbyDifficulty());
	}
	
	public void sortEnergySavings() {
		Collections.sort(myProjects, new SortbyEnergySavings());
	}
	
	
	/**
	 * Inner class for sorting by project Energy Savings.
	 */
	class SortbyEnergySavings implements Comparator<project> {
		public int compare(project a, project b) {
			return a.getSavings() - b.getSavings();
		}
	}
	
	
	/**
	 * Inner class for sorting by project difficulty.
	 * @author richw253
	 */
	class SortbyDifficulty implements Comparator<project> {
		public int compare(project a, project b) {
			return a.getDifficulty() - b.getDifficulty();
		}
	}
	
	
	/**
	 * Inner class for sorting by project cost.
	 * @author richw253
	 *
	 */
	class SortbyCost implements Comparator<project> {
		public int compare(project a, project b) {
			return a.getCost() - b.getCost();
		}
	}
	
	
	
}
