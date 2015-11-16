package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Required;

/**
 * 领域对象Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class M_Domain extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//对象ID
	@Id
	@Required @Max(32)
	public String id;
	
	//域名称
	@Required @Max(30)
	public String name;
	
	//拼音
	@Required @Max(60)
	public String pinyin;
	
	//拼音缩写
	@Required @Max(30)
	public String pinyin_sx;
	
	//描述
	@Max(512)
	public String description;

	@ManyToMany(mappedBy = "domain")
	public List<M_Entity> entitys;
	
	@ManyToMany(mappedBy = "relationDomain")
	public List<M_Relation> relation;
	
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

	public List<M_Entity> getEntitys() {
		return entitys;
	}

	public void setEntitys(List<M_Entity> entitys) {
		this.entitys = entitys;
	}

	public List<M_Relation> getRelation() {
		return relation;
	}

	public void setRelation(List<M_Relation> relation) {
		this.relation = relation;
	}
}
