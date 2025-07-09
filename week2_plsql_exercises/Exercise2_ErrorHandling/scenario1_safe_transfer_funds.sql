CREATE OR REPLACE PROCEDURE SafeTransferFunds(
  p_from_account NUMBER,
  p_to_account NUMBER,
  p_amount NUMBER
) AS
  insufficient_balance EXCEPTION;
BEGIN
  -- Check if balance is sufficient
  DECLARE
    v_balance NUMBER;
  BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;
    IF v_balance < p_amount THEN
      RAISE insufficient_balance;
    END IF;
  END;

  -- Perform transfer
  UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_account;
  UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_account;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer successful.');
EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds.');
    ROLLBACK;
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Unexpected error: ' || SQLERRM);
    ROLLBACK;
END;
/
