DECLARE
  CURSOR cur_accounts IS SELECT AccountID FROM Accounts;
BEGIN
  FOR acc IN cur_accounts LOOP
    UPDATE Accounts SET Balance = Balance - 50 WHERE AccountID = acc.AccountID;
  END LOOP;
  COMMIT;
END;
/
