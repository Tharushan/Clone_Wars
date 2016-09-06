
public abstract class Item {
	private String name;
	private String description;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public void use(Personnage character);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
