package com.sb.recipe;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HOP")
public class Hop {
	private String Name = null;
	private Integer Version = 0;
	private String Origin = null;
	private float Alpha = 0.0f;
	private float Amount = 0.0f;
	private String Use = null;
	private float Time = 0.0f;
	private String Notes = null;
	private String Type = null;
	private String Form = null;
	private float Beta = 0.0f;
	private float HSI = 0.0f;
	private String DisplayAmount = null;
	private String Inventory = null;
	private String DisplayTime = null;

	public String getName() {
		return Name;
	}

	@XmlElement(name="NAME")
	public void setName(String name) {
		Name = name;
	}

	public Integer getVersion() {
		return Version;
	}

	@XmlElement(name="VERSION")
	public void setVersion(Integer version) {
		Version = version;
	}

	public String getOrigin() {
		return Origin;
	}

	@XmlElement(name="ORIGIN")
	public void setOrigin(String origin) {
		Origin = origin;
	}

	public float getAlpha() {
		return Alpha;
	}

	@XmlElement(name="ALPHA")
	public void setAlpha(float alpha) {
		Alpha = alpha;
	}

	public float getAmount() {
		return Amount;
	}

	@XmlElement(name="AMOUNT")
	public void setAmount(float amount) {
		Amount = amount;
	}

	public String getUse() {
		return Use;
	}

	@XmlElement(name="USE")
	public void setUse(String use) {
		Use = use;
	}

	public float getTime() {
		return Time;
	}

	@XmlElement(name="TIME")
	public void setTime(float time) {
		Time = time;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name="NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getType() {
		return Type;
	}

	@XmlElement(name="TYPE")
	public void setType(String type) {
		Type = type;
	}

	public String getForm() {
		return Form;
	}

	@XmlElement(name="FORM")
	public void setForm(String form) {
		Form = form;
	}

	public float getBeta() {
		return Beta;
	}

	@XmlElement(name="BETA")
	public void setBeta(float beta) {
		Beta = beta;
	}

	public float getHSI() {
		return HSI;
	}

	@XmlElement(name="HSI")
	public void setHSI(float hSI) {
		HSI = hSI;
	}

	public String getDisplayAmount() {
		return DisplayAmount;
	}

	@XmlElement(name="DISPLAY_AMOUNT")
	public void setDisplayAmount(String displayAmount) {
		DisplayAmount = displayAmount;
	}

	public String getInventory() {
		return Inventory;
	}

	@XmlElement(name="INVENTORY")
	public void setInventory(String inventory) {
		Inventory = inventory;
	}

	public String getDisplayTime() {
		return DisplayTime;
	}

	@XmlElement(name="DISPLAY_TIME")
	public void setDisplayTime(String displayTime) {
		DisplayTime = displayTime;
	}

}
