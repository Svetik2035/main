package day48;

public interface  Bounceable {


    /**ALL THE MEMBERS MUST BE PUBLIC
     *  THIS IS ELUSIVELY  TO INTERFACE TYPE
     * if we do not add any part of public static final for the field
     * all interface fields are automatically public static final
     */
    public static final double GRAVITY = 9.81;
    //every member of interface automatically public
    //if no access modifier is given
    //all the methods with no body automatically public abstract
    //void bounce();

    public abstract void bounce();



}
