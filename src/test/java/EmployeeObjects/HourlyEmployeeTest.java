package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    @Test
    void increaseHoursIsPositive(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(10);
        emp.increaseHours(-5);
        assertEquals(10, emp.getHoursWorked());
    }
    @Test
    void annualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49, emp.getWage(), 0.01);
    }

    @Test
    void calculateWeeklyPay_NormalHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35); // Sending 35 hours
        assertEquals(1149.75, emp.calculateWeeklyPay(), 0.01);
    }

    @Test
    void calculateWeeklyPay_OT() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45); // Sending 45 hours
        assertEquals(1560.38, emp.calculateWeeklyPay(), 0.01);
    }
}
