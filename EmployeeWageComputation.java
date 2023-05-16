package com.employeewage;

import java.util.Random;

public class EmployeeWageComputation
{
    int Attend1,Attend2;
    int EmpRatePerHr,EmpHrs,w;

    EmployeeWageComputation()
    {
        Random r = new Random();
        Attend1 =r.nextInt(2);
        Attend2 = r.nextInt(2);
    }

    void attendance()
    {
        if(Attend1==1)
        {
            System.out.println("Employee is present");
        }
        else if (Attend1==0)
        {
            System.out.println("Employee is absent");
        }
    }
    void wage()
    {
        if(Attend1==1 && Attend2==1)
        {
            EmpRatePerHr = 20;
            EmpHrs = 8;
            w = EmpRatePerHr * EmpHrs;
            System.out.println("FullTime employee and Employee Wage is :-" + w);
        }
        else if (Attend1==1 && Attend2==0)
        {
            EmpRatePerHr = 20;
            EmpHrs = 4;
            w = EmpRatePerHr * EmpHrs;
            System.out.println("PartTime employee and Employee Wage is :-" + w);
        }
        else if(Attend1==0 && Attend2 == 0  )
        {
            System.out.println("Employee Wage is :-0");
        }
        else if(Attend1==0 && Attend2 == 1)
        {
            System.out.println("Employee Wage is :-0");
        }


    }
    void switchStatement()
    {
        switch (Attend2)
        {
            case 1:
                EmpRatePerHr = 20;
                EmpHrs = 8;
                w = EmpRatePerHr * EmpHrs;
                System.out.println("Using Switch Statement ----------Employee Wage:-" + w);
                break;
            case 0:
                EmpRatePerHr = 20;
                EmpHrs = 4;
                w = EmpRatePerHr * EmpHrs;
                System.out.println("Using Switch Statement ----------Employee Wage:-" + w);
                break;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWageComputation E = new EmployeeWageComputation();
        E.attendance();
        E.wage();
        E.switchStatement();


    }
}
