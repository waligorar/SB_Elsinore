package com.sb.recipe;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MASH_STEP")
public class MashStep {
	private String Name = null;
	private Integer Version = 0;
	private String Type = null;
	private float InfuseAmount = 0.0f;
	private float StepTime = 0.0f;
	private float StepTemp = 0.0f;
	private float RampTime = 0.0f;
	private float EndTime = 0.0f;
	private String Description = null;
	private String WaterGrainRatio = null;
	private String DecoctionAmt = null;
	private String InfuseTemp = null;
	private String DisplayStepTemp = null;
	private String DisplayInfuseAmt = null;

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

	public String getType() {
		return Type;
	}

	@XmlElement(name = "TYPE")
	public void setType(String type) {
		Type = type;
	}

	public float getInfuseAmount() {
		return InfuseAmount;
	}

	@XmlElement(name = "INFUSE_AMOUNT")
	public void setInfuseAmount(float infuseAmount) {
		InfuseAmount = infuseAmount;
	}

	public float getStepTime() {
		return StepTime;
	}

	@XmlElement(name = "STEP_TIME")
	public void setStepTime(float stepTime) {
		StepTime = stepTime;
	}

	public float getStepTemp() {
		return StepTemp;
	}

	@XmlElement(name = "STEP_TEMP")
	public void setStepTemp(float stepTemp) {
		StepTemp = stepTemp;
	}

	public float getRampTime() {
		return RampTime;
	}

	@XmlElement(name = "RAMP_TIME")
	public void setRampTime(float rampTime) {
		RampTime = rampTime;
	}

	public float getEndTime() {
		return EndTime;
	}

	@XmlElement(name = "END_TEMP")
	public void setEndTime(float endTime) {
		EndTime = endTime;
	}

	public String getDescription() {
		return Description;
	}

	@XmlElement(name = "DESCRIPTION")
	public void setDescription(String description) {
		Description = description;
	}

	public String getWaterGrainRatio() {
		return WaterGrainRatio;
	}

	@XmlElement(name = "WATER_GRAIN_RATIO")
	public void setWaterGrainRatio(String waterGrainRatio) {
		WaterGrainRatio = waterGrainRatio;
	}

	public String getDecoctionAmt() {
		return DecoctionAmt;
	}

	@XmlElement(name = "DECOCTION_AMT")
	public void setDecoctionAmt(String decoctionAmt) {
		DecoctionAmt = decoctionAmt;
	}

	public String getInfuseTemp() {
		return InfuseTemp;
	}

	@XmlElement(name = "INFUSE_TEMP")
	public void setInfuseTemp(String infuseTemp) {
		InfuseTemp = infuseTemp;
	}

	public String getDisplayStepTemp() {
		return DisplayStepTemp;
	}

	@XmlElement(name = "DISPLAY_STEP_TEMP")
	public void setDisplayStepTemp(String displayStepTemp) {
		DisplayStepTemp = displayStepTemp;
	}

	public String getDisplayInfuseAmt() {
		return DisplayInfuseAmt;
	}

	@XmlElement(name = "DISPLAY_INFUSE_AMT")
	public void setDisplayInfuseAmt(String displayInfuseAmt) {
		DisplayInfuseAmt = displayInfuseAmt;
	}

}
