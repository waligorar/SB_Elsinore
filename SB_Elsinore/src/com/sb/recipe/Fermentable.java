package com.sb.recipe;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FERMENTABLE")
public class Fermentable {
	private String Name = null;
	private Integer Version = 0;
	private String Type = null;
	private float Amount = 0.0f;
	private float Yield = 0.0f;
	private float Color = 0.0f;
	private String AddAfterBoil = null;
	private String Origin = null;
	private String Supplier = null;
	private String Notes = null;
	private float CoarseFineDiff = 0.0f;
	private float Moisture = 0.0f;
	private float DiastaticPower = 0.0f;
	private float Protein = 0.0f;
	private float MaxInBatch = 0.0f;
	private String RecommendMash = null;
	private float IbuGalPerLb = 0.0f;
	private String DisplayAmount = null;
	private String Inventory = null;
	private float Potential = 0.0f;
	private String DisplayColor = null;
	private String ExtractSubstitute = null;

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

	public String getType() {
		return Type;
	}

	@XmlElement(name="TYPE")
	public void setType(String type) {
		Type = type;
	}

	public float getAmount() {
		return Amount;
	}

	@XmlElement(name="AMOUNT")
	public void setAmount(float amount) {
		Amount = amount;
	}

	public float getYield() {
		return Yield;
	}

	@XmlElement(name="YIELD")
	public void setYield(float yield) {
		Yield = yield;
	}

	public float getColor() {
		return Color;
	}

	@XmlElement(name="COLOR")
	public void setColor(float color) {
		Color = color;
	}

	public String getAddAfterBoil() {
		return AddAfterBoil;
	}

	@XmlElement(name="ADD_AFTER_BOIL")
	public void setAddAfterBoil(String addAfterBoil) {
		AddAfterBoil = addAfterBoil;
	}

	public String getOrigin() {
		return Origin;
	}

	@XmlElement(name="ORIGIN")
	public void setOrigin(String origin) {
		Origin = origin;
	}

	public String getSupplier() {
		return Supplier;
	}

	@XmlElement(name="SUPPLIER")
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name="NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public float getCoarseFineDiff() {
		return CoarseFineDiff;
	}

	@XmlElement(name="COARSE_FINE_DIFF")
	public void setCoarseFineDiff(float coarseFineDiff) {
		CoarseFineDiff = coarseFineDiff;
	}

	public float getMoisture() {
		return Moisture;
	}

	@XmlElement(name="MOISTURE")
	public void setMoisture(float moisture) {
		Moisture = moisture;
	}

	public float getDiastaticPower() {
		return DiastaticPower;
	}

	@XmlElement(name="DIASTATIC_POWER")
	public void setDiastaticPower(float diastaticPower) {
		DiastaticPower = diastaticPower;
	}

	public float getProtein() {
		return Protein;
	}

	@XmlElement(name="PROTEIN")
	public void setProtein(float protein) {
		Protein = protein;
	}

	public float getMaxInBatch() {
		return MaxInBatch;
	}

	@XmlElement(name="MAX_IN_BATCH")
	public void setMaxInBatch(float maxInBatch) {
		MaxInBatch = maxInBatch;
	}

	public String getRecommendMash() {
		return RecommendMash;
	}

	@XmlElement(name="RECOMMEND_MASH")
	public void setRecommendMash(String recommendMash) {
		RecommendMash = recommendMash;
	}

	public float getIbuGalPerLb() {
		return IbuGalPerLb;
	}

	@XmlElement(name="IBU_GAL_PER_LB")
	public void setIbuGalPerLb(float ibuGalPerLb) {
		IbuGalPerLb = ibuGalPerLb;
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

	public float getPotential() {
		return Potential;
	}

	@XmlElement(name="POTENTIAL")
	public void setPotential(float potential) {
		Potential = potential;
	}

	public String getDisplayColor() {
		return DisplayColor;
	}

	@XmlElement(name="DISPLAY_COLOR")
	public void setDisplayColor(String displayColor) {
		DisplayColor = displayColor;
	}

	public String getExtractSubstitute() {
		return ExtractSubstitute;
	}

	@XmlElement(name="EXTRACT_SUBSTITUTE")
	public void setExtractSubstitute(String extractSubstitute) {
		ExtractSubstitute = extractSubstitute;
	}
	
}
