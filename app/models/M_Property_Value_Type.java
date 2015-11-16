package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

/**
 * 属性值类型Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class M_Property_Value_Type extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;
	//类型名称
	public String name;
	
	//属性类型
	public String value_type;
	
	//属性对象
	@OneToMany(mappedBy="type")
	public List<M_Property> property;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue_type() {
		return value_type;
	}

	public void setValue_type(String value_type) {
		this.value_type = value_type;
	}

	public List<M_Property> getProperty() {
		return property;
	}

	public void setProperty(List<M_Property> property) {
		this.property = property;
	}
}
