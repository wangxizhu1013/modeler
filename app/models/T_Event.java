package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.joda.time.DateTime;

import com.avaje.ebean.Model;
/**
 * 事件对象Bean
 * @author wxz
 * @since 2015-11-09
 * @version 1.0
 */
@Entity
public class T_Event extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public String id;

	//事件发生时间
	public DateTime time;
	
	@ManyToOne
	public M_Event m_enent;
	
	@ManyToOne
	public T_Entity t_entity_from;
	
	@ManyToOne
	public T_Entity t_entity_to;
	
	@OneToMany(mappedBy="OWNER")
	public List<T_Property> property;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DateTime getTime() {
		return time;
	}

	public void setTime(DateTime time) {
		this.time = time;
	}

	public M_Event getM_enent() {
		return m_enent;
	}

	public void setM_enent(M_Event m_enent) {
		this.m_enent = m_enent;
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

	public List<T_Property> getProperty() {
		return property;
	}

	public void setProperty(List<T_Property> property) {
		this.property = property;
	}
}
