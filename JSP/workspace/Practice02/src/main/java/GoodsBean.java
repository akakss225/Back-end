
public class GoodsBean {
	
	private String name;
	private String price;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String decription) {
		this.description = description;
	}
	public GoodsBean(String name, String price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	
}
