package com.rafaffs.dados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "massas")
public class Bdd_massas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDMASSAS;

    private String NAME_PRODUCT;
    private String CUSTOMIZATION;
    private String DISPLAY;
    private String DISPLAY_RESOLUTION;
    private String DISPLAY_SIZE;
    private String MEMORY;
    private String OPERATING_SYSTEM;
    private String PROCESSOR;
    private String TOUCHSCREEN;
    private String WEIGHT;
    private String COLOR;

    public String getNAME_PRODUCT() {
        return NAME_PRODUCT;
    }

    public String setNAME_PRODUCT(String NAME_PRODUCT) {
        this.NAME_PRODUCT = NAME_PRODUCT;
        return NAME_PRODUCT;
    }

    public int getIDMASSAS() {
        return IDMASSAS;
    }

    public void setIDMASSAS(int IDMASSAS) {
        this.IDMASSAS = IDMASSAS;
    }

    public String getCUSTOMIZATION() {
        return CUSTOMIZATION;
    }

    public void setCUSTOMIZATION(String CUSTOMIZATION) {
        this.CUSTOMIZATION = CUSTOMIZATION;
    }

    public String getDISPLAY() {
        return DISPLAY;
    }

    public void setDISPLAY(String DISPLAY) {
        this.DISPLAY = DISPLAY;
    }

    public String getDISPLAY_RESOLUTION() {
        return DISPLAY_RESOLUTION;
    }

    public void setDISPLAY_RESOLUTION(String DISPLAY_RESOLUTION) {
        this.DISPLAY_RESOLUTION = DISPLAY_RESOLUTION;
    }

    public String getDISPLAY_SIZE() {
        return DISPLAY_SIZE;
    }

    public void setDISPLAY_SIZE(String DISPLAY_SIZE) {
        this.DISPLAY_SIZE = DISPLAY_SIZE;
    }

    public String getMEMORY() {
        return MEMORY;
    }

    public void setMEMORY(String MEMORY) {
        this.MEMORY = MEMORY;
    }

    public String getOPERATING_SYSTEM() {
        return OPERATING_SYSTEM;
    }

    public void setOPERATING_SYSTEM(String OPERATING_SYSTEM) {
        this.OPERATING_SYSTEM = OPERATING_SYSTEM;
    }

    public String getPROCESSOR() {
        return PROCESSOR;
    }

    public void setPROCESSOR(String PROCESSOR) {
        this.PROCESSOR = PROCESSOR;
    }

    public String getTOUCHSCREEN() {
        return TOUCHSCREEN;
    }

    public void setTOUCHSCREEN(String TOUCHSCREEN) {
        this.TOUCHSCREEN = TOUCHSCREEN;
    }

    public String getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(String WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public int getId() {
        return IDMASSAS;
    }

    public void setId(int id) {
        this.IDMASSAS = id;
    }

}