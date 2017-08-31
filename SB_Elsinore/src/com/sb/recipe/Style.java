package com.sb.recipe;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "STYLE")
public class Style {
	private String Name = null;
	private Integer Version = 0;
	private String Category = null;
	private Integer CategoryNumber = 0;
	private String StyleLetter = null;
	private String StyleGuide = null;
	private String Type = null;
	private float OGMin = 0.0f;
	private float OGMax = 0.0f;
	private float FGMin = 0.0f;
	private float FGMax = 0.0f;
	private float IBUMin = 0.0f;
	private float IBUMax = 0.0f;
	private float ColorMin = 0.0f;
	private float ColorMax = 0.0f;
	private float CarbMin = 0.0f;
	private float CarbMax = 0.0f;
	private float ABVMax = 0.0f;
	private float ABVMin = 0.0f;
	private String Notes = null;
	private String Profile = null;
	private String Ingredients = null;
	private String Examples = null;
	private String DisplayOGMin = null;
	private String DisplayOGMax = null;
	private String DisplayFGMin = null;
	private String DisplayFGMax = null;
	private String DisplayColorMin = null;
	private String DisplayColorMax = null;
	private String OGRange = null;
	private String FGRange = null;
	private String IBURange = null;
	private String CarbRange = null;
	private String ColorRange = null;
	private String ABVRange = null;

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

	public String getCategory() {
		return Category;
	}

	@XmlElement(name = "CATEGORY")
	public void setCategory(String category) {
		Category = category;
	}

	public Integer getCategoryNumber() {
		return CategoryNumber;
	}

	@XmlElement(name = "CATEGORY_NUMBER")
	public void setCategoryNumber(Integer categoryNumber) {
		CategoryNumber = categoryNumber;
	}

	public String getStyleLetter() {
		return StyleLetter;
	}

	@XmlElement(name = "STYLE_LETTER")
	public void setStyleLetter(String styleLetter) {
		StyleLetter = styleLetter;
	}

	public String getStyleGuide() {
		return StyleGuide;
	}

	@XmlElement(name = "STYLE_GUIDE")
	public void setStyleGuide(String styleGuide) {
		StyleGuide = styleGuide;
	}

	public String getType() {
		return Type;
	}

	@XmlElement(name = "TYPE")
	public void setType(String type) {
		Type = type;
	}

	public float getOGMin() {
		return OGMin;
	}

	@XmlElement(name = "OG_MIN")
	public void setOGMin(float oGMin) {
		OGMin = oGMin;
	}

	public float getOGMax() {
		return OGMax;
	}

	@XmlElement(name = "OG_MAX")
	public void setOGMax(float oGMax) {
		OGMax = oGMax;
	}

	public float getFGMin() {
		return FGMin;
	}

	@XmlElement(name = "FG_MIN")
	public void setFGMin(float fGMin) {
		FGMin = fGMin;
	}

	public float getFGMax() {
		return FGMax;
	}

	@XmlElement(name = "FG_MAX")
	public void setFGMax(float fGMax) {
		FGMax = fGMax;
	}

	public float getIBUMin() {
		return IBUMin;
	}

	@XmlElement(name = "IBU_MIN")
	public void setIBUMin(float iBUMin) {
		IBUMin = iBUMin;
	}

	public float getIBUMax() {
		return IBUMax;
	}

	@XmlElement(name = "IBU_MAX")
	public void setIBUMax(float iBUMax) {
		IBUMax = iBUMax;
	}

	public float getColorMin() {
		return ColorMin;
	}

	@XmlElement(name = "COLOR_MIN")
	public void setColorMin(float colorMin) {
		ColorMin = colorMin;
	}

	public float getColorMax() {
		return ColorMax;
	}

	@XmlElement(name = "COLOR_MAX")
	public void setColorMax(float colorMax) {
		ColorMax = colorMax;
	}

	public float getCarbMin() {
		return CarbMin;
	}

