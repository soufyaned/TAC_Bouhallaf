package lille;


public class Money {
	private int value;
	private String currency;


	Money(int value, String currency)
	{
		this.value=value;
		this.currency=currency;
	}

	public int getValue()
	{
		return this.value;
	}

	public String getCurrency()
	{
		return this.currency;
	}

    public String toString() {
     	return this.getValue()+" ("+this.getCurrency()+")";
    }

    @Override
    public boolean equals(Object object){
    	if(object==null)
    		return false;
    	if (this.getClass() != object.getClass())
    	    return false;
    	Money obje = (Money) object;
			String cur=currency.toUpperCase();
			String curObje=obje.getCurrency().toUpperCase();
    	if((value==obje.getValue()) && (currency.equals(obje.getCurrency())))
    			return true;
    	if((value==obje.getValue()) && (cur.equals(curObje)))
		        return true;
    	if((value!=obje.getValue()) || (!currency.equals(obje.getCurrency())))
    		    return false;
    }

		@Override
		public int hashCode() {
		    super.hashCode();
		}

}
