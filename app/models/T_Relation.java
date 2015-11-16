package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.avaje.ebean.Model;

/**
 * 实体关系对象Bean
 * @author wxz
 * @since 2015-11-11
 * @version 1.0
 */
@Entity
public class T_Relation extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;
	
	//模型对象
	@ManyToOne
	public M_Relation m_relation;
	
	//实体对象
	@ManyToOne
	public T_Entity t_entity_from;
	
	//实体对象
	@ManyToOne
	public T_Entity t_entity_to;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public M_Relation getM_relation() {
		return m_relation;
	}

	public void setM_relation(M_Relation m_relation) {
		this.m_relation = m_relation;
	}

	public T_Entity getT_entity_from() {
		return t_entity_from;
	}

	public void setT_entity_from(T_Entity t_entity_from) {
		this.t_entity_from = t_entity_from;
	}

	public T_Entity getT_entity_to() {
		return t_entity_to;
	}

	public void setT_entity_to(T_Entity t_entity_to) {
		this.t_entity_to = t_entity_to;
	}
}
