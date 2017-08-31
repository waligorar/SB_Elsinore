package com.sb.recipe;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "YEAST")
public class Yeast {
	private String Name = null;
	private Integer Version = 0;
	private String Type = null;
	private String Form = null;
	private float Amount = 0.0f;
	private String AmountIsWeight = null;
	private String Laboratory = null;
	private String ProductId = null;
	private float MinTemperature = 0.0f;
	private float MaxTemperature = 0.0f;
	private String Flocculation = null;
	private float Attenuation = 0.0f;
	private String Notes = null;
	private String BestFor = null;
	private Integer MaxReuse = 0;
	private Integer TimesCultured = 0;
	private String AddToSecondary = null;
	private String DisplayAmount = null;
	private String DispMinTemp = null;
	private String DispMaxTemp = null;
	private String Inventory = null;
	private String CultureDate = null;

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

	public String getForm() {
		return Form;
	}

	@XmlElement(name = "FORM")
	public void setForm(String form) {
		Form = form;
	}

	public float getAmount() {
		return Amount;
	}

	@XmlElement(name = "AMOUNT")
	public void setAmount(float amount) {
		Amount = amount;
	}

	public String getAmountIsWeight() {
		return AmountIsWeight;
	}

	@XmlElement(name = "AMOUNT_IS_WEIGHT")
	public void setAmountIsWeight(String amountIsWeight) {
		AmountIsWeight = amountIsWeight;
	}

	public String getLaboratory() {
		return Laboratory;
	}

	@XmlElement(name = "LABORATORY")
	public void setLaboratory(String laboratory) {
		Laboratory = laboratory;
	}

	public String getProductId() {
		return ProductId;
	}

	@XmlElement(name = "PRODUCT_ID")
	public void setProductId(String productId) {
		ProductId = productId;
	}

	public float getMinTemperature() {
		return MinTemperature;
	}

	@XmlElement(name = "MIN_TEMPERATURE")
	public void setMinTemperature(float minTemperature) {
		MinTemperature = minTemperature;
	}

	public float getMaxTemperature() {
		return MaxTemperature;
	}

	@XmlElement(name = "MAX_TEMPERATURE")
	public void setMaxTemperature(float maxTemperature) {
		MaxTemperature = maxTemperature;
	}

	public String getFlocculation() {
		return Flocculation;
	}

	@XmlElement(name = "FLOCCULATION")
	public void setFlocculation(String flocculation) {
		Flocculation = flocculation;
	}

	public float getAttenuation() {
		return Attenuation;
	}

	@XmlElement(name = "ATTENUATION")
	public void setAttenuation(float attenuation) {
		Attenuation = attenuation;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name = "NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getBestFor() {
		return BestFor;
	}

	@XmlElement(name = "BEST_FOR")
	public void setBestFor(String bestFor) {
		BestFor = bestFor;
	}

	public Integer getMaxReuse() {
		return MaxReuse;
	}

	@XmlElement(name = "MAX_REUSE")
	public void setMaxReuse(Integer maxReuse) {
		MaxReuse = maxReuse;
	}

	public Integer getTimesCultured() {
		return TimesCultured;
	}

	@XmlElement(name = "TIMES_CULTURED")
	public void setTimesCultured(Integer timesCultured) {
		TimesCultured = timesCultured;
	}

	public String getAddToSecondary() {
		return AddToSecondary;
	}

	@XmlElement(name = "ADD_TO_SECONDARY")
	public void setAddToSecondary(String addToSecondary) {
		AddToSecondary = addToSecondary;
	}

	public String getDisplayAmount() {
		return DisplayAmount;
	}

	@XmlElement(name = "DISPLAY_AMOUNT")
	public void setDisplayAmount(String displayAmount) {
		DisplayAmount = displayAmount;
	}

	public String getDispMinTemp() {
		return DispMinTemp;
	}

	@XmlElement(name = "DISP_MIN_TEMP")
	public void setDispMinTemp(String dispMinTemp) {
		DispMinTemp = dispMinTemp;
	}

	public String getDispMaxTemp() {
		return DispMaxTemp;
	}

	@XmlElement(name = "DISP_MAX_TEMP")
	public void setDispMaxTemp(String dispMaxTemp) {
		DispMaxTemp = dispMaxTemp;
	}

	public String getInventory() {
		return Inventory;
	}

	@XmlElement(name = "INVENTORY")
	public void setInventory(String inventory) {
		Inventory = inventory;
	}

	public String getCultureDate() {
		return CultureDate;
	}

	@XmlElement(name = "CULTURE_DATE")
	public void setCultureDate(String cultureDate) {
		CultureDate = cultureDate;
	}

}
