package Generics;

import static java.lang.Thread.sleep;

public class GenericClassExample<T> {
    private T value;

    public GenericClassExample(T value){
        this.value = value;
    }
    public T getT(){
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
        GenericClassExample<Integer> integerGenericExample = new GenericClassExample<>(1);
        Integer valueInteger = integerGenericExample.getT();
        System.out.println(valueInteger);
        sleep(1000);
        GenericClassExample<String> stringGenericExample = new GenericClassExample<>("word");
        String valueString = stringGenericExample.getT();
        System.out.println(valueString);
    }
}
