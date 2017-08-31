package com.sb.recipe;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "RECIPE")
public class Recipe {
	private String Name = null;
	private Integer Version = 0;
	private String Type = null;
	private String Brewer = null;
	private String AsstBrewer = null;
	private float BatchSize = 0.0f;
	private float BoilSize = 0.0f;
	private float BoilTime = 0.0f;
	private float Efficiency = 0.0f;
	private String Notes = null;
	private String TasteNotes = null;
	private float TasteRating = 0.0f;
	private float OriginalGravity = 0.0f;
	private float FinalGravity = 0.0f;
	private float Carbonation = 0.0f;
	private Integer FermentationStages = 0;
	private float PrimaryAge = 0.0f;
	private float PrimaryTemp = 0.0f;
	private float SecondaryAge = 0.0f;
	private float SecondaryTemp = 0.0f;
	private float TertiaryAge = 0.0f;
	private float Age = 0.0f;
	private float AgeTemp = 0.0f;
	private String CarbonationUsed = null;
	private String ForcedCarbonation = null;
	private String PrimingSugarName = null;
	private float PrimingSugarEquiv = 0.0f;
	private float KegPrimingFactor = 0.0f;
	private float CarbonationTemp = 0.0f;
	private String DisplayCarbTemp = null;
	private String RecipeDate = null;
	private String EstimatedOriginalGravity = null;
	private String EstimatedFinalGravity = null;
	private String EstimatedColor = null;
	private String IBU = null;
	private String IBUMethod = null;
	private String EstimatedABV = null;
	private String ABV = null;
	private String ActualEfficiency = null;
	private String Calories = null;
	private String DisplayBatchSize = null;
	private String DisplayBoilSize = null;
	private String DisplayOriginalGravity = null;
	private String DisplayFinalGravity = null;
	private String DisplayPrimaryTemp = null;
	private String DisplaySecondaryTemp = null;
	private String DisplayTertiaryTemp = null;
	private String DisplayAgeTemp = null;
	private Hops hops = null; 
	private Fermentables fermentables = null; 
	
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
	
	public String getBrewer() {
		return Brewer;
	}
	
	@XmlElement(name="BREWER")
	public void setBrewer(String brewer) {
		Brewer = brewer;
	}
	
	public String getAsstBrewer() {
		return AsstBrewer;
	}
	
	@XmlElement(name="ASST_BREWER")
	public void setAsstBrewer(String asstBrewer) {
		AsstBrewer = asstBrewer;
	}
	
	public float getBatchSize() {
		return BatchSize;
	}
	
	@XmlElement(name="BATCH_SIZE")
	public void setBatchSize(float batchSize) {
		BatchSize = batchSize;
	}
	
	public float getBoilSize() {
		return BoilSize;
	}
	
	@XmlElement(name="BOIL_SIZE")
	public void setBoilSize(float boilSize) {
		BoilSize = boilSize;
	}
	
	public float getBoilTime() {
		return BoilTime;
	}
	
	@XmlElement(name="BOIL_TIME")
	public void setBoilTime(float boilTime) {
		BoilTime = boilTime;
	}
	
	public float getEfficiency() {
		return Efficiency;
	}
	
	@XmlElement(name="EFFICIENCY")
	public void setEfficiency(float efficiency) {
		Efficiency = efficiency;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name="NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getTasteNotes() {
		return TasteNotes;
	}

	@XmlElement(name="TASTE_NOTES")
	public void setTasteNotes(String tasteNotes) {
		TasteNotes = tasteNotes;
	}

	public float getTasteRating() {
		return TasteRating;
	}

	@XmlElement(name="TASTE_RATING")
	public void setTasteRating(float tasteRating) {
		TasteRating = tasteRating;
	}

	public float getOriginalGravity() {
		return OriginalGravity;
	}

	@XmlElement(name="OG")
	public void setOriginalGravity(float originalGravity) {
		OriginalGravity = originalGravity;
	}

	public float getFinalGravity() {
		return FinalGravity;
	}

	@XmlElement(name="FG")
	public void setFinalGravity(float finalGravity) {
		FinalGravity = finalGravity;
	}

	public float getCarbonation() {
		return Carbonation;
	}

	@XmlElement(name="CARBONATION")
	public void setCarbonation(float carbonation) {
		Carbonation = carbonation;
	}

