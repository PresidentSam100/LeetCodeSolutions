import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    if not isinstance(student_data, list):
        raise TypeError("invalid")
    return pd.DataFrame(student_data, columns=["student_id", "age"])
