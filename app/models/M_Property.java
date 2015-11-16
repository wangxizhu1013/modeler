package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

/**
 * 属性值类型Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class M_Property extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;
	//属性名称
	public String name;
	
	//拼音
	public String pinyin;
	
	//拼音缩写
	public String pinyin_sx;
	
	//属性描述
	public String description;
	
	//实体对象
	@ManyToMany
	public List<M_Entity> entity;
	
	//属性事件
	@ManyToMany
	public List<M_Event> event;
	
	@OneToMany(mappedBy="mProperty")
	public List<T_Property> tProperty;
	
	//属性类型
	@ManyToOne
	public M_Property_Value_Type type;
	
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

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getPinyin_sx() {
		return pinyin_sx;
	}

	public void setPinyin_sx(String pinyin_sx) {
		this.pinyin_sx = pinyin_sx;
	}

	public List<M_Entity> getEntity() {
		return entity;
	}

	public void setEntity(List<M_Entity> entity) {
		this.entity = entity;
	}
	
	public List<M_Event> getEvent() {
		return event;
	}

	public void setEvent(List<M_Event> event) {
		this.event = event;
	}

	public M_Property_Value_Type getType() {
		return type;
	}

	public void setType(M_Property_Value_Type type) {
		this.type = type;
	}

	public List<T_Property> gettProperty() {
		return tProperty;
	}

	public void settProperty(List<T_Property> tProperty) {
		this.tProperty = tProperty;
	}
}
