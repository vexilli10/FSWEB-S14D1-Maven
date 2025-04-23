package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[10];
        midDevelopers = new MidDeveloper[10];
        seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing HR tasks");
        setSalary(getSalary() + 1500);
    }

    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index for junior developers");
        } else if (juniorDevelopers[index] != null) {
            System.out.println("Junior slot " + index + " is already occupied");
        } else {
            juniorDevelopers[index] = dev;
        }
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index for mid developers");
        } else if (midDevelopers[index] != null) {
            System.out.println("Mid slot " + index + " is already occupied");
        } else {
            midDevelopers[index] = dev;
        }
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index for senior developers");
        } else if (seniorDevelopers[index] != null) {
            System.out.println("Senior slot " + index + " is already occupied");
        } else {
            seniorDevelopers[index] = dev;
        }
    }
}
