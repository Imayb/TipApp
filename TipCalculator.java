package com.example.tipcalculator;

public class TipCalculator {
    private double bill;
    private double tip;
    private double people;

    public TipCalculator(double newBill, double newTip, double newPeople) {
        setBill(newBill);
        setTip(newTip);
        setPeople(newPeople);
    }

    public void setBill (double newBill) {
        if (newBill > 0) {
            bill = newBill;
        }
    }

    public void setTip (double newTip) {
        if (newTip > 0) {
            tip = newTip;
        }
    }
        public void setPeople(double newPeople) {
            if (newPeople > 0){
                people = newPeople;
            }
        }

    public double getBill() {
        return bill;
    }

    public double getTip() {
        return tip;
    }

    public double getPeople() {
        return people;
    }

    public double taxAmount() {
        return (bill * .0813);
    }

    public double taxEach(){ return (bill * .0813 / people);}

    public double tipEach(){
        return (bill * tip / people);
    }

    public double totalAmount() {
        return (bill / people + tipEach() + taxEach());
    }

}
