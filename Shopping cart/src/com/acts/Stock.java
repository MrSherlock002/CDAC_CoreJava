package com.acts;

public class Stock {
	public int pen;
	public int pen_price=10;
	public int notebook;
	public int notebook_price=50;
	public int biskit;
	public int biskit_price=10;
	public int milk;
	public int milk_price=50;

	public Stock() {
		super();
	}
	public Stock(int pen, int pen_price, int notebook, int notebook_price, int biskit, int biskit_price, int milk,
			int milk_price) {
		super();
		this.pen = pen;
		this.pen_price = pen_price;
		this.notebook = notebook;
		this.notebook_price = notebook_price;
		this.biskit = biskit;
		this.biskit_price = biskit_price;
		this.milk = milk;
		this.milk_price = milk_price;
		System.out.println("Value Added: ");
	}
	public int getPen() {
		return pen;
	}
	public void setPen(int pen) {
		this.pen = pen;
	}
	public int getPen_price() {
		return pen_price;
	}
	public void setPen_price(int pen_price) {
		this.pen_price = pen_price;
	}
	public int getNotebook() {
		return notebook;
	}
	public void setNotebook(int notebook) {
		this.notebook = notebook;
	}
	public int getNotebook_price() {
		return notebook_price;
	}
	public void setNotebook_price(int notebook_price) {
		this.notebook_price = notebook_price;
	}
	public int getBiskit() {
		return biskit;
	}
	public void setBiskit(int biskit) {
		this.biskit = biskit;
	}
	public int getBiskit_price() {
		return biskit_price;
	}
	public void setBiskit_price(int biskit_price) {
		this.biskit_price = biskit_price;
	}
	public int getMilk() {
		return milk;
	}
	public void setMilk(int milk) {
		this.milk = milk;
	}
	public int getMilk_price() {
		return milk_price;
	}
	public void setMilk_price(int milk_price) {
		this.milk_price = milk_price;
	}
	
	
//	DataUtils x = new DataUtils();
//	{System.out.println(x.addData());}
}