	public Integer getFermentationStages() {
		return FermentationStages;
	}

	@XmlElement(name="FERMENTATION_STAGES")
	public void setFermentationStages(Integer fermentationStages) {
		FermentationStages = fermentationStages;
	}

	public float getPrimaryAge() {
		return PrimaryAge;
	}

	@XmlElement(name="PRIMARY_AGE")
	public void setPrimaryAge(float primaryAge) {
		PrimaryAge = primaryAge;
	}

	public float getPrimaryTemp() {
		return PrimaryTemp;
	}

	@XmlElement(name="PRIMARY_TEMP")
	public void setPrimaryTemp(float primaryTemp) {
		PrimaryTemp = primaryTemp;
	}

	public float getSecondaryAge() {
		return SecondaryAge;
	}

	@XmlElement(name="SECONDARY_AGE")
	public void setSecondaryAge(float secondaryAge) {
		SecondaryAge = secondaryAge;
	}

	public float getSecondaryTemp() {
		return SecondaryTemp;
	}

	@XmlElement(name="SECONDARY_TEMP")
	public void setSecondaryTemp(float secondaryTemp) {
		SecondaryTemp = secondaryTemp;
	}

	public float getTertiaryAge() {
		return TertiaryAge;
	}

	@XmlElement(name="TERTIARY_AGE")
	public void setTertiaryAge(float tertiaryAge) {
		TertiaryAge = tertiaryAge;
	}

	public float getAge() {
		return Age;
	}

	@XmlElement(name="AGE")
	public void setAge(float age) {
		Age = age;
	}

	public float getAgeTemp() {
		return AgeTemp;
	}

	@XmlElement(name="AGE_TEMP")
	public void setAgeTemp(float ageTemp) {
		AgeTemp = ageTemp;
	}

	public String getCarbonationUsed() {
		return CarbonationUsed;
	}

	@XmlElement(name="CARBONATION_USED")
	public void setCarbonationUsed(String carbonationUsed) {
		CarbonationUsed = carbonationUsed;
	}

	public String getForcedCarbonation() {
		return ForcedCarbonation;
	}

	@XmlElement(name="FORCED_CARBONATION")
	public void setForcedCarbonation(String forcedCarbonation) {
		ForcedCarbonation = forcedCarbonation;
	}

	public String getPrimingSugarName() {
		return PrimingSugarName;
	}

	@XmlElement(name="PRIMING_SUGAR_NAME")
	public void setPrimingSugarName(String primingSugarName) {
		PrimingSugarName = primingSugarName;
	}

	public float getPrimingSugarEquiv() {
		return PrimingSugarEquiv;
	}

	@XmlElement(name="PRIMING_SUGAR_EQUIV")
	public void setPrimingSugarEquiv(float primingSugarEquiv) {
		PrimingSugarEquiv = primingSugarEquiv;
	}

	public float getKegPrimingFactor() {
		return KegPrimingFactor;
	}

	@XmlElement(name="KEG_PRIMING_FACTOR")
	public void setKegPrimingFactor(float kegPrimingFactor) {
		KegPrimingFactor = kegPrimingFactor;
	}

	public float getCarbonationTemp() {
		return CarbonationTemp;
	}

	@XmlElement(name="CARBONATION_TEMP")
	public void setCarbonationTemp(float carbonationTemp) {
		CarbonationTemp = carbonationTemp;
	}

	public String getDisplayCarbTemp() {
		return DisplayCarbTemp;
	}

	@XmlElement(name="DISPLAY_CARB_TEMP")
	public void setDisplayCarbTemp(String displayCarbTemp) {
		DisplayCarbTemp = displayCarbTemp;
	}

	public String getRecipeDate() {
		return RecipeDate;
	}

	@XmlElement(name="DATE")
	public void setRecipeDate(String recipeDate) {
		RecipeDate = recipeDate;
	}

	public String getEstimatedOriginalGravity() {
		return EstimatedOriginalGravity;
	}

	@XmlElement(name="EST_OG")
	public void setEstimatedOriginalGravity(String estimatedOriginalGravity) {
		EstimatedOriginalGravity = estimatedOriginalGravity;
	}

	public String getEstimatedFinalGravity() {
		return EstimatedFinalGravity;
	}

