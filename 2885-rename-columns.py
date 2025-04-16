import pandas as pd

def renameColumns(students: pd.DataFrame) -> pd.DataFrame:
    if not isinstance(students, pd.DataFrame):
        raise TypeError("invalid")
    return students.rename(columns={'id': 'student_id', 'first': 'first_name', 'last': 'last_name', 'age': 'age_in_years'})
