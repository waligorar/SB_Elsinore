package com.sb.recipe;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "EQUIPMENT")
public class Equipment {
	private String Name = null;
	private Integer Version = 0;
	private float BoilSize = 0.0f;
	private float BatchSize = 0.0f;
	private float TunVolume = 0.0f;
	private float TunWeigth = 0.0f;
	private float TunSpecificHeat = 0.0f;
	private float TopUpWater = 0.0f;
	private float TrubChillerLoss = 0.0f;
	private float EvapRate = 0.0f;
	private float BoilTime = 0.0f;
	private String CalcBoilVolume = null;
	private float LauterDeadspace = 0.0f;
	private float TopUpKettle = 0.0f;
	private float HopUtilization = 0.0f;
	private float CoolingLossPct = 0.0f;
	private String Notes = null;
	private String DisplayBoilSize = null;
	private String DisplayBatchSize = null;
	private String DisplayTunVolume = null;
	private String DisplayTunWeight = null;
	private String DisplayTopUpWater = null;
	private String DisplayTrubChillerLoss = null;
	private String DisplayLauterDeadspace = null;
	private String DisplayTopUpKettle = null;

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

	public float getBoilSize() {
		return BoilSize;
	}

	@XmlElement(name = "BOIL_SIZE")
	public void setBoilSize(float boilSize) {
		BoilSize = boilSize;
	}

	public float getBatchSize() {
		return BatchSize;
	}

	@XmlElement(name = "BATCH_SIZE")
	public void setBatchSize(float batchSize) {
		BatchSize = batchSize;
	}

	public float getTunVolume() {
		return TunVolume;
	}

	@XmlElement(name = "TUN_VOLUME")
	public void setTunVolume(float tunVolume) {
		TunVolume = tunVolume;
	}

	public float getTunWeigth() {
		return TunWeigth;
	}

	@XmlElement(name = "TUN_WEIGHT")
	public void setTunWeigth(float tunWeigth) {
		TunWeigth = tunWeigth;
	}

	public float getTunSpecificHeat() {
		return TunSpecificHeat;
	}

	@XmlElement(name = "TUN_SPECIFIC_HEAT")
	public void setTunSpecificHeat(float tunSpecificHeat) {
		TunSpecificHeat = tunSpecificHeat;
	}

	public float getTopUpWater() {
		return TopUpWater;
	}

	@XmlElement(name = "TOP_UP_WATER")
	public void setTopUpWater(float topUpWater) {
		TopUpWater = topUpWater;
	}

	public float getTrubChillerLoss() {
		return TrubChillerLoss;
	}

	@XmlElement(name = "TRUB_CHILLER_LOSS")
	public void setTrubChillerLoss(float trubChillerLoss) {
		TrubChillerLoss = trubChillerLoss;
	}

	public float getEvapRate() {
		return EvapRate;
	}

	@XmlElement(name = "EVAP_RATE")
	public void setEvapRate(float evapRate) {
		EvapRate = evapRate;
	}

	public float getBoilTime() {
		return BoilTime;
	}

	@XmlElement(name = "BOIL_TIME")
	public void setBoilTime(float boilTime) {
		BoilTime = boilTime;
	}

	public String getCalcBoilVolume() {
		return CalcBoilVolume;
	}

	@XmlElement(name = "CALC_BOIL_VOLUME")
	public void setCalcBoilVolume(String calcBoilVolume) {
		CalcBoilVolume = calcBoilVolume;
	}

	public float getLauterDeadspace() {
		return LauterDeadspace;
	}

	@XmlElement(name = "LAUTER_DEADSPACE")
	public void setLauterDeadspace(float lauterDeadspace) {
		LauterDeadspace = lauterDeadspace;
	}

	public float getTopUpKettle() {
		return TopUpKettle;
	}

	@XmlElement(name = "TOP_UP_KETTLE")
	public void setTopUpKettle(float topUpKettle) {
		TopUpKettle = topUpKettle;
	}

	public float getHopUtilization() {
		return HopUtilization;
	}

	@XmlElement(name = "HOP_UTILIZATION")
	public void setHopUtilization(float hopUtilization) {
		HopUtilization = hopUtilization;
	}

	public float getCoolingLossPct() {
		return CoolingLossPct;
	}

	@XmlElement(name = "COOLING_LOSS_PCT")
	public void setCoolingLossPct(float coolingLossPct) {
		CoolingLossPct = coolingLossPct;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name = "NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getDisplayBoilSize() {
		return DisplayBoilSize;
	}

	@XmlElement(name = "DISPLAY_BOIL_SIZE")
	public void setDisplayBoilSize(String displayBoilSize) {
		DisplayBoilSize = displayBoilSize;
	}

	public String getDisplayBatchSize() {
		return DisplayBatchSize;
	}

	@XmlElement(name = "DISPLAY_BATCH_SIZE")
	public void setDisplayBatchSize(String displayBatchSize) {
		DisplayBatchSize = displayBatchSize;
	}

	public String getDisplayTunVolume() {
		return DisplayTunVolume;
	}

	@XmlElement(name = "DISPLAY_TUN_VOLUME")
	public void setDisplayTunVolume(String displayTunVolume) {
		DisplayTunVolume = displayTunVolume;
	}

	public String getDisplayTunWeight() {
		return DisplayTunWeight;
	}

	@XmlElement(name = "DISPLAY_TUN_WEIGHT")
	public void setDisplayTunWeight(String displayTunWeight) {
		DisplayTunWeight = displayTunWeight;
	}

	public String getDisplayTopUpWater() {
		return DisplayTopUpWater;
	}

	@XmlElement(name = "DISPLAY_TOP_UP_WATER")
	public void setDisplayTopUpWater(String displayTopUpWater) {
		DisplayTopUpWater = displayTopUpWater;
	}

	public String getDisplayTrubChillerLoss() {
		return DisplayTrubChillerLoss;
	}

	@XmlElement(name = "DISPLAY_TRUB_CHILLER_LOSS")
	public void setDisplayTrubChillerLoss(String displayTrubChillerLoss) {
		DisplayTrubChillerLoss = displayTrubChillerLoss;
	}

	public String getDisplayLauterDeadspace() {
		return DisplayLauterDeadspace;
	}

	@XmlElement(name = "DISPLAY_LAUTER_DEADSPACE")
	public void setDisplayLauterDeadspace(String displayLauterDeadspace) {
		DisplayLauterDeadspace = displayLauterDeadspace;
	}

	public String getDisplayTopUpKettle() {
		return DisplayTopUpKettle;
	}

	@XmlElement(name = "DISPLAY_TOP_UP_KETTLE")
	public void setDisplayTopUpKettle(String displayTopUpKettle) {
		DisplayTopUpKettle = displayTopUpKettle;
	}

}
