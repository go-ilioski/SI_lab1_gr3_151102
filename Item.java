class Item {
	int id;
	String name;
	double price;
	
	//TODO add variable.
	double danok;
	//TODO constructor
	public Item(id=id, name=name, price=price, danok=danok){
		this.id = id;
		this.name = name;
		this.price = price;
		this.danok = danok;
	}

	//TODO setters and getters
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	
	public setId(int id){
		this.id=id;
	}
	public setName(String name){
		this.name=name;
	}
	public setPrice(double price){
		this.price=price;
	}

	double taxReturn () {
		return (double)price*0.15;
	}
}