import pandas as pd

def invalid_tweets(tweets: pd.DataFrame) -> pd.DataFrame:
    if not isinstance(tweets, pd.DataFrame):
        raise TypeError("invalid")
    return tweets.loc[tweets['content'].str.len() > 15, ['tweet_id']]
