CREATE OR REPLACE PROCEDURE INVERTVALUE(
    idval IN NUMBER,
    column_nama IN VARCHAR2
) IS
    exist_value BOOLEAN;
BEGIN
    -- cek existing value
    EXECUTE IMMEDIATE '
        SELECT CASE WHEN ' || column_nama || ' IS NULL THEN NULL ELSE CASE WHEN ' || column_nama || ' = ''true'' THEN 1 ELSE 0 END END
        FROM "#TEST2"
        WHERE id = :id'
    INTO exist_value
    USING idval;

    -- Update the column value based on the existing value
    IF exist_value = 1 THEN
        EXECUTE IMMEDIATE '
            UPDATE "#TEST2"
            SET ' || column_nama || ' = ''FALSE''
            WHERE id = :id'
        USING idval;
    END IF;
END;


EXECUTE invertValue(1, 'B');