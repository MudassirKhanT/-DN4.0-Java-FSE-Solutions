DECLARE
  CURSOR cur_transactions IS
    SELECT AccountID, Amount, TransactionDate 
    FROM Transactions 
    WHERE TO_CHAR(TransactionDate, 'MM-YYYY') = TO_CHAR(SYSDATE, 'MM-YYYY');

BEGIN
  FOR txn IN cur_transactions LOOP
    DBMS_OUTPUT.PUT_LINE('Account ' || txn.AccountID || 
      ' transacted ' || txn.Amount || ' on ' || TO_CHAR(txn.TransactionDate));
  END LOOP;
END;
/
