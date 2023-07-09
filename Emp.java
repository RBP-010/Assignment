package assignment;

import static assignment.Employeewages.*;

public class Emp {
    public static void main(String[] args) {
        int totalemphrs = 0, totalempwage = 0, totalworkingdays = 0;
        if (totalemphrs <= max_hrs_in_month && totalworkingdays < Employeewages.num_working_days) {
            int emphrs = 0;
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case is_full_time:
                    emphrs = 8;
                    break;
                case is_part_time:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }
            totalemphrs += emphrs;
            System.out.println("Day#: " + totalworkingdays + " emp hr:" + emphrs);
        }
        totalempwage = totalemphrs + emp_rate_per_hour;
        System.out.println("total emp wage:" + totalempwage);
    }
}
