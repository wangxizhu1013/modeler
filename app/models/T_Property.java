package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;

/**
 * 属性Bean
 * @author wxz
 * @since 2015-11-11
 * @version 1.0
 */
@Entity
public class T_Property extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;
	
	//属性值
	public String value;
	
	//属性值类型
	public String valueType;
	
	//属性所属类型
	public int ownerType;
	
	//实体对象
	@ManyToOne
	public T_Entity owner;
	
	//实体对象
	@ManyToOne
	public T_Event OWNER;
	
	//模型属性对象
	@ManyToOne
	public M_Property mProperty;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public int getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(int ownerType) {
		this.ownerType = ownerType;
	}

	public M_Property getmProperty() {
		return mProperty;
	}

	public void setmProperty(M_Property mProperty) {
		this.mProperty = mProperty;
	}
}
