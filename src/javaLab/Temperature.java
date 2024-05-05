package javaLab;

public class Temperature {

    private int minTemperature, maxTemperature, currentTemperature;

    public Temperature(){
        minTemperature = 40;
        maxTemperature = 50;
       calculateTemperature();
    }
    public Temperature(int min,int max){
        minTemperature = min;
        maxTemperature = max;
       calculateTemperature();
    }
    private void calculateTemperature()
    {
        currentTemperature = (minTemperature + maxTemperature) / 2;
//        System.out.println(currentTemperature);
    }
    public void up(){
        currentTemperature = Math.min(maxTemperature,currentTemperature+1);
    }
    public void down(){
        currentTemperature = Math.max(minTemperature,currentTemperature-1);
    }
    public int getCurrentTemperature(){
        return currentTemperature;
    }

}
