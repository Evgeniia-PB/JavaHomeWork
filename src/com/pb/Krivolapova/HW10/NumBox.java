package com.pb.Krivolapova.HW10;

public class NumBox <T extends Number>{
    private final T[] numbers;

    public NumBox(int size){
        numbers = (T[]) new Number[size];
    }

    public void get(int index){
        System.out.println(numbers[index]);
    }

    public void add(T num) throws FullArrayException {
        if(!fullArray()) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == null) {
                    numbers[i] = num;
                    break;
                }
            }
        } else {
            throw new FullArrayException("Массив заполнен. Ошибка при добавлении "+num);
        }
    }

    public int length(){
        int result=0;
        for(T number: numbers){
            if(number!=null) result++;
        }
        return result;
    }

    public double average(){
        return sum()/length();
    }

    public double sum(){
        double result=0;
        for(T number: numbers){
            if(number!=null) result+=number.doubleValue();
        }
        return result;
    }

    private boolean fullArray(){
        for(T number: numbers){
            if(number==null) return false;
        }
        return true;
    }
    public T max(){
        T max = null;
        for(int i=0;i<length();i++){
            for(int y=0;y<length();y++){
                if(numbers[y].doubleValue()>numbers[i].doubleValue()) max=numbers[y];
            }
        }
        return max;
    }
}