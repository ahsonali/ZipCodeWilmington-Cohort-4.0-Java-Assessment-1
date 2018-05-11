package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */

//1------------------------------------------------------------------------------------------------------
public class Cat extends Pet {

    //private Integer catAge = 0;
    //private String name = "Cat name";

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        super(name, age);
        //this.name = name;
        //this.catAge = age;

    }

//1-------------------------------------------------------------------------------------------------------

    /**
     * @param age age of this Cat
     */

//2-------------------------------------------------------------------------------------------------------
    public Cat(Integer age)
    {
        super("Cat name", age);
        //this.catAge = age;
        //this.name = name;
    }
//2--------------------------------------------------------------------------------------------------------

    /**
     * @param name name of this Cat
     */

//3---------------------------------------------------------------------------------------------------------
    public Cat(String name)
    {

        super(name);
        //this.name = name;
    }
//3---------------------------------------------------------------------------------------------------------


    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */

//4-------------------------------------------------------------------------------------------------------------
    public Cat() {

        super("Cat name", 0);
        //this.name = "Cat name";
        //this.catAge = 0;
    }
//4----------------------------------------------------------------------------------------------------------
    /**
     * @return meow as a stringD
     */



//5------------------------------------------------------------------------------
    public String speak() {
        return "Meow";
    }
//5------------------------------------------------------------------------------


//6---------------------------------------------------------------------------------
//6 does not have a test case
    //TODO and DID
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public Integer getAge()
    {
        return this.age;
    }

//6-------------------------------------------------------------------------------
}