package design_pattern.creational.prototype.demo1;

public interface Prototype extends Cloneable{
    Prototype clone() throws CloneNotSupportedException;
}
