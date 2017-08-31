package com.sb.recipe;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "MASH")
public class Mash {
	private String Name = null;
	private Integer Version = 0;
	private float GrainTemp = 0.0f;
	private float TunTemp = 0.0f;
	private float SpargeTemp = 0.0f;
	private float PH = 0.0f;
	private float TunWeight = 0.0f;
	private float TunSpecificHeat = 0.0f;
	private String EquipAdjust = null;
	private String Notes = null;
	private String DisplayGrainTemp = null;
	private String DisplayTunTemp = null;
	private String DisplaySpargeTemp = null;
	private String DisplayTunWeight = null;
	private MashSteps mashSteps = null;

	public String getName() {
		return Name;
	}

	@XmlElement(name = "NAME")
	public void setName(String name) {
		Name = name;
	}

	public Integer getVersion() {
		return Version;
	}

	@XmlElement(name = "VERSION")
	public void setVersion(Integer version) {
		Version = version;
	}

	public float getGrainTemp() {
		return GrainTemp;
	}

	@XmlElement(name = "GRAIN_TEMP")
	public void setGrainTemp(float grainTemp) {
		GrainTemp = grainTemp;
	}

	public float getTunTemp() {
		return TunTemp;
	}

	@XmlElement(name = "TUN_TEMP")
	public void setTunTemp(float tunTemp) {
		TunTemp = tunTemp;
	}

	public float getSpargeTemp() {
		return SpargeTemp;
	}

	@XmlElement(name = "SPARGE_TEMP")
	public void setSpargeTemp(float spargeTemp) {
		SpargeTemp = spargeTemp;
	}

	public float getPH() {
		return PH;
	}

	@XmlElement(name = "PH")
	public void setPH(float pH) {
		PH = pH;
	}

	public float getTunWeight() {
		return TunWeight;
	}

	@XmlElement(name = "TUN_WEIGHT")
	public void setTunWeight(float tunWeight) {
		TunWeight = tunWeight;
	}

	public float getTunSpecificHeat() {
		return TunSpecificHeat;
	}

	@XmlElement(name = "TUN_SPECIFIC_HEAT")
	public void setTunSpecificHeat(float tunSpecificHeat) {
		TunSpecificHeat = tunSpecificHeat;
	}

	public String getEquipAdjust() {
		return EquipAdjust;
	}

	@XmlElement(name = "EQUIP_ADJUST")
	public void setEquipAdjust(String equipAdjust) {
		EquipAdjust = equipAdjust;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name = "NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getDisplayGrainTemp() {
		return DisplayGrainTemp;
	}

	@XmlElement(name = "DISPLAY_GRAIN_TEMP")
	public void setDisplayGrainTemp(String displayGrainTemp) {
		DisplayGrainTemp = displayGrainTemp;
	}

	public String getDisplayTunTemp() {
		return DisplayTunTemp;
	}

	@XmlElement(name = "DISPLAY_TUN_TEMP")
	public void setDisplayTunTemp(String displayTunTemp) {
		DisplayTunTemp = displayTunTemp;
	}

	public String getDisplaySpargeTemp() {
		return DisplaySpargeTemp;
	}

	@XmlElement(name = "DISPLAY_SPARGE_TEMP")
	public void setDisplaySpargeTemp(String displaySpargeTemp) {
		DisplaySpargeTemp = displaySpargeTemp;
	}

	public String getDisplayTunWeight() {
		return DisplayTunWeight;
	}

	@XmlElement(name = "DISPLAY_TUN_WEIGHT")
	public void setDisplayTunWeight(String displayTunWeight) {
		DisplayTunWeight = displayTunWeight;
	}

	public MashSteps getMashSteps() {
		return mashSteps;
	}

	@XmlElement(name = "MASH_STEPS")
	public void setMashSteps(MashSteps mashSteps) {
		this.mashSteps = mashSteps;
	}

}
