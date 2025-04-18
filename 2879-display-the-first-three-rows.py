import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    if not isinstance(employees, pd.DataFrame):
        raise TypeError("invalid")
    return employees.head(3)
