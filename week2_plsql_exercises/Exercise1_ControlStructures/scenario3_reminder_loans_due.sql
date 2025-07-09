BEGIN
  FOR l IN (SELECT LoanID, CustomerID, EndDate 
            FROM Loans 
            WHERE EndDate <= SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || l.LoanID ||
                         ' for Customer ' || l.CustomerID ||
                         ' is due on ' || TO_CHAR(l.EndDate));
  END LOOP;
END;
/
