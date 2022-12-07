public interface Prototype extends Cloneable{
    /*
        Specify the kinds of objects to create using a prototypical instance,
        and create new objects by copying this prototype.
    */
    Prototype clone();

}
