import pandas as pd

def count_unique_subjects(teacher: pd.DataFrame) -> pd.DataFrame:
    return teacher[['teacher_id', 'subject_id']].drop_duplicates().groupby('teacher_id').size().reset_index(name='cnt')
