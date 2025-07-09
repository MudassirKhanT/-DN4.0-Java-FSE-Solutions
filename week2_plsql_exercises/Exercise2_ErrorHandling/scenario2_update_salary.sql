CREATE OR REPLACE PROCEDURE UpdateSalary(
  p_employee_id NUMBER,
  p_percentage NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_percentage / 100)
  WHERE EmployeeID = p_employee_id;
  IF SQL%ROWCOUNT = 0 THEN
    DBMS_OUTPUT.PUT_LINE('Employee ID not found.');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Salary updated.');
  END IF;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/
