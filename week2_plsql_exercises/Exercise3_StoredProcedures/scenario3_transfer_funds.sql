CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from NUMBER,
  p_to NUMBER,
  p_amount NUMBER
) AS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from;
  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient funds.');
    RETURN;
  END IF;

  UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from;
  UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer completed.');
END;
/
