DECLARE
  CURSOR cur_loans IS SELECT LoanID, InterestRate FROM Loans;
BEGIN
  FOR loan IN cur_loans LOOP
    UPDATE Loans 
    SET InterestRate = loan.InterestRate + 0.5 
    WHERE LoanID = loan.LoanID;
  END LOOP;
  COMMIT;
END;
/
