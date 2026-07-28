CREATE OR REPLACE PROCEDURE GetEmployee(
    p_id IN NUMBER
)
AS
    v_name VARCHAR2(100);
BEGIN
    SELECT employee_name INTO v_name
    FROM employees
    WHERE employee_id=p_id;

    DBMS_OUTPUT.PUT_LINE(v_name);
END;
/

BEGIN
    GetEmployee(1);
END;
/
