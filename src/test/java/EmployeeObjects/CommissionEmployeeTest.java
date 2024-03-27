package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CommissionEmployeeTest {

    @Test
    void increaseSales() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.increaseSales(5000); // Adding positive sales
        assertEquals(5000, emp.getSales());

        emp.increaseSales(-2000); // Adding negative sales
        assertEquals(5000, emp.getSales()); // Sales should remain the same
    }

    @Test
    void holidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        assertEquals(0, emp.holidayBonus());
    }

    @Test
    void annualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());
    }
}
