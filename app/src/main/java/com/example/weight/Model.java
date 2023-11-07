package com.example.weight;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Model extends BaseObservable {
    String forkg,customweight,result;

    public Model(String forkg, String customweight,String result) {
        this.forkg = forkg;
        this.customweight = customweight;
        this.result = result;
    }
    public Model (){

    }

    @Bindable
    public String getForkg() {
        return forkg;
    }

    public void setForkg(String forkg) {
        this.forkg = forkg;
        notifyPropertyChanged(BR.forkg);
    }

    @Bindable
    public String getCustomweight() {
        return customweight;
    }

    public void setCustomweight(String customweight) {
        this.customweight = customweight;
        notifyPropertyChanged(BR.customweight);
    }

    @Bindable
    public String getResult(){
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    public void onCalculateClick() {
        try {
            double num1 = Double.parseDouble(forkg);
            double num2= Double.parseDouble(customweight);
            double difference = num1*num2;
            setResult("Result"+difference);


        } catch (NumberFormatException e) {
            setCustomweight("Invalid input");
        }

    }
}