	@XmlElement(name="EST_FG")
	public void setEstimatedFinalGravity(String estimatedFinalGravity) {
		EstimatedFinalGravity = estimatedFinalGravity;
	}

	public String getEstimatedColor() {
		return EstimatedColor;
	}

	@XmlElement(name="EST_COLOR")
	public void setEstimatedColor(String estimatedColor) {
		EstimatedColor = estimatedColor;
	}

	public String getIBU() {
		return IBU;
	}

	@XmlElement(name="IBU")
	public void setIBU(String iBU) {
		IBU = iBU;
	}

	public String getIBUMethod() {
		return IBUMethod;
	}

	@XmlElement(name="IBU_METHOD")
	public void setIBUMethod(String iBUMethod) {
		IBUMethod = iBUMethod;
	}

	public String getEstimatedABV() {
		return EstimatedABV;
	}

	@XmlElement(name="EST_ABV")
	public void setEstimatedABV(String estimatedABV) {
		EstimatedABV = estimatedABV;
	}

	public String getABV() {
		return ABV;
	}

	@XmlElement(name="ABV")
	public void setABV(String aBV) {
		ABV = aBV;
	}

	public String getActualEfficiency() {
		return ActualEfficiency;
	}

	@XmlElement(name="ACTUAL_EFFICIENCY")
	public void setActualEfficiency(String actualEfficiency) {
		ActualEfficiency = actualEfficiency;
	}

	public String getCalories() {
		return Calories;
	}

	@XmlElement(name="CALORIES")
	public void setCalories(String calories) {
		Calories = calories;
	}

	public String getDisplayBatchSize() {
		return DisplayBatchSize;
	}

	@XmlElement(name="DISPLAY_BATCH_SIZE")
	public void setDisplayBatchSize(String displayBatchSize) {
		DisplayBatchSize = displayBatchSize;
	}

	public String getDisplayBoilSize() {
		return DisplayBoilSize;
	}

	@XmlElement(name="DISPLAY_BOIL_SIZE")
	public void setDisplayBoilSize(String displayBoilSize) {
		DisplayBoilSize = displayBoilSize;
	}

	public String getDisplayOriginalGravity() {
		return DisplayOriginalGravity;
	}

	@XmlElement(name="DISPLAY_OG")
	public void setDisplayOriginalGravity(String displayOriginalGravity) {
		DisplayOriginalGravity = displayOriginalGravity;
	}

	public String getDisplayFinalGravity() {
		return DisplayFinalGravity;
	}

	@XmlElement(name="DISPLAY_FG")
	public void setDisplayFinalGravity(String displayFinalGravity) {
		DisplayFinalGravity = displayFinalGravity;
	}

	public String getDisplayPrimaryTemp() {
		return DisplayPrimaryTemp;
	}

	@XmlElement(name="DISPLAY_PRIMARY_TEMP")
	public void setDisplayPrimaryTemp(String displayPrimaryTemp) {
		DisplayPrimaryTemp = displayPrimaryTemp;
	}

	public String getDisplaySecondaryTemp() {
		return DisplaySecondaryTemp;
	}

	@XmlElement(name="DISPLAY_SECONDARY_TEMP")
	public void setDisplaySecondaryTemp(String displaySecondaryTemp) {
		DisplaySecondaryTemp = displaySecondaryTemp;
	}

	public String getDisplayTertiaryTemp() {
		return DisplayTertiaryTemp;
	}

	@XmlElement(name="DISPLAY_TERTIARY_TEMP")
	public void setDisplayTertiaryTemp(String displayTertiaryTemp) {
		DisplayTertiaryTemp = displayTertiaryTemp;
	}

	public String getDisplayAgeTemp() {
		return DisplayAgeTemp;
	}

	@XmlElement(name="DISPLAY_AGE_TEMP")
	public void setDisplayAgeTemp(String displayAgeTemp) {
		DisplayAgeTemp = displayAgeTemp;
	}

	public Hops getHops() {
		return hops;
	}

	@XmlElement(name="HOPS")
	public void setHops(Hops hops) {
		this.hops = hops;
	}

	public Fermentables getFermentables() {
		return fermentables;
	}

	@XmlElement(name="FERMENTABLES")
	public void setFermentables(Fermentables fermentables) {
		this.fermentables = fermentables;
	}

}
