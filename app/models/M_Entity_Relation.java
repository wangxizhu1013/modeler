package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;

/**
 * 实体之间的关联关系Bean
 * @author wxz
 * @since 2015-11-11
 * @version 1.0
 */
@Entity
public class M_Entity_Relation extends Model{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	public M_Entity m_entity_from;
	@ManyToOne
	public M_Entity m_entity_to;
	@ManyToOne
	public M_Relation relation;
	public M_Entity getM_entity_from() {
		return m_entity_from;
	}
	public void setM_entity_from(M_Entity m_entity_from) {
		this.m_entity_from = m_entity_from;
	}
	public M_Entity getM_entity_to() {
		return m_entity_to;
	}
	public void setM_entity_to(M_Entity m_entity_to) {
		this.m_entity_to = m_entity_to;
	}
	public M_Relation getRelation() {
		return relation;
	}
	public void setRelation(M_Relation relation) {
		this.relation = relation;
	}
}
