package com.calculate_tax_rakesh;

class Rakesh_TaxCalculate {
    private float amount,firsttax,secondtax,totaltax,salary;

    public Rakesh_TaxCalculate(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float totalAmount()
    {
        salary=amount*12;
        totaltax= (float) (this.salary*0.01);
        return (totaltax);
    }
    public float totalAmount2() {
        salary=amount*12;
        firsttax= (float) (200000*0.01);
        totaltax= (float) (firsttax+((this.salary-200000)*(0.15)));
        return (totaltax);
    }

    public float totalAmount3() {
        salary=amount*12;
        firsttax= (float) (200000*0.01);
        secondtax= (float) ( firsttax+(150000*0.15));
        totaltax= (float) (secondtax+((this.salary-350000)*0.25));
        return (totaltax);
    }
}

