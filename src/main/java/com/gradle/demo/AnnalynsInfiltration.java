package com.gradle.demo;

public class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake|archerIsAwake|prisonerIsAwake)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake==true && archerIsAwake==false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent)
        {
            if(archerIsAwake==true && knightIsAwake==true)
            {
                return false;
            }
            else if(archerIsAwake==true && knightIsAwake==false)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            if(archerIsAwake==false && knightIsAwake==false && prisonerIsAwake==true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String args[])
    {
        AnnalynsInfiltration obj=new AnnalynsInfiltration();
        boolean knightIsAwake = true;
        System.out.println(obj.canFastAttack(knightIsAwake));
        knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println(obj.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println(obj.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        knightIsAwake = false;
        archerIsAwake = true;
        prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(obj.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}
