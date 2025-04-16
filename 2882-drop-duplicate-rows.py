import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    if not isinstance(customers, pd.DataFrame):
        raise TypeError("invalid")
    return customers.drop_duplicates(subset='email', keep='first')
