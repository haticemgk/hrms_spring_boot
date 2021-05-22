package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name= "job_positions")
public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name="job_positions_id")
	private int id;
	
	@Column(name="job_positions_position")
	private String position;

}
