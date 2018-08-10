public class JerryCalculater {
    Boolean calculateResult = true;
    Double result;

    public double addMethod(Double a , Double b){
        result = a+b;
        return result;
    }
    public double minusMethod(Double a, Double b){
        result = a - b;
        return result;
    }
    public double timesMethod(Double a, Double b){
        result = a*b;
        return result;
    }
    public void devideMethod(Double a, Double b){
        if (b==0){
            calculateResult = false;
        }else {
            result = a/b;
        }

    }
}
