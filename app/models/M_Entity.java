package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

/**
 * 实体对象Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class M_Entity extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//对象ID
	@Id
	public String id;
	
	//实体名称
	public String name;
	
	//拼音
	public String pinyin;
	
	//拼音缩写
	public String pinyin_sx;
	
	//实体描述
	public String description;
	
	@ManyToMany
	public List<M_Domain> domain;

	//实体属性
	@ManyToMany(mappedBy="entity")
	public List<M_Property> property;
	
	//实体关系
	@OneToMany(mappedBy="m_entity_from")
	public List<M_Entity_Relation> relationFrom;
	
	//实体关系
	@OneToMany(mappedBy="m_entity_to")
	public List<M_Entity_Relation> relationTo;
	
	//表实体
	@OneToMany(mappedBy="mEntity")
	public List<T_Entity> tEntity;
	
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

	public List<M_Domain> getDomain() {
		return domain;
	}

	public void setDomain(List<M_Domain> domain) {
		this.domain = domain;
	}

	public List<M_Property> getProperty() {
		return property;
	}

	public void setProperty(List<M_Property> property) {
		this.property = property;
	}

	public List<T_Entity> gettEntity() {
		return tEntity;
	}

	public void settEntity(List<T_Entity> tEntity) {
		this.tEntity = tEntity;
	}

	public List<M_Entity_Relation> getRelationFrom() {
		return relationFrom;
	}

	public void setRelationFrom(List<M_Entity_Relation> relationFrom) {
		this.relationFrom = relationFrom;
	}

	public List<M_Entity_Relation> getRelationTo() {
		return relationTo;
	}

	public void setRelationTo(List<M_Entity_Relation> relationTo) {
		this.relationTo = relationTo;
	}
}
