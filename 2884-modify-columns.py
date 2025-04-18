import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    if not isinstance(employees, pd.DataFrame):
        raise TypeError("invalid")
    if 'salary' not in employees.columns:
        raise KeyError("invalid")
    if not pd.api.types.is_numeric_dtype(employees['salary']):
        raise ValueError("invalid")
    employees['salary'] *= 2
    return employees
