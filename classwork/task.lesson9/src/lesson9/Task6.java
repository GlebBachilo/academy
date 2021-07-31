package lesson9;

import java.io.Serializable;

public class Task6<T extends Comparable<String>, V, K extends Number> {
    private T variableT;
    private V variableV;
    private K variableK;

    public Task6() {
        super();
    }

    public Task6(T variableT, V variableV, K variableK) {
        super();
        this.variableT = variableT;
        this.variableK = variableK;
        this.variableV = variableV;
    }

    public T getVariableT() {
        return variableT;
    }

    public void setVariableT(T variableT) {
        this.variableT = variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public void setVariableV(V variableV) {
        this.variableV = variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void setVariableK(K variableK) {
        this.variableK = variableK;
    }

    public String getTName() {
        if (variableT == null) {
            return null;
        }
        return variableT.getClass().getName();
    }

    public String getVName() {
        if (variableV == null) {
            return null;
        }
        return variableV.getClass().getName();
    }

    public String getKName() {
        if (variableK == null) {
            return null;
        }
        return variableK.getClass().getName();
    }

    public static void main(String[] args) {
        Task6<String, Cat, Integer> demo = new Task6<>("dhjksd ", new Cat(), 343425);
        System.out.println(demo.getVName());
        System.out.println(demo.getKName());
        System.out.println(demo.getTName());


    }
}
