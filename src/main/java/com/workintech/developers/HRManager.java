package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(JuniorDeveloper dev) {
        for (int i = 0; i < juniorDeveloper.length; i++) {
            if(juniorDeveloper[i] == null) {
                juniorDeveloper[i] = dev;
                return;
            }
        }
        System.out.println("Developer list is full.");
    }

    public void addEmployee(MidDeveloper dev) {
        for (int i = 0; i < midDeveloper.length; i++) {
            if(midDeveloper[i] == null) {
                midDeveloper[i] = dev;
                return;
            }
        }
        System.out.println("Developer list is full.");
    }

    public void addEmployee(SeniorDeveloper dev) {
        for (int i = 0; i < seniorDeveloper.length; i++) {
            if(seniorDeveloper[i] == null) {
                seniorDeveloper[i] = dev;
                return;
            }
        }
        System.out.println("Developer list is full.");
    }

}