	@XmlElement(name = "CARB_MIN")
	public void setCarbMin(float carbMin) {
		CarbMin = carbMin;
	}

	public float getCarbMax() {
		return CarbMax;
	}

	@XmlElement(name = "CARB_MAX")
	public void setCarbMax(float carbMax) {
		CarbMax = carbMax;
	}

	public float getABVMax() {
		return ABVMax;
	}

	@XmlElement(name = "ABV_MAX")
	public void setABVMax(float aBVMax) {
		ABVMax = aBVMax;
	}

	public float getABVMin() {
		return ABVMin;
	}

	@XmlElement(name = "ABV_MIN")
	public void setABVMin(float aBVMin) {
		ABVMin = aBVMin;
	}

	public String getNotes() {
		return Notes;
	}

	@XmlElement(name = "NOTES")
	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getProfile() {
		return Profile;
	}

	@XmlElement(name = "PROFILE")
	public void setProfile(String profile) {
		Profile = profile;
	}

	public String getIngredients() {
		return Ingredients;
	}

	@XmlElement(name = "INGREDIENTS")
	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}

	public String getExamples() {
		return Examples;
	}

	@XmlElement(name = "EXAMPLES")
	public void setExamples(String examples) {
		Examples = examples;
	}

	public String getDisplayOGMin() {
		return DisplayOGMin;
	}

	@XmlElement(name = "DISPLAY_OG_MIN")
	public void setDisplayOGMin(String displayOGMin) {
		DisplayOGMin = displayOGMin;
	}

	public String getDisplayOGMax() {
		return DisplayOGMax;
	}

	@XmlElement(name = "DISPLAY_OG_MAX")
	public void setDisplayOGMax(String displayOGMax) {
		DisplayOGMax = displayOGMax;
	}

	public String getDisplayFGMin() {
		return DisplayFGMin;
	}

	@XmlElement(name = "DISPLAY_FG_MIN")
	public void setDisplayFGMin(String displayFGMin) {
		DisplayFGMin = displayFGMin;
	}

	public String getDisplayFGMax() {
		return DisplayFGMax;
	}

	@XmlElement(name = "DISPLAY_FG_MAX")
	public void setDisplayFGMax(String displayFGMax) {
		DisplayFGMax = displayFGMax;
	}

	public String getDisplayColorMin() {
		return DisplayColorMin;
	}

	@XmlElement(name = "DISPLAY_COLOR_MIN")
	public void setDisplayColorMin(String displayColorMin) {
		DisplayColorMin = displayColorMin;
	}

	public String getDisplayColorMax() {
		return DisplayColorMax;
	}

	@XmlElement(name = "DISPLAY_COLOR_MAX")
	public void setDisplayColorMax(String displayColorMax) {
		DisplayColorMax = displayColorMax;
	}

	public String getOGRange() {
		return OGRange;
	}

	@XmlElement(name = "OG_RANGE")
	public void setOGRange(String oGRange) {
		OGRange = oGRange;
	}

	public String getFGRange() {
		return FGRange;
	}

	@XmlElement(name = "FG_RANGE")
	public void setFGRange(String fGRange) {
		FGRange = fGRange;
	}

	public String getIBURange() {
		return IBURange;
	}

	@XmlElement(name = "IBU_RANGE")
	public void setIBURange(String iBURange) {
		IBURange = iBURange;
	}

	public String getCarbRange() {
		return CarbRange;
	}

	@XmlElement(name = "CARB_RANGE")
	public void setCarbRange(String carbRange) {
		CarbRange = carbRange;
	}

	public String getColorRange() {
		return ColorRange;
	}

	@XmlElement(name = "COLOR_RANGE")
	public void setColorRange(String colorRange) {
		ColorRange = colorRange;
	}

	public String getABVRange() {
		return ABVRange;
	}

	@XmlElement(name = "ABV_RANGE")
	public void setABVRange(String aBVRange) {
		ABVRange = aBVRange;
	}

}
