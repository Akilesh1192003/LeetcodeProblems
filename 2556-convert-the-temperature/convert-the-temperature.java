class Solution {
    public double[] convertTemperature(double celsius) {
       double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        double[] res=new double[2];
        res[0]=Kelvin;
        res[1]=Fahrenheit;
        return res;
    }
}