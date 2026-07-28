DECLARE
    n NUMBER:=10;
BEGIN
    IF MOD(n,2)=0 THEN
        DBMS_OUTPUT.PUT_LINE('Even');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Odd');
    END IF;
END;
/
