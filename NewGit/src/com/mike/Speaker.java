package com.mike;

public class Speaker {
	
	int driver_size = 12;
    String driver_name = "Eminence";
    String driver_model = "Kapalite 2512";
    int driver_RMSPower = 250;
    int driver_ProgramPower = 400;
    int driver_FreqResponseLow = 48;
    int driver_FreqResponseHigh = 4000;
    float driver_Sensitivity = 99.9f;
    float driver_VCDiameter = 2.5f;
    float driver_MagWeight = 7.0f;  // OZ
    float driver_NetWeight = 20.0f;  // lbs
    float driver_Price = 120.0f;  // dollars

    // TS params
    float driver_Fs = 1;    // Hz
    float driver_Re = 2;    // DC resistance Ohms
    float driver_Le	= 2.2f; // mh
    float driver_Qes= 3;
    float driver_Qms = 4;
    float driver_Qts = 5;
    float driver_Vas = 6;  // liters
    float driver_Vd = 7;   // cc
    float driver_Cms = 8;  //mm
    float driver_Sd = 9;  // cm2
    public float getDriver_Le() {
		return driver_Le;
	}
	public void setDriver_Le(float driver_Le) {
		this.driver_Le = driver_Le;
	}
	public float getDriver_Sd() {
		return driver_Sd;
	}
	public void setDriver_Sd(float driver_Sd) {
		this.driver_Sd = driver_Sd;
	}
	public float getDriver_Xlim() {
		return driver_Xlim;
	}
	public void setDriver_Xlim(float driver_Xlim) {
		this.driver_Xlim = driver_Xlim;
	}
	float driver_Xmax = 10;  // mm
    float driver_Xlim = 11;  // mm
    
    public float getDriver_Cms() {
		return driver_Cms;
	}
	public void setDriver_Cms(float driver_Cms) {
		this.driver_Cms = driver_Cms;
	}
	public float getDriver_Vd() {
		return driver_Vd;
	}
	public void setDriver_Vd(float driver_Vd) {
		this.driver_Vd = driver_Vd;
	}
	
	public int getDriver_size() {
		return driver_size;
	}
	public void setDriver_size(int driver_size) {
		this.driver_size = driver_size;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getDriver_model() {
		return driver_model;
	}
	public void setDriver_model(String driver_model) {
		this.driver_model = driver_model;
	}
	public int getDriver_RMSPower() {
		return driver_RMSPower;
	}
	public void setDriver_RMSPower(int driver_RMSPower) {
		this.driver_RMSPower = driver_RMSPower;
	}
	public int getDriver_ProgramPower() {
		return driver_ProgramPower;
	}
	public void setDriver_ProgramPower(int driver_ProgramPower) {
		this.driver_ProgramPower = driver_ProgramPower;
	}
	public int getDriver_FreqResponseLow() {
		return driver_FreqResponseLow;
	}
	public void setDriver_FreqResponseLow(int driver_FreqResponseLow) {
		this.driver_FreqResponseLow = driver_FreqResponseLow;
	}
	public int getDriver_FreqResponseHigh() {
		return driver_FreqResponseHigh;
	}
	public void setDriver_FreqResponseHigh(int driver_FreqResponseHigh) {
		this.driver_FreqResponseHigh = driver_FreqResponseHigh;
	}
	public float getDriver_Sensitivity() {
		return driver_Sensitivity;
	}
	public void setDriver_Sensitivity(float driver_Sensitivity) {
		this.driver_Sensitivity = driver_Sensitivity;
	}
	public float getDriver_VCDiameter() {
		return driver_VCDiameter;
	}
	public void setDriver_VCDiameter(float driver_VCDiameter) {
		this.driver_VCDiameter = driver_VCDiameter;
	}
	public float getDriver_MagWeight() {
		return driver_MagWeight;
	}
	public void setDriver_MagWeight(float driver_MagWeight) {
		this.driver_MagWeight = driver_MagWeight;
	}
	public float getDriver_NetWeight() {
		return driver_NetWeight;
	}
	public void setDriver_NetWeight(float driver_NetWeight) {
		this.driver_NetWeight = driver_NetWeight;
	}
	public float getDriver_Price() {
		return driver_Price;
	}
	public void setDriver_Price(float driver_Price) {
		this.driver_Price = driver_Price;
	}
	public float getDriver_Fs() {
		return driver_Fs;
	}
	public void setDriver_Fs(float driver_Fs) {
		this.driver_Fs = driver_Fs;
	}
	public float getDriver_Re() {
		return driver_Re;
	}
	public void setDriver_Re(float driver_Re) {
		this.driver_Re = driver_Re;
	}
	public float getDriver_Qes() {
		return driver_Qes;
	}
	public void setDriver_Qes(float driver_Qes) {
		this.driver_Qes = driver_Qes;
	}
	public float getDriver_Qms() {
		return driver_Qms;
	}
	public void setDriver_Qms(float driver_Qms) {
		this.driver_Qms = driver_Qms;
	}
	public float getDriver_Qts() {
		return driver_Qts;
	}
	public void setDriver_Qts(float driver_Qts) {
		this.driver_Qts = driver_Qts;
	}
	public float getDriver_Vas() {
		return driver_Vas;
	}
	public void setDriver_Vas(float driver_Vas) {
		this.driver_Vas = driver_Vas;
	}
	public float getDriver_Xmax() {
		return driver_Xmax;
	}
	public void setDriver_Xmax(float driver_Xmax) {
		this.driver_Xmax = driver_Xmax;
	}
    
    
    
}
