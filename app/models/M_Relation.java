package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;

/**
 * 实体关系对象Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class M_Relation extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;
	
	//关系名称
	public String name;
	
	//模型对象
	@ManyToMany
	public List<M_Domain> relationDomain;
	
	//拼音
	public String pinyin;
	
	//拼音缩写
	public String pinyin_sx;
	
	//关系描述
	public String desc;
	
	//关系方向
	public boolean direction;
	
	@OneToMany(mappedBy="relation")
	public List<M_Entity_Relation> entity_relation;
	
	@OneToMany(mappedBy="m_relation")
	public List<T_Relation> relation;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isDirection() {
		return direction;
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
	}

	public List<M_Domain> getRelationDomain() {
		return relationDomain;
	}

	public void setRelationDomain(List<M_Domain> relationDomain) {
		this.relationDomain = relationDomain;
	}

	public List<M_Entity_Relation> getEntity_relation() {
		return entity_relation;
	}

	public void setEntity_relation(List<M_Entity_Relation> entity_relation) {
		this.entity_relation = entity_relation;
	}

	public List<T_Relation> getRelation() {
		return relation;
	}

	public void setRelation(List<T_Relation> relation) {
		this.relation = relation;
	}
}
