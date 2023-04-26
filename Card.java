public class Card implements Comparable<Card>
{
  // I.V.s are suit and rank
	public int suit;
	public int rank;
	
	@Override
	public int compareTo(Card o)
	{
	     if (this.rank == (o.rank))
	            return 0;
	     else if ((this.rank) > (o.rank))
	            return 1;
	     else
	           return -1;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	

}
