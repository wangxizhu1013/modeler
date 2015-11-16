package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
/**
 * 事件对象Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class M_Event extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;

	//事件名称
	public String name;
	
	//拼音
	public String pinyin;
	
	//拼音缩写
	public String pinyin_sx;
	
	//事件描述
	public String description;
	
	//实体和事件的关系
	@OneToMany(mappedBy="m_event")
	public List<M_Entity_Event> entity_event;
	
	//事件属性
	@ManyToMany(mappedBy="event")
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<M_Property> getProperty() {
		return property;
	}

	public void setProperty(List<M_Property> property) {
		this.property = property;
	}

	public List<M_Entity_Event> getEntity_event() {
		return entity_event;
	}

	public void setEntity_event(List<M_Entity_Event> entity_event) {
		this.entity_event = entity_event;
	}
}
