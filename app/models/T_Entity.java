package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

/**
 * 实体Bean
 * @author wxz
 * @since 2015-11-11
 * @version 1.0
 */
@Entity
public class T_Entity extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//对象ID
	@Id
	public String id;
	//名称
	public String name;
	
	//拼音
	public String pinyin;
	
	//拼音缩写
	public String pingyin_sx;
	
	@ManyToOne
	public M_Entity mEntity;
	
	@OneToMany(mappedBy="owner")
	public List<T_Property> property;
	
	@OneToMany(mappedBy="t_entity_from")
	public List<T_Relation> from_relation;
	
	@OneToMany(mappedBy="t_entity_to")
	public List<T_Relation> to_relation;

	@OneToMany(mappedBy="t_entity_from")
	public List<T_Event> from_event;
	
	@OneToMany(mappedBy="t_entity_to")
	public List<T_Event> to_event;
	
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

	public String getPingyin_sx() {
		return pingyin_sx;
	}

	public void setPingyin_sx(String pingyin_sx) {
		this.pingyin_sx = pingyin_sx;
	}

	public M_Entity getmEntity() {
		return mEntity;
	}

	public void setmEntity(M_Entity mEntity) {
		this.mEntity = mEntity;
	}

	public List<T_Property> getProperty() {
		return property;
	}

	public void setProperty(List<T_Property> property) {
		this.property = property;
	}

	public List<T_Relation> getFrom_relation() {
		return from_relation;
	}

	public void setFrom_relation(List<T_Relation> from_relation) {
		this.from_relation = from_relation;
	}

	public List<T_Relation> getTo_relation() {
		return to_relation;
	}

	public void setTo_relation(List<T_Relation> to_relation) {
		this.to_relation = to_relation;
	}

	public List<T_Event> getFrom_event() {
		return from_event;
	}

	public void setFrom_event(List<T_Event> from_event) {
		this.from_event = from_event;
	}

	public List<T_Event> getTo_event() {
		return to_event;
	}

	public void setTo_event(List<T_Event> to_event) {
		this.to_event = to_event;
	}
}
