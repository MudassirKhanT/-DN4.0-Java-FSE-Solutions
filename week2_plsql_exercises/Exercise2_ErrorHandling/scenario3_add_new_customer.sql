CREATE OR REPLACE PROCEDURE AddNewCustomer(
  p_customer_id NUMBER,
  p_name VARCHAR2,
  p_dob DATE,
  p_balance NUMBER
) AS
BEGIN
  INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
  VALUES (p_customer_id, p_name, p_dob, p_balance, SYSDATE);
  DBMS_OUTPUT.PUT_LINE('Customer added.');
EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Customer ID already exists.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error adding customer: ' || SQLERRM);
END;
/
