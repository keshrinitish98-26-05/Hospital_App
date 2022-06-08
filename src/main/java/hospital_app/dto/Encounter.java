package hospital_app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int encounterId;
	private LocalDateTime admitDateTime;
	private LocalDateTime dischargeDateTime;
	private String reason;
	@ManyToOne
	@JoinColumn
	private Person person;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@OneToMany(mappedBy = "encounter",cascade = CascadeType.ALL)
	private List<Observation> observations;
	@OneToMany(mappedBy = "encounter",cascade = CascadeType.ALL)
	private List<MedOrder> medOrders;
	public int getEncounterId() {
		return encounterId;
	}
	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}
	public LocalDateTime getAdmitDateTime() {
		return admitDateTime;
	}
	public void setAdmitDateTime(LocalDateTime admitDateTime) {
		this.admitDateTime = admitDateTime;
	}
	public LocalDateTime getDischargeDateTime() {
		return dischargeDateTime;
	}
	public void setDischargeDateTime(LocalDateTime dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
	public List<MedOrder> getMedOrders() {
		return medOrders;
	}
	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}
	
	
	

}
